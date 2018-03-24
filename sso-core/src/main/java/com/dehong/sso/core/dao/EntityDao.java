package com.dehong.sso.core.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.doma.Dao;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.builder.DeleteBuilder;
import org.seasar.doma.jdbc.builder.InsertBuilder;
import org.seasar.doma.jdbc.builder.SelectBuilder;
import org.seasar.doma.jdbc.builder.UpdateBuilder;
import com.dehong.sso.core.annotation.InjectConfig;
import com.dehong.sso.core.config.SpringDomaConfig;
import com.dehong.sso.core.exception.DBConcurrencyException;


@Dao(config = SpringDomaConfig.class)
@InjectConfig
public interface EntityDao {
	default <T> T selectById(Class<T> entityClass, Object id){
		Config config = Config.get(this);
        SelectBuilder builder = SelectBuilder.newInstance(config);
        EntityDaoHelper helper = EntityDaoHelper.getHelper(entityClass);
        helper.setSelectBuilderById(builder, id);
        return builder.getEntitySingleResult(entityClass);
	}
	
	default <T> List<T> selectByCondition(Class<T> entityClass, Map<String, Object> condition){
		Config config = Config.get(this);
        SelectBuilder builder = SelectBuilder.newInstance(config);
        EntityDaoHelper helper = EntityDaoHelper.getHelper(entityClass);
        condition = condition == null ? new HashMap<>() : condition;
        helper.setSelectBuilder(builder, condition);
        return builder.getEntityResultList(entityClass);
	}
	
	default int updatePartially(Object entity, String... proNames){
		Config config = Config.get(this);
        UpdateBuilder builder = UpdateBuilder.newInstance(config);
        EntityDaoHelper helper = EntityDaoHelper.getHelper(entity.getClass());
        helper.setUpdateBuilder(builder, entity, proNames);
        int affectRowCount = builder.execute();
        if(affectRowCount <= 0){
        	throw new DBConcurrencyException();
        }
        return affectRowCount;
	}
	
	default int update(Object entity){
		return updatePartially(entity);
	}
	
	default int insert(Object entity){
		Config config = Config.get(this);
		InsertBuilder builder = InsertBuilder.newInstance(config);
		EntityDaoHelper helper = EntityDaoHelper.getHelper(entity.getClass());
		helper.setInsertBuilder(builder, entity);
		return builder.execute();
	}
	
	default <T> int insertAll(List<T> entities){
		if(entities == null || entities.isEmpty()) return 0;
		Config config = Config.get(this);
		EntityDaoHelper helper = EntityDaoHelper.getHelper(entities.get(0).getClass());
		int count = 0;
		for(Object entity : entities){
			InsertBuilder builder = InsertBuilder.newInstance(config);
			helper.setInsertBuilder(builder, entity);
			count += builder.execute();
		}
		return count;
	}
	
	default int delete(Object entity){
		Config config = Config.get(this);
		DeleteBuilder builder = DeleteBuilder.newInstance(config);
		EntityDaoHelper helper = EntityDaoHelper.getHelper(entity.getClass());
		helper.setDeleteBuilder(builder, entity);
		return builder.execute();
	}
}
