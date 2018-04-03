package com.dehong.sso.boot.controller;

import com.dehong.sso.core.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/1/15.
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private UserService userService;

    /**
     * AR 部分测试
     */
    @GetMapping("/test1")
    public Object test1() {
        try {
            userService.selectById(1L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/test2")
    public Object test2() {
        try {
            return userService.selectById(1L);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
