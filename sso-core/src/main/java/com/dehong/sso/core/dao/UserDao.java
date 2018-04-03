package com.dehong.sso.core.dao;

import com.dehong.sso.core.annotation.InjectConfig;
import com.dehong.sso.core.config.SpringDomaConfig;
import com.dehong.sso.core.entity.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

/**
 * Created by dehong on 2018-03-26.
 */

@Dao(config = SpringDomaConfig.class)
@InjectConfig
public interface UserDao {

    @Select
    List<User> selectByUserName(String userName);
}
