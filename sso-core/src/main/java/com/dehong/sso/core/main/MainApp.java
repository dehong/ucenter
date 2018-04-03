package com.dehong.sso.core.main;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.dehong.sso.core.dao.RoleDao;
import com.dehong.sso.core.dto.RoleDto;
import com.dehong.sso.core.dto.UserDto;
import com.dehong.sso.core.entity.Role;
import com.dehong.sso.core.entity.User;
import com.dehong.sso.core.service.RoleService;
import com.dehong.sso.core.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dehong.sso.core.config.AppConfig;
import com.dehong.sso.core.dao.EntityDao;

/** 
 * 
 * @author   created by dehong
 * @date     2018年3月17日 上午2:26:59
 * 
 */

public class MainApp
{

	public static void main(String[] args) throws Exception
	{
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		 EntityDao entityDao = ctx.getBean(EntityDao.class);
//		 List<FimsMenu> list = entityDao.selectByCondition(FimsMenu.class, null);
//		 FimsMenu fimsMenu = entityDao.selectById(FimsMenu.class, "M001");

		 //fimsMenu.setMenuName("身份管理2");
		 //entityDao.update(fimsMenu);

//        RoleDao roleDao = ctx.getBean(RoleDao.class);
//
//		Role role = new Role();
//		role.setId(11111111L);
//		role.setName("测试112");
//		role.setCreateTime(LocalDateTime.now());
//        role.setUpdateCount(2);
//        roleDao.update(role);

		 //System.out.println(list);

//        Role role = roleDao.selectById(11111111L);
//        System.out.println(role);

        UserService userService = ctx.getBean(UserService.class);
		User user = userService.selectUserByUserName("testRole");
		System.out.println(user.getUserFrom());


		User user1 = new User();
		user1.setId(user.getId());
		user1.setUserFrom("test");
		userService.update(user1);
		System.out.println(user1);

		// press any key to exit
		System.in.read();

	}

}
