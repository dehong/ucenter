/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.6.17 : Database - fims
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fims` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fims`;

/*Table structure for table `amauthentication_access` */

DROP TABLE IF EXISTS `amauthentication_access`;

CREATE TABLE `amauthentication_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `amauthentication_access` */

/*Table structure for table `amauthentication_error` */

DROP TABLE IF EXISTS `amauthentication_error`;

CREATE TABLE `amauthentication_error` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `amauthentication_error` */

/*Table structure for table `amconsole_access` */

DROP TABLE IF EXISTS `amconsole_access`;

CREATE TABLE `amconsole_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `amconsole_access` */

/*Table structure for table `amconsole_error` */

DROP TABLE IF EXISTS `amconsole_error`;

CREATE TABLE `amconsole_error` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `amconsole_error` */

/*Table structure for table `ampolicy_access` */

DROP TABLE IF EXISTS `ampolicy_access`;

CREATE TABLE `ampolicy_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ampolicy_access` */

/*Table structure for table `ampolicy_error` */

DROP TABLE IF EXISTS `ampolicy_error`;

CREATE TABLE `ampolicy_error` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ampolicy_error` */

/*Table structure for table `ampolicydelegation_access` */

DROP TABLE IF EXISTS `ampolicydelegation_access`;

CREATE TABLE `ampolicydelegation_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ampolicydelegation_access` */

/*Table structure for table `amrest_access` */

DROP TABLE IF EXISTS `amrest_access`;

CREATE TABLE `amrest_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `amrest_access` */

/*Table structure for table `amrest_authz` */

DROP TABLE IF EXISTS `amrest_authz`;

CREATE TABLE `amrest_authz` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `amrest_authz` */

/*Table structure for table `amsso_access` */

DROP TABLE IF EXISTS `amsso_access`;

CREATE TABLE `amsso_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `amsso_access` */

/*Table structure for table `entitlement_access` */

DROP TABLE IF EXISTS `entitlement_access`;

CREATE TABLE `entitlement_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `entitlement_access` */

/*Table structure for table `entitlement_error` */

DROP TABLE IF EXISTS `entitlement_error`;

CREATE TABLE `entitlement_error` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `entitlement_error` */

/*Table structure for table `fims_audit_interface_call_logs` */

DROP TABLE IF EXISTS `fims_audit_interface_call_logs`;

CREATE TABLE `fims_audit_interface_call_logs` (
  `sn` int(11) NOT NULL AUTO_INCREMENT,
  `sys_code` varchar(20) DEFAULT NULL,
  `sys_name` varchar(50) DEFAULT NULL,
  `interface_name` varchar(100) NOT NULL,
  `operation` varchar(1000) NOT NULL,
  `result` varchar(50) NOT NULL,
  `reason` varchar(1500) DEFAULT NULL,
  `call_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `ip` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`sn`),
  KEY `sys_code_call` (`sys_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_audit_interface_call_logs` */

/*Table structure for table `fims_audit_login_logs` */

DROP TABLE IF EXISTS `fims_audit_login_logs`;

CREATE TABLE `fims_audit_login_logs` (
  `user_id` varchar(50) DEFAULT NULL COMMENT '用户唯一索引',
  `user_name` varchar(100) NOT NULL COMMENT '登录账号',
  `name` varchar(100) DEFAULT NULL COMMENT '姓名',
  `is_login` varchar(100) DEFAULT NULL COMMENT '登录详情',
  `ip` varchar(30) DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '登录时间',
  `sn` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`sn`),
  KEY `user_id_login` (`user_id`),
  CONSTRAINT `user_id_login` FOREIGN KEY (`user_id`) REFERENCES `hr_web_user` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='is_login为登陆的详细信息';

/*Data for the table `fims_audit_login_logs` */

/*Table structure for table `fims_audit_operation_logs` */

DROP TABLE IF EXISTS `fims_audit_operation_logs`;

CREATE TABLE `fims_audit_operation_logs` (
  `sn` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `operation_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `operation_type` varchar(8) DEFAULT NULL,
  `operation` text,
  `result` varchar(200) DEFAULT NULL,
  `ip` varchar(30) DEFAULT NULL,
  `reason` varchar(20000) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sn`),
  KEY `user_id_operation` (`user_id`),
  CONSTRAINT `user_id_operation` FOREIGN KEY (`user_id`) REFERENCES `hr_web_user` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_audit_operation_logs` */

/*Table structure for table `fims_audit_sync_logs` */

DROP TABLE IF EXISTS `fims_audit_sync_logs`;

CREATE TABLE `fims_audit_sync_logs` (
  `sn` int(11) NOT NULL AUTO_INCREMENT,
  `sync_type` varchar(8) NOT NULL,
  `sync_id` varchar(30) NOT NULL,
  `user_id` varchar(50) NOT NULL,
  `sys_id` varchar(11) NOT NULL,
  `sync_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `result` varchar(200) NOT NULL,
  `reason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sn`),
  KEY `user_id_sync` (`user_id`),
  KEY `sys_id_sync` (`sys_id`),
  CONSTRAINT `sys_id_sync` FOREIGN KEY (`sys_id`) REFERENCES `fims_sys_info` (`code`),
  CONSTRAINT `user_id_sync` FOREIGN KEY (`user_id`) REFERENCES `hr_web_user` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_audit_sync_logs` */

/*Table structure for table `fims_custom_link` */

DROP TABLE IF EXISTS `fims_custom_link`;

CREATE TABLE `fims_custom_link` (
  `id` varchar(20) NOT NULL,
  `user_id` varchar(50) NOT NULL,
  `url` varchar(100) DEFAULT NULL,
  `link_name` varchar(50) DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT '0',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `delete_time` timestamp NULL DEFAULT NULL,
  `icon` varchar(200) DEFAULT NULL COMMENT '系统图标',
  `cuscolor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_USER_ID` (`user_id`),
  CONSTRAINT `FK_USER_ID` FOREIGN KEY (`user_id`) REFERENCES `hr_employee` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_custom_link` */

/*Table structure for table `fims_field_mapping` */

DROP TABLE IF EXISTS `fims_field_mapping`;

CREATE TABLE `fims_field_mapping` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sync_config_id` int(11) DEFAULT NULL,
  `source` varchar(50) DEFAULT NULL,
  `target` varchar(30) DEFAULT NULL,
  `is_pwd` tinyint(1) DEFAULT NULL,
  `pwd_mapping_type` varchar(8) DEFAULT NULL,
  `mapping_rule` varchar(1000) DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT '0',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `delete_time` timestamp NULL DEFAULT NULL,
  `update_count` int(11) DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `同步配置ID` (`sync_config_id`),
  CONSTRAINT `同步配置ID` FOREIGN KEY (`sync_config_id`) REFERENCES `fims_sys_sync_config` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_field_mapping` */

/*Table structure for table `fims_icon_info` */

DROP TABLE IF EXISTS `fims_icon_info`;

CREATE TABLE `fims_icon_info` (
  `id` varchar(20) NOT NULL COMMENT '图片ID',
  `icon` varchar(100) NOT NULL COMMENT '图片内容',
  `icon_owner` varchar(20) NOT NULL COMMENT '图片所属',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `delete_time` timestamp NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`),
  KEY `icon_owner` (`icon_owner`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_icon_info` */

/*Table structure for table `fims_menu` */

DROP TABLE IF EXISTS `fims_menu`;

CREATE TABLE `fims_menu` (
  `menu_id` varchar(20) NOT NULL COMMENT '菜单ID',
  `menu_name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `description` varchar(100) DEFAULT NULL COMMENT '菜单描述',
  `parent_id` varchar(20) DEFAULT NULL COMMENT '父菜单ID',
  `path` varchar(20) DEFAULT '菜单对应跳转页面的路径',
  `delete_flag` tinyint(1) DEFAULT NULL COMMENT '删除标志',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `delete_time` timestamp NULL DEFAULT NULL COMMENT '删除时间',
  `update_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_menu` */

insert  into `fims_menu`(`menu_id`,`menu_name`,`description`,`parent_id`,`path`,`delete_flag`,`create_time`,`update_time`,`delete_time`,`update_count`) values ('M001','身份管理2',NULL,'root','菜单对应跳转页面的路径',0,'2016-08-29 10:47:48','2018-03-17 03:14:49',NULL,4),('M002','用户管理',NULL,'M001','菜单对应跳转页面的路径',0,'2016-08-29 10:48:41','2016-08-29 10:48:41',NULL,1),('M003','角色管理',NULL,'M001','菜单对应跳转页面的路径',0,'2016-08-29 10:48:56','2016-08-29 10:48:56',NULL,1),('M004','应用管理',NULL,'M001','菜单对应跳转页面的路径',0,'2016-08-29 10:49:09','2016-08-29 10:49:09',NULL,1),('M005','系统配置',NULL,'root','菜单对应跳转页面的路径',0,'2016-08-29 10:49:16','2016-08-29 10:49:22',NULL,1),('M006','权限管理',NULL,'M005','菜单对应跳转页面的路径',0,'2016-08-29 10:49:36','2016-08-29 10:49:36',NULL,1),('M007','数据源配置',NULL,'M005','菜单对应跳转页面的路径',0,'2016-08-29 10:49:48','2016-08-29 10:49:48',NULL,1),('M008','日志审计',NULL,'root','菜单对应跳转页面的路径',0,'2016-08-29 10:50:02','2016-08-29 10:50:02',NULL,1),('M009','登录日志',NULL,'M008','菜单对应跳转页面的路径',0,'2016-08-29 10:50:15','2016-08-29 10:50:15',NULL,1),('M010','操作日志',NULL,'M008','菜单对应跳转页面的路径',0,'2016-08-29 10:50:28','2016-08-29 10:50:28',NULL,1),('M011','接口日志',NULL,'M008','菜单对应跳转页面的路径',0,'2016-08-29 10:50:38','2016-08-29 10:50:38',NULL,1),('M012','同步日志',NULL,'M008','菜单对应跳转页面的路径',0,'2016-08-29 10:50:46','2016-08-29 10:50:49',NULL,1),('M013','科室管理',NULL,'M001','fb11',0,'2017-01-10 10:03:49','2017-01-10 10:03:49',NULL,1),('M014','病区管理',NULL,'M001','fb12',0,'2017-01-10 10:04:19','2017-01-10 10:04:19',NULL,1),('M015','通知',NULL,'root','',0,'2017-01-13 01:45:40','2017-01-13 01:45:40',NULL,1),('M016','发布通知',NULL,'M015','',0,'2017-01-13 01:46:25','2017-01-13 01:46:25',NULL,1);

/*Table structure for table `fims_role_info` */

DROP TABLE IF EXISTS `fims_role_info`;

CREATE TABLE `fims_role_info` (
  `id` varchar(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `delete_time` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `update_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_role_info` */

/*Table structure for table `fims_role_sys` */

DROP TABLE IF EXISTS `fims_role_sys`;

CREATE TABLE `fims_role_sys` (
  `role_id` varchar(20) NOT NULL,
  `sys_id` varchar(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`role_id`,`sys_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_role_sys` */

/*Table structure for table `fims_role_user` */

DROP TABLE IF EXISTS `fims_role_user`;

CREATE TABLE `fims_role_user` (
  `role_id` varchar(20) NOT NULL,
  `user_id` varchar(50) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`role_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_role_user` */

/*Table structure for table `fims_sys_info` */

DROP TABLE IF EXISTS `fims_sys_info`;

CREATE TABLE `fims_sys_info` (
  `id` varchar(20) NOT NULL COMMENT '系统ID',
  `name` varchar(30) NOT NULL COMMENT '系统名称',
  `description` varchar(100) DEFAULT NULL COMMENT '描述',
  `code` varchar(20) DEFAULT NULL COMMENT '系统编码',
  `delete_flag` tinyint(1) DEFAULT '0' COMMENT '删除标志',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `delete_time` timestamp NULL DEFAULT NULL COMMENT '删除时间',
  `hospital_owner` varchar(50) DEFAULT NULL COMMENT '院方负责人',
  `hospital_owner_phone` varchar(50) DEFAULT NULL COMMENT '院方负责人电话',
  `owner` varchar(50) DEFAULT NULL COMMENT '厂商',
  `contact` varchar(50) DEFAULT NULL COMMENT '厂商联系人',
  `contact_phone` varchar(50) DEFAULT NULL COMMENT '厂商联系人电话',
  `source_flag` tinyint(1) DEFAULT '0' COMMENT '是否权威数据源',
  `show_flag` tinyint(1) DEFAULT '1' COMMENT '是否在导航中展示',
  `sso_url` varchar(100) DEFAULT NULL COMMENT '单点地址',
  `original_url` varchar(100) DEFAULT NULL COMMENT ' 逃生地址',
  `agent_app_base_url` varchar(100) DEFAULT NULL,
  `icon` varchar(200) DEFAULT NULL COMMENT '系统图标',
  `update_count` int(11) DEFAULT '1' COMMENT '更新次数',
  `syscolor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_sys_info` */

insert  into `fims_sys_info`(`id`,`name`,`description`,`code`,`delete_flag`,`create_time`,`update_time`,`delete_time`,`hospital_owner`,`hospital_owner_phone`,`owner`,`contact`,`contact_phone`,`source_flag`,`show_flag`,`sso_url`,`original_url`,`agent_app_base_url`,`icon`,`update_count`,`syscolor`) values ('SYSEDS01','身份源',NULL,'IDENTITY_SOURCE',0,'2017-02-08 21:29:52','2017-02-08 21:29:52',NULL,NULL,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,NULL,1,NULL),('SYSEDS02','组织源',NULL,'DEPT_SOURCE',0,'2017-02-08 21:29:53','2017-02-08 21:29:53',NULL,NULL,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,NULL,1,NULL),('SYSEDS03','病区源',NULL,'WARD_SOURCE',0,'2017-02-08 21:29:53','2017-02-08 21:29:53',NULL,NULL,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,NULL,1,NULL);

/*Table structure for table `fims_sys_sync_config` */

DROP TABLE IF EXISTS `fims_sys_sync_config`;

CREATE TABLE `fims_sys_sync_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '同步配置ID',
  `sys_id` varchar(20) NOT NULL COMMENT '系统ID',
  `sync_interval` varchar(30) DEFAULT NULL COMMENT '同步间隔',
  `push_type` varchar(8) DEFAULT NULL COMMENT '推送方式',
  `db_type` varchar(50) DEFAULT NULL COMMENT '数据库类型',
  `db_host` varchar(50) DEFAULT NULL COMMENT '数据库地址',
  `port` varchar(30) DEFAULT NULL COMMENT '端口号',
  `db_user` varchar(50) DEFAULT NULL COMMENT '用户名',
  `db_pwd` varchar(50) DEFAULT NULL COMMENT '密码',
  `instance` varchar(50) DEFAULT NULL COMMENT '实例名',
  `jdbc_url` varchar(100) DEFAULT NULL COMMENT 'jdbc_url',
  `table_name` varchar(100) DEFAULT NULL COMMENT '表名',
  `table_key` varchar(50) DEFAULT NULL,
  `rest_url` varchar(100) DEFAULT NULL COMMENT 'rest_url',
  `delete_flag` tinyint(1) DEFAULT '0' COMMENT '删除标志',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `delete_time` timestamp NULL DEFAULT NULL COMMENT '删除时间',
  `update_count` int(11) DEFAULT '1' COMMENT '更新次数',
  `use_sync_flag` tinyint(1) DEFAULT '0' COMMENT '是否启用同步',
  PRIMARY KEY (`id`),
  KEY `系统ID` (`sys_id`),
  CONSTRAINT `系统ID` FOREIGN KEY (`sys_id`) REFERENCES `fims_sys_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_sys_sync_config` */

/*Table structure for table `fims_user_menu` */

DROP TABLE IF EXISTS `fims_user_menu`;

CREATE TABLE `fims_user_menu` (
  `user_id` varchar(50) NOT NULL COMMENT '用户唯一编号',
  `menu_id` varchar(20) NOT NULL COMMENT '菜单ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`user_id`,`menu_id`),
  KEY `菜单ID` (`menu_id`),
  KEY `用户ID` (`user_id`),
  CONSTRAINT `用户唯一编号` FOREIGN KEY (`user_id`) REFERENCES `hr_employee` (`UUID`),
  CONSTRAINT `菜单ID` FOREIGN KEY (`menu_id`) REFERENCES `fims_menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_user_menu` */

/*Table structure for table `fims_user_nav_order` */

DROP TABLE IF EXISTS `fims_user_nav_order`;

CREATE TABLE `fims_user_nav_order` (
  `user_id` varchar(50) NOT NULL,
  `link_id` varchar(20) NOT NULL,
  `location` int(11) DEFAULT NULL,
  `is_custom_link` tinyint(1) DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT '0',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `delete_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`,`link_id`),
  KEY `FK_NAV_ORDER3` (`link_id`),
  CONSTRAINT `FK_NAV_ORDER1` FOREIGN KEY (`user_id`) REFERENCES `hr_employee` (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_user_nav_order` */

/*Table structure for table `fims_user_profile` */

DROP TABLE IF EXISTS `fims_user_profile`;

CREATE TABLE `fims_user_profile` (
  `uuid` varchar(50) NOT NULL,
  `user_color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fims_user_profile` */

/*Table structure for table `hr_employee` */

DROP TABLE IF EXISTS `hr_employee`;

CREATE TABLE `hr_employee` (
  `UUID` varchar(50) NOT NULL,
  `NAME` varchar(100) CHARACTER SET gbk NOT NULL,
  `DISPLAYNAME` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `PINYIN` varchar(200) DEFAULT NULL,
  `IS_DROPED` tinyint(1) NOT NULL DEFAULT '0',
  `GENDER` varchar(8) NOT NULL,
  `CODE` varchar(20) NOT NULL,
  `SN` varchar(40) DEFAULT NULL,
  `HOSPATIL` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `DISTRICT` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `DEPT_UUID` varchar(8) DEFAULT NULL,
  `DEPT_NAME` varchar(200) CHARACTER SET gbk DEFAULT NULL,
  `WARD_UUID` varchar(8) DEFAULT NULL,
  `WARD_NAME` varchar(200) CHARACTER SET gbk DEFAULT NULL,
  `PART_DEPT_UUID` varchar(8) DEFAULT NULL,
  `PART_DEPT_NAME` varchar(200) CHARACTER SET gbk DEFAULT NULL,
  `SUPER_UUID` varchar(8) DEFAULT NULL,
  `ON_THE_JOB` varchar(8) DEFAULT NULL,
  `ORGANIZATION_CATEGORY` varchar(8) DEFAULT NULL,
  `TITLE` varchar(8) DEFAULT NULL,
  `JOB_CATEGORY` varchar(8) DEFAULT NULL,
  `JOB_LEVEL` varchar(8) DEFAULT NULL,
  `JOB_NAME` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `OCCUPATION_CATEGORY` varchar(8) DEFAULT NULL,
  `OCCUPATION_LEVEL` varchar(8) DEFAULT NULL,
  `OCCUPATION_NAME` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `POSTS_CATEGORIES` varchar(8) DEFAULT NULL,
  `POSITION` varchar(8) DEFAULT NULL,
  `TYPE_OF_WORK` varchar(8) DEFAULT NULL,
  `LABOR_FORM` varchar(8) DEFAULT NULL,
  `USED_NAME` varchar(40) CHARACTER SET gbk DEFAULT NULL,
  `BIRTHDAY` date DEFAULT NULL,
  `IDENTITY_NO` varchar(30) DEFAULT NULL,
  `NATIVE` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `PRESENT_ADDRESS` varchar(200) DEFAULT NULL,
  `PRESENT_ADDRESS_POSTCODE` varchar(10) DEFAULT NULL,
  `HKSZD` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `BIRTH_PLACE` varchar(200) CHARACTER SET gbk DEFAULT NULL,
  `HEALTH` varchar(8) DEFAULT NULL,
  `BLOODTYPE` varchar(8) DEFAULT NULL,
  `NATION` varchar(8) DEFAULT NULL,
  `MARITAL_STATUS` varchar(8) DEFAULT NULL,
  `MOBILE_PHONE` varchar(20) DEFAULT NULL,
  `WORK_PHONE` varchar(20) DEFAULT NULL,
  `HOME_TELEPHONE` varchar(20) DEFAULT NULL,
  `FAX` varchar(30) DEFAULT NULL,
  `WXHM` varchar(50) DEFAULT NULL,
  `QQHM` varchar(50) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `LXR` varchar(20) CHARACTER SET gbk DEFAULT NULL,
  `LXR_ZJ` varchar(20) DEFAULT NULL,
  `LXR_SJ` varchar(20) DEFAULT NULL,
  `LXR_GX` varchar(20) DEFAULT NULL,
  `LXR_ZZ` varchar(200) DEFAULT NULL,
  `CJGZSJ` date DEFAULT NULL,
  `RZSJ` date DEFAULT NULL,
  `ZZSJ` date DEFAULT NULL,
  `CADRES_IDENTITY` varchar(8) DEFAULT NULL,
  `XCSZY` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `JYGWJL` varchar(20) DEFAULT NULL,
  `BYSJ` date DEFAULT NULL,
  `EDUCATION` varchar(8) DEFAULT NULL,
  `DEGREE` varchar(8) DEFAULT NULL,
  `SCHOOL_LENGTH` varchar(10) DEFAULT NULL,
  `BYXX` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `MAJOR` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `PARTY` varchar(8) DEFAULT NULL,
  `PARTY_DATE` date DEFAULT NULL,
  `CJDPSSZDW` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `LTXSJ` date DEFAULT NULL,
  `RETIRE_CATEGORY` varchar(8) DEFAULT NULL,
  `BRIDGE_CONDITION` varchar(8) DEFAULT NULL,
  `REMARK` varchar(1000) DEFAULT NULL,
  `DESCRIPTION` mediumtext,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPDATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hr_employee` */

/*Table structure for table `hr_web_user` */

DROP TABLE IF EXISTS `hr_web_user`;

CREATE TABLE `hr_web_user` (
  `UUID` varchar(50) NOT NULL,
  `DUUID` varchar(50) DEFAULT NULL,
  `USER_NAME` varchar(100) NOT NULL,
  `PASSWORD` varchar(100) NOT NULL,
  `ENCRYPTION_RULE` varchar(50) NOT NULL DEFAULT 'MD5',
  `VALID_DATE` date NOT NULL,
  `USER_FROM` varchar(50) DEFAULT '内置',
  `IS_ONLINE` tinyint(1) DEFAULT '0',
  `REMARK` varchar(1000) DEFAULT NULL,
  `PASSWORD_DES` varchar(100) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPDATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `is_admin` tinyint(1) NOT NULL DEFAULT '0',
  `is_enable` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`UUID`),
  UNIQUE KEY `XPK_HR_WEB_USER_USER_NAME` (`USER_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hr_web_user` */

/*Table structure for table `idff_access` */

DROP TABLE IF EXISTS `idff_access`;

CREATE TABLE `idff_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `idff_access` */

/*Table structure for table `idff_error` */

DROP TABLE IF EXISTS `idff_error`;

CREATE TABLE `idff_error` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `idff_error` */

/*Table structure for table `oauth2provider_access` */

DROP TABLE IF EXISTS `oauth2provider_access`;

CREATE TABLE `oauth2provider_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauth2provider_access` */

/*Table structure for table `oauth2provider_error` */

DROP TABLE IF EXISTS `oauth2provider_error`;

CREATE TABLE `oauth2provider_error` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `oauth2provider_error` */

/*Table structure for table `saml2_access` */

DROP TABLE IF EXISTS `saml2_access`;

CREATE TABLE `saml2_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `saml2_access` */

/*Table structure for table `saml2_error` */

DROP TABLE IF EXISTS `saml2_error`;

CREATE TABLE `saml2_error` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `saml2_error` */

/*Table structure for table `wsfederation_access` */

DROP TABLE IF EXISTS `wsfederation_access`;

CREATE TABLE `wsfederation_access` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wsfederation_access` */

/*Table structure for table `wsfederation_error` */

DROP TABLE IF EXISTS `wsfederation_error`;

CREATE TABLE `wsfederation_error` (
  `TIME` datetime DEFAULT NULL,
  `DATA` longtext,
  `IPAddr` varchar(255) DEFAULT NULL,
  `LoggedBy` varchar(255) DEFAULT NULL,
  `LoginID` varchar(255) DEFAULT NULL,
  `NameID` varchar(255) DEFAULT NULL,
  `ModuleName` varchar(255) DEFAULT NULL,
  `ContextID` varchar(255) DEFAULT NULL,
  `Domain` varchar(255) DEFAULT NULL,
  `LogLevel` varchar(255) DEFAULT NULL,
  `HostName` varchar(255) DEFAULT NULL,
  `MessageID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wsfederation_error` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
