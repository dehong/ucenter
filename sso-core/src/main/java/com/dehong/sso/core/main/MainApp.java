package com.dehong.sso.core.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dehong.sso.core.config.AppConfig;
import com.dehong.sso.core.dao.EntityDao;
import com.dehong.sso.core.entity.FimsMenu;

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
		 List<FimsMenu> list = entityDao.selectByCondition(FimsMenu.class, null);
		 FimsMenu fimsMenu = entityDao.selectById(FimsMenu.class, "M001");
		 
		 //fimsMenu.setMenuName("身份管理2");
		 //entityDao.update(fimsMenu);
		 
		 System.out.println(list);
		 
		// press any key to exit
		System.in.read();

	}

}
