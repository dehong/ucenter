package com.dehong.sso.boot.controller;

import com.alibaba.fastjson.JSON;
import com.dehong.sso.boot.common.ActionResult;
import com.dehong.sso.core.dto.UserDto;
import com.dehong.sso.core.dto.UserSearchDto;
import com.dehong.sso.core.entity.UserInfo;
import com.dehong.sso.core.service.UserService;
import com.dehong.sso.core.util.PageOptionsUtil;
import org.apache.commons.collections.map.HashedMap;
import org.seasar.doma.jdbc.SelectOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Resource
	private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<ActionResult> getUsers(UserSearchDto userSearchDto)
    {
        ActionResult result = new ActionResult();
        try {
            SelectOptions options = PageOptionsUtil.getSelectOptions(userSearchDto);
            List<UserDto> list = userService.selectUserList(userSearchDto, options);
            Map map = new HashedMap();
            map.put("list",list);
            Map pagination = new HashedMap();
//            pagination.put("current",userSearchDto.getCurrentPage());
//            pagination.put("pageSize",userSearchDto.getPageSize());
            pagination.put("total",options.getCount());
            map.put("pagination",pagination);
            result.setData(map);
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

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<ActionResult> getUser(@PathVariable Long id)
    {
        ActionResult result = new ActionResult();
        try {
            UserDto user = userService.selectById(id);
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

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<ActionResult> removeUser(@PathVariable Long id)
    {
        ActionResult result = new ActionResult();
        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setId(id);
            userInfo.setDeleteFalg(true);
            userService.updateUserInfo(userInfo);
            result.setData(id);
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