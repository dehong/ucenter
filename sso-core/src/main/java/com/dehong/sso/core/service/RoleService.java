package com.dehong.sso.core.service;


import com.dehong.sso.core.entity.Role;

import java.util.List;
import java.util.Set;

/**
 * Created by dehong on 2018-03-25.
 */
public interface RoleService {

    Role selectById(Long id);

    List<Role> selectRoleList();

    Set<String> selectRoles(String userName);

}
