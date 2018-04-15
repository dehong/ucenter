package com.dehong.sso.boot.controller;

import java.io.IOException;

import com.alibaba.fastjson.JSON;
import com.dehong.sso.boot.common.ActionResult;
import com.dehong.sso.core.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public ResponseEntity<ActionResult> hello() throws IOException
    {
        ActionResult result = new ActionResult();
        try {
            User user = new User();
            user.setId(123444L);
            user.setUserName("张三");
            result.setData(user);
            result.setSuccess(true);
            result.setMsg("操作成功!");
        } catch (Exception e) {
            result.setMsg(e.getClass().getName() + ":" + e.getMessage());
            result.setSuccess(false);
            e.printStackTrace();
        }
        logger.info(JSON.toJSONString(result));
        return ResponseEntity.ok(result);
    }

}