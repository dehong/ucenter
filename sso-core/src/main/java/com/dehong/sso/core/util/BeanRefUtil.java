package com.dehong.sso.core.util;

import com.dehong.sso.core.annotation.TransformField;
import com.dehong.sso.core.dto.UserDto;
import com.dehong.sso.core.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dehong on 2018-03-25.
 */
public class BeanRefUtil {

    private static final Logger logger = LoggerFactory.getLogger(BeanRefUtil.class);


    public static <T, S> T dto2Entity(S dto, Class<T> clazz) {
        if (dto == null || clazz == null) {
            logger.debug("dto is null or target clazz is null ! return NULL!");
            return null;
        }
        try {
            T entity = clazz.newInstance();
            dto2Entity(dto, entity);
            return entity;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T, S> S entity2Dto(T entity, Class<S> clazz) {
        if (entity == null || clazz == null) {
            logger.debug("entity is null or target clazz is null ! return NULL!");
            return null;
        }
        try {
            S dto = clazz.newInstance();
            entity2Dto(entity, dto);
            return dto;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param dto    源对象 dto
     * @param entity 目标对象 entity
     * @param <T>
     * @param <S>
     */
    private static <T, S> T dto2Entity(S dto, T entity) {
        Field[] dtoFields = dto.getClass().getDeclaredFields();
        Field[] entityFields = entity.getClass().getDeclaredFields();
        Set<String> set = new HashSet<>();
        for (Field fe : entityFields) {
            set.add(fe.getName());
        }
        for (Field fd : dtoFields) {
            try {
                //是否进行注解赋值标记
                boolean assign = true;
                Annotation[] dtoAnnotations = fd.getAnnotations();
                for (Annotation annotation : dtoAnnotations) {
                    if (annotation instanceof TransformField) {
                        TransformField transformField = (TransformField) annotation;
                        String annotationValue = transformField.value();
                        Object val = getProperty(dto, fd.getName());
                        if (val != null) {
                            setProperty(entity, annotationValue, val);
                            assign = false;
                        }

                    }
                }
                if (assign && set.contains(fd.getName())) {
                    PropertyDescriptor pd = new PropertyDescriptor(fd.getName(), dto.getClass());
                    PropertyDescriptor pe = new PropertyDescriptor(fd.getName(), entity.getClass());

                    Method readMethod = pd.getReadMethod();
                    Method writeMethod = pe.getWriteMethod();
                    if (pd.getPropertyType() == pe.getPropertyType() && readMethod != null && writeMethod != null) {
                        Object value = readMethod.invoke(dto);
                        writeMethod.invoke(entity, value);
                    }
                }
            } catch (Exception e) {
                logger.info("dto2Entity error! dto class:{},entity class:{},field:{},exception message:{}",
                        dto.getClass().getName(), entity.getClass().getName(), fd.getName(), e.getMessage());
            }

        }
        return entity;

    }


    /**
     * @param entity 目标实体 entity
     * @param dto    源实体 dto
     * @param <T>
     * @param <S>
     */
    private static <T, S> S entity2Dto(T entity, S dto) {
        Field[] dtoFields = dto.getClass().getDeclaredFields();
        Field[] entityFields = entity.getClass().getDeclaredFields();
        Set<String> set = new HashSet<>();
        for (Field fe : entityFields) {
            set.add(fe.getName());
        }
        for (Field fd : dtoFields) {
            try {
                //是否进行注解赋值标记
                boolean assign = true;
                Annotation[] dtoAnnotations = fd.getAnnotations();
                for (Annotation annotation : dtoAnnotations) {
                    if (annotation instanceof TransformField) {
                        TransformField transformField = (TransformField) annotation;
                        String desAnnotationValue = transformField.value();
                        Object val = getProperty(entity, desAnnotationValue);
                        if (val != null) {
                            setProperty(dto, fd.getName(), val);
                            assign = false;
                        }

                    }
                }

                if (assign && set.contains(fd.getName())) {
                    PropertyDescriptor pd = new PropertyDescriptor(fd.getName(), dto.getClass());
                    PropertyDescriptor pe = new PropertyDescriptor(fd.getName(), entity.getClass());

                    Method readMethod = pe.getReadMethod();
                    Method writeMethod = pd.getWriteMethod();
                    if (pd.getPropertyType() == pe.getPropertyType() && readMethod != null && writeMethod != null) {
                        Object value = readMethod.invoke(entity);
                        writeMethod.invoke(dto, value);
                    }
                }
            } catch (Exception e) {
                logger.info("entity2Dto error! dto class:{},entity class:{},field:{},exception message:{}",
                        dto.getClass().getName(), entity.getClass().getName(), fd.getName(), e.getMessage());
            }

        }
        return dto;

    }

    /*该方法用于传入某实例对象以及对象方法名，通过反射调用该对象的某个get方法*/
    public static Object getProperty(Object beanObj, String property) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        //此处应该判断beanObj,property不为null
        PropertyDescriptor pd = new PropertyDescriptor(property, beanObj.getClass());
        Method getMethod = pd.getReadMethod();
        if (getMethod == null) {
            return null;
        }
        return getMethod.invoke(beanObj);
    }

    /*该方法用于传入某实例对象以及对象方法名、修改值，通过放射调用该对象的某个set方法设置修改值*/
    public static Object setProperty(Object beanObj, String property, Object value) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        //此处应该判断beanObj,property不为null
        PropertyDescriptor pd = new PropertyDescriptor(property, beanObj.getClass());
        Method setMethod = pd.getWriteMethod();
        if (setMethod == null) {
            return null;
        }
        return setMethod.invoke(beanObj, value);
    }

    public static void main(String[] args) {
        User user = new User();
        user.setId(11111L);
        user.setPasswordDes("223");
        user.setCreatetime(LocalDateTime.now());
        UserDto userDto = BeanRefUtil.entity2Dto(user, UserDto.class);
        System.out.println(userDto);

        userDto.setPassword("ppppp");
        User user1 = BeanRefUtil.dto2Entity(userDto, User.class);
        System.out.println(user1.getPasswordDes());
    }

}
