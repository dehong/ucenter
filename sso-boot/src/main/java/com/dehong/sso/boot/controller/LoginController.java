package com.dehong.sso.boot.controller;

import com.alibaba.fastjson.JSONObject;
import com.dehong.sso.core.dto.LoginDto;
import com.dehong.sso.core.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dehong on 2018-04-06.
 */

@RestController
@RequestMapping("/api")
public class LoginController {

    @RequestMapping(value = "/login/account", method = RequestMethod.POST)
    @ResponseBody
    public String ajaxLogin(@RequestBody LoginDto loginDto) {
        JSONObject jsonObject = new JSONObject();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginDto.getUserName(), loginDto.getPassword());
        try {
            subject.login(token);
            jsonObject.put("token", subject.getSession().getId());
            jsonObject.put("msg", "登录成功");
            jsonObject.put("status", "ok");
            jsonObject.put("type", "account");
            jsonObject.put("currentAuthority", "admin");
        } catch (IncorrectCredentialsException e) {
            jsonObject.put("msg", "密码错误");
        } catch (ExcessiveAttemptsException e){
            jsonObject.put("msg", "登录失败多次，账户锁定10分钟");
        } catch (LockedAccountException e) {
            jsonObject.put("msg", "登录失败，该用户已被冻结");
        } catch (AuthenticationException e) {
            jsonObject.put("msg", "该用户不存在");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "/currentUser", method = RequestMethod.GET)
    public String getCurrentUser(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "王德红");
        jsonObject.put("avatar", "https://gw.alipayobjects.com/zos/rmsportal/BiazfanxmamNRoxxVxka.png");
        jsonObject.put("userid", "00000001");
        jsonObject.put("notifyCount", "12");
        return jsonObject.toString();
    }
}
