package com.dehong.sso.core.service.impl;

import com.dehong.sso.core.dao.EntityDao;
import com.dehong.sso.core.dao.RoleDao;
import com.dehong.sso.core.entity.Role;
import com.dehong.sso.core.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by dehong on 2018-03-27.
 */

@Service
public class RoleServiceImpl implements RoleService {

    private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Resource
    private RoleDao roleDao;

    @Resource
    private EntityDao entityDao;

    @Override
    public Role selectById(Long id) {
        logger.info("selectById parm :{}",id);
        Role role = roleDao.selectById(id);
        return role;
    }

    @Override
    public List<Role> selectRoleList() {

        return entityDao.selectByCondition(Role.class, null);

    }

    @Override
    public Set<String> selectRoles(String userName) {
        Set<String> set = new HashSet<>();
        List<Role> roles = roleDao.selectRoleList(userName);
        roles.forEach(role -> set.add(role.getType()));
        return set.size() > 0 ? set : null;
    }
}
