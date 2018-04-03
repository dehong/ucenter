# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.6.39)
# Database: u_passport
# Generation Time: 2018-04-03 14:47:57 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table t_role
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_role`;

CREATE TABLE `t_role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `type` varchar(20) DEFAULT '',
  `description` varchar(100) DEFAULT NULL,
  `delete_flag` tinyint(1) DEFAULT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `delete_time` datetime DEFAULT NULL,
  `update_count` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `t_role` WRITE;
/*!40000 ALTER TABLE `t_role` DISABLE KEYS */;

INSERT INTO `t_role` (`id`, `name`, `type`, `description`, `delete_flag`, `create_time`, `update_time`, `delete_time`, `update_count`)
VALUES
	(1,'管理员','admin','管理员',0,'2018-03-25 14:08:24','2018-03-26 23:48:35',NULL,3),
	(2,'普通用户','user','普通用户',0,'2018-03-25 14:08:24','2018-03-26 23:48:52',NULL,0),
	(3,'2','e',NULL,NULL,'2018-03-26 23:56:11','2018-03-26 23:56:11',NULL,0);

/*!40000 ALTER TABLE `t_role` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table t_role_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_role_user`;

CREATE TABLE `t_role_user` (
  `role_id` bigint(20) NOT NULL,
  `user_id` bigint(50) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`role_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `t_role_user` WRITE;
/*!40000 ALTER TABLE `t_role_user` DISABLE KEYS */;

INSERT INTO `t_role_user` (`role_id`, `user_id`, `create_time`)
VALUES
	(1,1,'2018-03-26 23:50:43'),
	(2,1,'2018-03-26 23:50:55'),
	(2,2,'2018-03-28 01:24:24');

/*!40000 ALTER TABLE `t_role_user` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table t_system_menu
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_system_menu`;

CREATE TABLE `t_system_menu` (
  `id` bigint(20) NOT NULL COMMENT '菜单id',
  `name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `description` varchar(100) DEFAULT NULL COMMENT '菜单描述',
  `parent_id` varchar(20) DEFAULT NULL COMMENT '父菜单id',
  `path` varchar(20) DEFAULT '菜单对应跳转页面的路径',
  `icon` varchar(20) DEFAULT '图标',
  `delete_flag` tinyint(1) DEFAULT NULL COMMENT '删除标志',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `update_count` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table t_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL,
  `u_id` bigint(20) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `encryption_rule` varchar(50) NOT NULL DEFAULT 'md5',
  `valid_date` date NOT NULL,
  `user_from` varchar(50) DEFAULT '内置',
  `is_online` tinyint(1) DEFAULT '0',
  `remark` varchar(1000) DEFAULT NULL,
  `password_des` varchar(100) DEFAULT NULL,
  `is_admin` tinyint(1) DEFAULT '0',
  `is_enable` tinyint(1) NOT NULL DEFAULT '1',
  `createtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;

INSERT INTO `t_user` (`id`, `u_id`, `user_name`, `password`, `encryption_rule`, `valid_date`, `user_from`, `is_online`, `remark`, `password_des`, `is_admin`, `is_enable`, `createtime`, `updatetime`)
VALUES
	(1,1,'hong','88163c52fdb7520d2da5295dcb52bff0','md5','2098-11-30','test',0,NULL,NULL,0,1,'2018-03-26 23:50:00','2018-04-01 15:09:26'),
	(2,2,'test','098f6bcd4621d373cade4e832627b4f6','md5','2099-00-00','test',0,NULL,NULL,0,1,'2018-03-28 01:24:52','2018-04-01 15:17:31');

/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table t_user_info
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_user_info`;

CREATE TABLE `t_user_info` (
  `id` bigint(20) NOT NULL,
  `name` varchar(50) NOT NULL DEFAULT '',
  `displayname` varchar(50) DEFAULT NULL,
  `pinyin` varchar(20) DEFAULT NULL,
  `gender` tinyint(8) NOT NULL,
  `code` varchar(20) NOT NULL,
  `sn` varchar(40) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `hospatil` varchar(100) DEFAULT NULL,
  `district` varchar(100) DEFAULT NULL,
  `dept_id` varchar(8) DEFAULT NULL,
  `dept_name` varchar(200) DEFAULT NULL,
  `ward_id` varchar(8) DEFAULT NULL,
  `ward_name` varchar(200) DEFAULT NULL,
  `part_dept_id` varchar(8) DEFAULT NULL,
  `part_dept_name` varchar(200) DEFAULT NULL,
  `super_id` varchar(8) DEFAULT NULL,
  `on_the_job` varchar(8) DEFAULT NULL,
  `organization_category` varchar(8) DEFAULT NULL,
  `title` varchar(8) DEFAULT NULL,
  `job_category` varchar(8) DEFAULT NULL,
  `job_level` varchar(8) DEFAULT NULL,
  `job_name` varchar(100) DEFAULT NULL,
  `occupation_category` varchar(8) DEFAULT NULL,
  `occupation_level` varchar(8) DEFAULT NULL,
  `occupation_name` varchar(100) DEFAULT NULL,
  `posts_categories` varchar(8) DEFAULT NULL,
  `position` varchar(8) DEFAULT NULL,
  `type_of_work` varchar(8) DEFAULT NULL,
  `labor_form` varchar(8) DEFAULT NULL,
  `used_name` varchar(40) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `identity_no` varchar(30) DEFAULT NULL,
  `native` varchar(100) DEFAULT NULL,
  `present_address` varchar(200) DEFAULT NULL,
  `present_address_postcode` varchar(10) DEFAULT NULL,
  `hkszd` varchar(100) DEFAULT NULL,
  `birth_place` varchar(200) DEFAULT NULL,
  `health` varchar(8) DEFAULT NULL,
  `bloodtype` varchar(8) DEFAULT NULL,
  `nation` varchar(8) DEFAULT NULL,
  `marital_status` varchar(8) DEFAULT NULL,
  `work_phone` varchar(50) DEFAULT NULL,
  `home_telephone` varchar(50) DEFAULT NULL,
  `fax` varchar(30) DEFAULT NULL,
  `wxhm` varchar(50) DEFAULT NULL,
  `qqhm` varchar(50) DEFAULT NULL,
  `lxr` varchar(20) DEFAULT NULL,
  `lxr_zj` varchar(20) DEFAULT NULL,
  `lxr_sj` varchar(20) DEFAULT NULL,
  `lxr_gx` varchar(20) DEFAULT NULL,
  `lxr_zz` varchar(200) DEFAULT NULL,
  `cjgzsj` date DEFAULT NULL,
  `rzsj` date DEFAULT NULL,
  `zzsj` date DEFAULT NULL,
  `cadres_identity` varchar(8) DEFAULT NULL,
  `xcszy` varchar(100) DEFAULT NULL,
  `jygwjl` varchar(20) DEFAULT NULL,
  `bysj` date DEFAULT NULL,
  `education` varchar(8) DEFAULT NULL,
  `degree` varchar(8) DEFAULT NULL,
  `school_length` varchar(10) DEFAULT NULL,
  `byxx` varchar(100) DEFAULT NULL,
  `major` varchar(100) DEFAULT NULL,
  `party` varchar(8) DEFAULT NULL,
  `party_date` date DEFAULT NULL,
  `cjdpsszdw` varchar(100) DEFAULT NULL,
  `ltxsj` date DEFAULT NULL,
  `retire_category` varchar(8) DEFAULT NULL,
  `bridge_condition` varchar(8) DEFAULT NULL,
  `desc` varchar(1000) DEFAULT NULL,
  `delete_falg` tinyint(1) NOT NULL DEFAULT '0',
  `createtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `t_user_info` WRITE;
/*!40000 ALTER TABLE `t_user_info` DISABLE KEYS */;

INSERT INTO `t_user_info` (`id`, `name`, `displayname`, `pinyin`, `gender`, `code`, `sn`, `email`, `phone`, `hospatil`, `district`, `dept_id`, `dept_name`, `ward_id`, `ward_name`, `part_dept_id`, `part_dept_name`, `super_id`, `on_the_job`, `organization_category`, `title`, `job_category`, `job_level`, `job_name`, `occupation_category`, `occupation_level`, `occupation_name`, `posts_categories`, `position`, `type_of_work`, `labor_form`, `used_name`, `birthday`, `identity_no`, `native`, `present_address`, `present_address_postcode`, `hkszd`, `birth_place`, `health`, `bloodtype`, `nation`, `marital_status`, `work_phone`, `home_telephone`, `fax`, `wxhm`, `qqhm`, `lxr`, `lxr_zj`, `lxr_sj`, `lxr_gx`, `lxr_zz`, `cjgzsj`, `rzsj`, `zzsj`, `cadres_identity`, `xcszy`, `jygwjl`, `bysj`, `education`, `degree`, `school_length`, `byxx`, `major`, `party`, `party_date`, `cjdpsszdw`, `ltxsj`, `retire_category`, `bridge_condition`, `desc`, `delete_falg`, `createtime`, `updatetime`)
VALUES
	(1,'王德红','王德红','WDH',1,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,'2018-03-26 23:51:56','2018-03-26 23:52:07');

/*!40000 ALTER TABLE `t_user_info` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
