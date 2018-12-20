/*
Navicat MySQL Data Transfer

Source Server         : golden_oa
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : website

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-12-20 19:59:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for website_dowhat
-- ----------------------------
DROP TABLE IF EXISTS `website_dowhat`;
CREATE TABLE `website_dowhat` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `iconUrl` varchar(60) COLLATE utf8_bin NOT NULL,
  `title` varchar(6) COLLATE utf8_bin NOT NULL,
  `hrefUrl` varchar(30) COLLATE utf8_bin NOT NULL,
  `order` int(1) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_dowhat
-- ----------------------------
INSERT INTO `website_dowhat` VALUES ('89df2270-9fc4-4d57-9408-81f6c2813385', '/upload/85fdc403-64d8-4d81-8bcb-1e0b393bca94.png', '工业可视化', '/product', '3', '2018-12-20 15:33:53');
INSERT INTO `website_dowhat` VALUES ('9ed50e78-b170-4957-b35e-0a7682594ee7', '/upload/16b3560a-f0aa-4eb3-9677-a0fa71d5686b.png', '实时数据库', '/product', '2', '2018-12-20 15:34:07');
INSERT INTO `website_dowhat` VALUES ('e9b7c8b9-738d-4291-83c6-b21f90fdee75', '/upload/4ad2575f-3db0-4c2c-a2e3-37cb0bc813dc.png', '通用组态', '/product', '1', '2018-12-20 11:27:20');

-- ----------------------------
-- Table structure for website_homeproduct
-- ----------------------------
DROP TABLE IF EXISTS `website_homeproduct`;
CREATE TABLE `website_homeproduct` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `title` varchar(20) COLLATE utf8_bin NOT NULL,
  `imgurl` varchar(60) COLLATE utf8_bin NOT NULL,
  `hrefurl` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `content` varchar(4096) COLLATE utf8_bin NOT NULL,
  `order` int(1) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_homeproduct
-- ----------------------------
INSERT INTO `website_homeproduct` VALUES ('ecaace84-9128-4f05-8084-5443fd11d432', '测试', '/upload/1d3800a5-b854-4d05-b57d-ab786bdc77f1.png', '/product', '测试', '1', '2018-12-20 19:51:41');

-- ----------------------------
-- Table structure for website_lunbotu
-- ----------------------------
DROP TABLE IF EXISTS `website_lunbotu`;
CREATE TABLE `website_lunbotu` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `name` varchar(30) COLLATE utf8_bin NOT NULL,
  `url` varchar(100) COLLATE utf8_bin NOT NULL,
  `link` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `order` int(1) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_lunbotu
-- ----------------------------
INSERT INTO `website_lunbotu` VALUES ('23f5cfa6-14c2-4533-b3f1-9df66cd2cae5', '助力物联网和大数据', '/upload/8bcbcb40-ddb3-40a0-910d-28c6f233b9bb.jpg', 'www.baidu.com', '4', '2018-12-20 09:25:59');
INSERT INTO `website_lunbotu` VALUES ('2e4a4370-8805-4fa8-896a-606fbd4cb5cb', '庚顿十年', '/upload/70666d69-6b8a-4939-8525-7bffcac661fb.jpg', 'www.baidu.com', '2', '2018-12-20 09:25:06');
INSERT INTO `website_lunbotu` VALUES ('e2253aa3-3973-46a2-942f-3baa8692b258', '庚顿时序数据库', '/upload/e6d4c4e7-46b4-468c-8c87-dd2d5a375128.jpg', 'www.baidu.com', '1', '2018-12-20 09:23:55');
INSERT INTO `website_lunbotu` VALUES ('f9c49deb-ea2a-45fa-85a2-3c0661c13e0a', '端云一体化', '/upload/eec8a605-415c-42a0-974d-8063ff3f5fdd.jpg', 'www.baidu.com', '3', '2018-12-20 09:27:41');

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
