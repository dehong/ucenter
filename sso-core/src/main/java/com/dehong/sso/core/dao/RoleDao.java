package com.dehong.sso.core.dao;

import com.dehong.sso.core.annotation.InjectConfig;
import com.dehong.sso.core.config.SpringDomaConfig;
import com.dehong.sso.core.entity.Role;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

/**
 * Created by dehong on 2018-03-25.
 */

@Dao(config = SpringDomaConfig.class)
@InjectConfig
public interface RoleDao {

    @Select
    Role selectById(Long id);


    @Select
    List<Role> selectRoleList(String userName);


}
