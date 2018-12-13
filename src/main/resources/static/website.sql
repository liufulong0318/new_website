/*
Navicat MySQL Data Transfer

Source Server         : golden_oa
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : website

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-12-13 19:43:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for website_pwd
-- ----------------------------
DROP TABLE IF EXISTS `website_pwd`;
CREATE TABLE `website_pwd` (
  `id` int(38) NOT NULL,
  `passWord` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_pwd
-- ----------------------------

-- ----------------------------
-- Table structure for website_user
-- ----------------------------
DROP TABLE IF EXISTS `website_user`;
CREATE TABLE `website_user` (
  `id` int(38) NOT NULL,
  `loginUserName` varchar(30) COLLATE utf8_bin NOT NULL,
  `state` char(1) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '0，正常 1，锁定',
  `errorCount` int(1) NOT NULL DEFAULT '0',
  `registerTime` datetime NOT NULL,
  `sex` char(1) COLLATE utf8_bin DEFAULT '1' COMMENT '1 男，0 女',
  `name` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_user
-- ----------------------------
