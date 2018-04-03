package com.dehong.sso.core.service.impl;

import com.dehong.sso.core.dao.EntityDao;
import com.dehong.sso.core.dao.UserDao;
import com.dehong.sso.core.entity.User;
import com.dehong.sso.core.service.UserService;
import com.dehong.sso.core.util.UniqueIdUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dehong on 2018-03-25.
 */

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private EntityDao entityDao;

    @Resource
    private UserDao userDao;

    @Override
    public User selectById(Long id) {
        User user = entityDao.selectById(User.class, id);
        return user;
    }

    @Override
    public User selectUserByUserName(String userName) {
        List<User> list = userDao.selectByUserName(userName);
        if (list != null && list.size() > 0) {
            if (list.size() > 1) {
                logger.warn("selectUserByUserName result size > 1, return the first record !");
            }
            return list.get(0);
        }
        return null;

    }

    @Override
    public void insert(User user) {
        long id = UniqueIdUtil.getUniqueID();
        user.setId(id);
        user.setUId(id);
        entityDao.insert(user);
    }

    @Override
    public void update(User user) {
        entityDao.update(user);

    }

    @Override
    public void delete(User user) {
        entityDao.delete(user);
    }
}
