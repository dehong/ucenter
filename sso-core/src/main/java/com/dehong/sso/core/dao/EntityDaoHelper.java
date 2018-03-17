package com.dehong.sso.core.dao;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.seasar.doma.Column;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
import org.seasar.doma.Version;
import org.seasar.doma.jdbc.builder.DeleteBuilder;
import org.seasar.doma.jdbc.builder.InsertBuilder;
import org.seasar.doma.jdbc.builder.SelectBuilder;
import org.seasar.doma.jdbc.builder.UpdateBuilder;

public class EntityDaoHelper {
	
	private static Map<Class<?>, EntityDaoHelper> cache = new HashMap<Class<?>, EntityDaoHelper>();
	
	private String tableName;
	private Class<?> clazz;

	private List<String> keyList;
	private List<Key> keyWithType;
	private Map<String, String> columns;
	private String updateCountProName;
	private String updateCountColumnName;
	
	public static EntityDaoHelper getHelper(Class<?> clazz){
		if(cache.containsKey(clazz)) return cache.get(clazz);
		else {
			EntityDaoHelper helper = new EntityDaoHelper(clazz);
			cache.put(clazz, helper);
			return helper;
		}
	}
		
	private EntityDaoHelper(Class<?> clazz){
		init(clazz);
	}
	
	private void init(Class<?> clazz){
		this.clazz = clazz;
		Table ta = clazz.getAnnotation(Table.class);
		this.tableName = ta.name();
		keyAndColumn();	
	}
	
	private void keyAndColumn(){
		keyList = new ArrayList<>();
		columns = new HashMap<>();
		keyWithType = new ArrayList<>();
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields){
			Column c = f.getAnnotation(Column.class);
			if(c == null) continue;
			String columnName = c.name();
			columns.put(f.getName(), columnName);
			if(f.getAnnotation(Id.class) != null){
				keyList.add(f.getName());
				Key key = new Key();
				key.name = f.getName();
				GeneratedValue gv = f.getAnnotation(GeneratedValue.class);
				if(gv == null){
					key.type = Key.ID_TYPE_NULL;
				} else if(gv.strategy() == GenerationType.SEQUENCE){
					key.type = Key.ID_TYPE_SEQ;
					SequenceGenerator sg = f.getAnnotation(SequenceGenerator.class);
					key.seq = sg.sequence();
				} else{
					key.type = Key.ID_TYPE_IDENTITY;
				}
				keyWithType.add(key);
			}
			if(f.getAnnotation(Version.class) != null){
				updateCountColumnName = columnName;
				updateCountProName = f.getName();
			}
		}
	}
	
	public Map<String, Object> getFieldValue(Object entity, String... proNames){
		return getFieldValue(entity, new ArrayList<>(Arrays.asList(proNames)));
	}
	
	public Map<String, Object> getFieldValue(Object entity, List<String> proNames){
		if(proNames.isEmpty()){
			proNames.addAll(columns.keySet());
			proNames.removeAll(keyList);
		}
		Map<String, Object> result = new HashMap<String, Object>(proNames.size());
		Field[] fields = clazz.getDeclaredFields();
		
		for(String proName : proNames){
			for(Field field : fields){
				field.setAccessible(true);
				if(field.getName().equals(proName)){
					Object val = null;
					try {
						val = field.get(entity);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					result.put(columns.get(proName), val);
					break;
				}
			}
		}
		return result;
	}

	public SelectBuilder setSelectBuilderById(SelectBuilder builder, Object id){
		String columnNames = collectionToString(columns.values());
		builder.sql("SELECT ");
		builder.sql(columnNames);
		builder.sql("FROM");
		builder.sql(tableName);
		builder.sql("WHERE");
		builder.sql(columns.get(keyList.get(0)) + " = ");
		if(id instanceof String){
    		builder.param(String.class, (String) id);
    	} else if(id instanceof BigDecimal){
    		builder.param(BigDecimal.class, (BigDecimal) id);
    	} else if(id instanceof Date){
    		builder.param(Date.class, (Date) id);
    	} else if(id instanceof Boolean){
    		builder.param(Boolean.class, (Boolean) id);
    	} else {
    		builder.param(String.class, id.toString());
    	}
		
		return builder;
	}
	
	public SelectBuilder setSelectBuilder(SelectBuilder builder, Map<String, Object> condition){
		List<String> nullValuesProperties = nullValuesProperties(condition);
		for(String key : nullValuesProperties){
			condition.remove(key);
		}
		String columnNames = collectionToString(columns.values());
		builder.sql("SELECT ");
		builder.sql(columnNames);
		builder.sql("FROM");
		builder.sql(tableName);
		if(condition.isEmpty()){
			return builder;
		}
		builder.sql("WHERE");
		int i = 0;
		Iterator<Entry<String, Object>> it = condition.entrySet().iterator();
		while(it.hasNext()){
        	Entry<String, Object> entry = it.next();
        	Object value = entry.getValue();
        	if(value == null) continue;
        	if(i > 0) builder.sql(" AND ");
        	builder.sql(columns.get(entry.getKey()) + " = ");
        	if(value instanceof String){
        		builder.param(String.class, (String) value);
        	} else if(value instanceof BigDecimal){
        		builder.param(BigDecimal.class, (BigDecimal) value);
        	} else if(value instanceof Date){
        		builder.param(Date.class, (Date) value);
        	} else if(value instanceof Boolean){
        		builder.param(Boolean.class, (Boolean) value);
        	} else {
        		builder.param(String.class, value.toString());
        	}
        	i++;
        }
		return builder;
	}
	
	public UpdateBuilder setUpdateBuilder(UpdateBuilder builder, Object entity, String... proNames){
		Map<String, Object> valueMap = this.getFieldValue(entity, proNames);
		BigDecimal upCount = null;
		if(updateCountColumnName != null){
			if(valueMap.containsKey(updateCountColumnName)){
				upCount = (BigDecimal) valueMap.remove(updateCountColumnName);
			} else {
				upCount = (BigDecimal) this.getFieldValue(entity, updateCountProName).get(updateCountColumnName);
			}
		}
        builder.sql("UPDATE ");
        builder.sql(tableName);
        builder.sql(" SET ");
        Iterator<Entry<String, Object>> it = valueMap.entrySet().iterator();
        int i = 0;
        while(it.hasNext()){
        	Entry<String, Object> entry = it.next();
        	Object value = entry.getValue();
        	// entity中属性值为null，不做更新
        	if(value == null) continue;
        	String name = entry.getKey();
        	if(i > 0) builder.sql(" , ");
        	builder.sql(name + " = ");
        	if(value instanceof String){
        		builder.param(String.class, (String) value);
        	} else if(value instanceof BigDecimal){
        		builder.param(BigDecimal.class, (BigDecimal) value);
        	} else if(value instanceof Date){
        		builder.param(Date.class, (Date) value);
        	} else if(value instanceof Boolean){
        		builder.param(Boolean.class, (Boolean) value);
        	} else if(value instanceof byte[]){
        		builder.param(byte[].class, (byte[]) value);
        	} else {
        		builder.param(String.class, value.toString());
        	}
        	
        	i++;
        }
        if(updateCountColumnName != null){
        	if(i > 0){
        		builder.sql(" , ");
        	}
        	builder.sql(updateCountColumnName + " = " + updateCountColumnName + " + 1");
        }
        
        builder.sql(" WHERE ");
        valueMap = this.getFieldValue(entity, keyList);
        it = valueMap.entrySet().iterator();
        i = 0;
        while(it.hasNext()){
        	Entry<String, Object> entry = it.next();
        	Object value = entry.getValue();
        	String name = entry.getKey();
        	if(i > 0) builder.sql(" AND ");
        	builder.sql(name + " = ");
        	if(value instanceof String){
        		builder.param(String.class, (String) value);
        	} else if(value instanceof BigDecimal){
        		builder.param(BigDecimal.class, (BigDecimal) value);
        	} else if(value instanceof Date){
        		builder.param(Date.class, (Date) value);
        	} else if(value instanceof Boolean){
        		builder.param(Boolean.class, (Boolean) value);
        	} else {
        		builder.param(String.class, value.toString());
        	}
        	i++;
        }
        if(updateCountColumnName != null){
        	if(i > 0){
        		builder.sql(" AND ");
        	}
        	builder.sql(updateCountColumnName + " = ").param(BigDecimal.class, upCount);
        }
        
		return builder;
	}
		
	public InsertBuilder setInsertBuilder(InsertBuilder builder, Object entity){
		Map<String, Object> valueMap = this.getFieldValue(entity, new ArrayList<>(columns.keySet()));
		
		List<String> nullValuesProperties = nullValuesProperties(valueMap);
		for(String key : nullValuesProperties){
			valueMap.remove(key);
		}
		Set<String> keySet = valueMap.keySet();
		Iterator<String> it = keySet.iterator();
		builder.sql("INSERT INTO ");
		builder.sql(tableName);
		builder.sql("(");
		builder.sql(collectionToString(keySet));
		builder.sql(") VALUES (");
		int i = 0;
		while(it.hasNext()){
			String key = it.next();
			Object value = valueMap.get(key);
			if(i > 0){
				builder.sql(",");
			}
			if(value instanceof String){
        		builder.param(String.class, (String) value);
        	} else if(value instanceof BigDecimal){
        		builder.param(BigDecimal.class, (BigDecimal) value);
        	} else if(value instanceof Boolean){
        		builder.param(Boolean.class, (Boolean) value);
        	} else if(value instanceof Date){
        		builder.param(Date.class, (Date) value);
        	} else if(value instanceof byte[]){
        		builder.param(byte[].class, (byte[]) value);
        	} else {
        		builder.param(String.class, value.toString());
        	}
			i++;
		}
		builder.sql(")");
		return builder;
	}
	
	public DeleteBuilder setDeleteBuilder(DeleteBuilder builder, Object entity){
		builder.sql("DELETE FROM");
		builder.sql(tableName);
		builder.sql("WHERE");
		Map<String, Object> valueMap = this.getFieldValue(entity, keyList);
		Iterator<Entry<String, Object>>it = valueMap.entrySet().iterator();
        int i = 0;
        while(it.hasNext()){
        	Entry<String, Object> entry = it.next();
        	Object value = entry.getValue();
        	String name = entry.getKey();
        	if(i > 0) builder.sql(" AND ");
        	builder.sql(name + " = ");
        	if(value instanceof String){
        		builder.param(String.class, (String) value);
        	} else if(value instanceof BigDecimal){
        		builder.param(BigDecimal.class, (BigDecimal) value);
        	} else if(value instanceof Boolean){
        		builder.param(Boolean.class, (Boolean) value);
        	} else if(value instanceof Date){
        		builder.param(Date.class, (Date) value);
        	} else {
        		builder.param(String.class, value.toString());
        	}
        	i++;
        }
		return builder;
	}
	
	public String collectionToString(Collection<String> c){
		StringBuilder b = new StringBuilder();
		for(String s : c){
			b.append(s);
			b.append(", ");
		}
		if(b.length() > 0)b.setLength(b.length() - 2);;
		return b.toString();
	}
	
	public List<String> nullValuesProperties(Map<String, Object> valueMap){
		List<String> nullValuesProperties = new ArrayList<String>();
		Iterator<Entry<String, Object>> it = valueMap.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, Object> entry = it.next();
			if(entry.getValue() == null)nullValuesProperties.add(entry.getKey());
		}
		return nullValuesProperties;
	}
	
	public String getTableName() {
		return tableName;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public List<String> getKeyList() {
		return keyList;
	}

	public Map<String, String> getColumns() {
		return columns;
	}
	
	class Key{
		static final int ID_TYPE_SEQ = 0;
		static final int ID_TYPE_IDENTITY = 1;
		static final int ID_TYPE_NULL = 2;
		String name;
		int type;
		String seq;
	}
}
