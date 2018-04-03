package com.dehong.sso.boot;

import org.apache.shiro.codec.Base64;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dehong on 2018-03-25.
 */
public class BeanRefUtil
{
    /**
     *
     * @param entity  目标实体 entity
     * @param dto  源实体 dto
     * @param <T>
     * @param <S>
     */
    public static <T, S> void dto2Entity(T entity, S dto) throws IntrospectionException, InvocationTargetException, IllegalAccessException
    {
        Field[] fieldsforS = dto.getClass().getDeclaredFields();
        Field[] fieldsforT = entity.getClass().getDeclaredFields();
        Set<String> set = new HashSet<>();
        for (Field ft :fieldsforT){
            set.add(ft.getName());
        }
        for (Field fs : fieldsforS) {
            Annotation[] desAnnotations = fs.getAnnotations();
            for (Annotation desAnnotation : desAnnotations) {
                if (desAnnotation instanceof TransformField) {
                    TransformField desFieldAnnotation = (TransformField) desAnnotation;
                    String desAnnotationValue = desFieldAnnotation.value();
                    Object sVal = getProperty(dto, fs.getName());
                    if(sVal != null){
                        setProperty(entity,desAnnotationValue,sVal);
                    }

                }
            }
            if(set.contains(fs.getName())) {
                PropertyDescriptor ps = new PropertyDescriptor(fs.getName(), dto.getClass());
                PropertyDescriptor pt = new PropertyDescriptor(fs.getName(), entity.getClass());

                Method readMethod = ps.getReadMethod();
                Method writeMethod = pt.getWriteMethod();
                if(ps.getPropertyType() == pt.getPropertyType() && readMethod != null && writeMethod != null){
                    Object value = readMethod.invoke(dto);
                    writeMethod.invoke(entity,value);
                }
            }
        }

    }


    /**
     *
     * @param entity  目标实体 entity
     * @param dto  源实体 dto
     * @param <T>
     * @param <S>
     */
    public static <T, S> void entity2Dto(T entity, S dto) throws IntrospectionException, InvocationTargetException, IllegalAccessException
    {
        Field[] fieldsforS = dto.getClass().getDeclaredFields();
        Field[] fieldsforT = entity.getClass().getDeclaredFields();
        Set<String> set = new HashSet<>();
        for (Field ft :fieldsforT){
            set.add(ft.getName());
        }
        for (Field fs : fieldsforS) {
            Annotation[] desAnnotations = fs.getAnnotations();
            for (Annotation desAnnotation : desAnnotations) {
                if (desAnnotation instanceof TransformField) {
                    TransformField desFieldAnnotation = (TransformField) desAnnotation;
                    String desAnnotationValue = desFieldAnnotation.value();
                    Object tVal = getProperty(entity, desAnnotationValue);
                    if(tVal != null){
                        setProperty(dto,fs.getName(),tVal);
                    }

                }
            }
            if(set.contains(fs.getName())) {
                PropertyDescriptor ps = new PropertyDescriptor(fs.getName(), dto.getClass());
                PropertyDescriptor pt = new PropertyDescriptor(fs.getName(), entity.getClass());

                Method readMethod = pt.getReadMethod();
                Method writeMethod = ps.getWriteMethod();
                if(ps.getPropertyType() == pt.getPropertyType() && readMethod != null && writeMethod != null){
                    Object value = readMethod.invoke(entity);
                    writeMethod.invoke(dto,value);
                }
            }
        }

    }

    /*该方法用于传入某实例对象以及对象方法名，通过反射调用该对象的某个get方法*/
    public static Object getProperty(Object beanObj, String property) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
        //此处应该判断beanObj,property不为null
        PropertyDescriptor pd = new PropertyDescriptor(property, beanObj.getClass());
        Method getMethod = pd.getReadMethod();
        if(getMethod == null){
            return null;
        }
        return getMethod.invoke(beanObj);
    }
    /*该方法用于传入某实例对象以及对象方法名、修改值，通过放射调用该对象的某个set方法设置修改值*/
    public static Object setProperty(Object beanObj, String property, Object value) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
        //此处应该判断beanObj,property不为null
        PropertyDescriptor pd = new PropertyDescriptor(property, beanObj.getClass());
        Method setMethod = pd.getWriteMethod();
        if(setMethod == null){
            return null;
        }
        return setMethod.invoke(beanObj, value);
    }

    public static void main(String[] args) throws IllegalAccessException, IntrospectionException, InvocationTargetException
    {
//        TestDto dto = new TestDto();
//        dto.setAge(1222);
//        dto.setName1("张三");
//        dto.setAdd("233333");
//
//        TestEntity entity = new TestEntity();
//        BeanRefUtil.dto2Entity(entity,dto);
//        System.out.println(entity);

//        TestEntity entity = new TestEntity();
//        entity.setAge(1222);
//        entity.setName("张三");
//        TestDto dto = new TestDto();
//        BeanRefUtil.entity2Dto(entity,dto);
//        System.out.println(dto);

        byte[] decode = Base64.decode("4AvVhmFLUs0KTA3Kprsdag==");
        System.out.println(new String(decode));
    }

}
