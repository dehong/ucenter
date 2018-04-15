package com.dehong.sso.core.main;

import com.dehong.sso.core.config.AppConfig;
import com.dehong.sso.core.dao.EntityDao;
import com.dehong.sso.core.entity.Dept;
import com.dehong.sso.core.entity.HrEmployee;
import com.dehong.sso.core.entity.HrWebUser;
import com.dehong.sso.core.entity.OrgDept;
import com.dehong.sso.core.entity.User;
import com.dehong.sso.core.entity.UserInfo;
import com.dehong.sso.core.util.UniqueIdUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dehong on 2018-04-06.
 */
public class TestMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        EntityDao entityDao = ctx.getBean(EntityDao.class);

//        List<HrEmployee> hrEmployees = entityDao.selectByCondition(HrEmployee.class, null);
//        for(HrEmployee employee : hrEmployees){
//            UserInfo userInfo = new UserInfo();
//            long uniqueID = UniqueIdUtil.getUniqueID();
//            BeanUtils.copyProperties(employee,userInfo);
//            userInfo.setId(uniqueID);
//            userInfo.setDeleteFalg(employee.getIsDroped());
//            userInfo.setDeptId(employee.getDeptUuid());
//            userInfo.setWardId(employee.getWardUuid());
//            userInfo.setPhone(employee.getMobilePhone());
//
//            Map<String,Object> map = new HashMap<>();
//            map.put("uuid",employee.getUuid());
//            List<HrWebUser> hrWebUsers = entityDao.selectByCondition(HrWebUser.class, map);
//            if(hrWebUsers != null && hrWebUsers.size() >0){
//                HrWebUser hrWebUser = hrWebUsers.get(0);
//                User user = new User();
//                BeanUtils.copyProperties(hrWebUser,user);
//                user.setId(uniqueID);
//                user.setUId(uniqueID);
//                entityDao.insert(userInfo);
//                entityDao.insert(user);
//            }
//
//        }

        List<Dept> depts = entityDao.selectByCondition(Dept.class, null);
        depts.forEach(dept -> {
            OrgDept orgDept = new OrgDept();
            BeanUtils.copyProperties(dept,orgDept);
            orgDept.setId(UniqueIdUtil.getUniqueID());
            orgDept.setDeleteFalg(dept.getIsDroped());
            orgDept.setParent(dept.getParUuid());
            entityDao.insert(orgDept);
        });


    }
}
