package com.dehong.sso.core.service;


import com.dehong.sso.core.dto.UserDto;
import com.dehong.sso.core.dto.UserSearchDto;
import com.dehong.sso.core.entity.User;
import com.dehong.sso.core.entity.UserInfo;
import org.seasar.doma.jdbc.SelectOptions;

import java.util.List;


public interface UserService {

    UserDto selectById(Long id);

    User selectUserByUserName(String userName);

    List<UserDto> selectUserList(UserSearchDto userSearchDto, SelectOptions options);

    void insert(User entity);

    void updateUser(User user);

    void updateUserInfo(UserInfo userInfo);

    void delete(User user);


}