package com.dehong.sso.core.service;


import com.dehong.sso.core.entity.User;


public interface UserService {

    User selectById(Long id);

    User selectUserByUserName(String userName);

    void insert(User entity);

    void update(User user);

    void delete(User user);


}