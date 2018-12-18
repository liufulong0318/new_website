/*
Navicat MySQL Data Transfer

Source Server         : golden_oa
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : website

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-12-18 19:54:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for website_lunbotu
-- ----------------------------
DROP TABLE IF EXISTS `website_lunbotu`;
CREATE TABLE `website_lunbotu` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `url` varchar(255) COLLATE utf8_bin NOT NULL,
  `link` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `order` int(1) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_lunbotu
-- ----------------------------

-- ----------------------------
-- Table structure for website_pwd
-- ----------------------------
DROP TABLE IF EXISTS `website_pwd`;
CREATE TABLE `website_pwd` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `passWord` varchar(32) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_pwd
-- ----------------------------
INSERT INTO `website_pwd` VALUES ('9ffe6b2a-1b6d-4b0f-b50b-ef3c12c0111a', '1bbd886460827015e5d605ed44252251');
INSERT INTO `website_pwd` VALUES ('bb7c79e1-f748-4389-9bb4-30418b5fd9a9', '25d55ad283aa400af464c76d713c07ad');
INSERT INTO `website_pwd` VALUES ('d14b0ae0-db90-41f5-84a5-303cc3dc74c3', '1bbd886460827015e5d605ed44252251');

-- ----------------------------
-- Table structure for website_user
-- ----------------------------
DROP TABLE IF EXISTS `website_user`;
CREATE TABLE `website_user` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
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
INSERT INTO `website_user` VALUES ('9ffe6b2a-1b6d-4b0f-b50b-ef3c12c0111a', 'golden', '0', '0', '2018-12-17 15:38:00', null, null);
INSERT INTO `website_user` VALUES ('bb7c79e1-f748-4389-9bb4-30418b5fd9a9', 'forlong', '0', '0', '2018-12-17 15:28:56', null, null);
INSERT INTO `website_user` VALUES ('d14b0ae0-db90-41f5-84a5-303cc3dc74c3', 'golden', '0', '0', '2018-12-17 15:41:41', null, null);
