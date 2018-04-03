package com.dehong.sso.core.common;

import com.dehong.sso.core.dao.EntityDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dehong on 2018-03-25.
 */

//@Service
public class CommonService
{
    @Resource
    private EntityDao entityDao;

    public <T> T selectById(Class<T> clazz, Object id){
        return entityDao.selectById(clazz,id);
    }

    public void insert(Object object){
        entityDao.insert(object);

    }

    public void update(Object object){
        entityDao.update(object);

    }

    public void delete(Object object){
        entityDao.delete(object);

    }
}
