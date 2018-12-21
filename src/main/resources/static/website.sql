/*
Navicat MySQL Data Transfer

Source Server         : golden_oa
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : website

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-12-21 18:04:12
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
INSERT INTO `website_homeproduct` VALUES ('2f621e39-7fcb-422f-86ab-76484b9cdcd9', '庚顿实时数据库管理系统', '/upload/91d27894-aee8-43eb-8f84-722dcbaef066.png', '/product', '实时数据库管理系统是工业领域信息化的核心基础软件，在两化融合中发挥重要作用，更是大数据、云计算、物联网等产业的核心支撑软件。庚顿十余年来，专注于“实时数据库管理系统”的研发及产业化。该产品已广泛应用于生产管理、先进控制、节能环保、石油化工、智慧能源、智能制造、车联网、智能电网等行业或领域。', '1', '2018-12-21 11:27:58');
INSERT INTO `website_homeproduct` VALUES ('364afe3d-f6ea-48d6-98ec-7c6bc57c072a', '庚顿智慧工业可视化平台', '/upload/85951f84-4a3e-42d2-9652-612f1056cfcd.png', '/product', '作为工业4.0的核心支撑平台，庚顿工业监控可视化平台面向智慧工业过程提供了集数据采集、存储、计算、分析及高级可视化于一体的产品级解决方案，用户可利用平台提供的监控组态软件、趋势分析系统、报警与事件系统等产品构建支撑智慧工业过程的高级应用。', '1', '2018-12-21 11:28:22');

-- ----------------------------
-- Table structure for website_industrycase
-- ----------------------------
DROP TABLE IF EXISTS `website_industrycase`;
CREATE TABLE `website_industrycase` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `title` varchar(20) COLLATE utf8_bin NOT NULL,
  `imgurl` varchar(60) COLLATE utf8_bin NOT NULL,
  `hrefurl` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `order` int(2) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_industrycase
-- ----------------------------
INSERT INTO `website_industrycase` VALUES ('13c48c9c-8010-4bfc-9baa-1c1eb0a7301e', '数据中心', '/upload/e2ccec57-14e9-4a80-827a-76632c1e9b62.png', '/product', '11', '2018-12-21 17:42:54');
INSERT INTO `website_industrycase` VALUES ('19c22f06-cbc0-4b5d-b9a8-5819991af1d5', '农夫山泉', '/upload/8a81e21b-37d3-4db6-9a60-1c0c3d4186ec.png', '/product', '5', '2018-12-21 14:59:08');
INSERT INTO `website_industrycase` VALUES ('1f82b0fa-4bd7-4819-9cc7-46377e5cdcdf', '胜利油田', '/upload/d22f15c5-6699-4e2c-b9a8-ed22a1b46951.jpg', '/product', '4', '2018-12-21 14:58:40');
INSERT INTO `website_industrycase` VALUES ('2152d0ba-4013-436a-bdcd-a870c0e8fef9', '国华能源', '/upload/d0e39d58-a0df-48ee-bfca-ffc8115862a4.jpg', '/product', '12', '2018-12-21 17:42:48');
INSERT INTO `website_industrycase` VALUES ('5b178731-a9c4-471f-8877-9dadc144fcab', '安徽安泰生物', '/upload/e01ba0f8-e25f-4435-bbbe-c8b27b560e4d.jpg', '/product', '3', '2018-12-21 14:58:16');
INSERT INTO `website_industrycase` VALUES ('6ffb2601-cac3-4d8e-ac7d-6270bc0bdce9', '煤矿领域', '/upload/80fc60ee-7beb-4013-9113-a0ec3d0a2f57.jpg', '/product', '7', '2018-12-21 17:34:14');
INSERT INTO `website_industrycase` VALUES ('9b4281b9-4333-477b-bf32-63eb4bba3fd7', '智能制造', '/upload/cadc38b0-ff0f-4ce0-a92d-f806b3d635bb.jpg', '/product', '10', '2018-12-21 15:03:59');
INSERT INTO `website_industrycase` VALUES ('a3fda4e9-7817-444d-9711-6ea68ec8ebb7', '国能生物集团', '/upload/19e62400-9cf9-4335-9464-1c1c2e05681b.png', '/product', '2', '2018-12-21 14:53:15');
INSERT INTO `website_industrycase` VALUES ('af0e923b-5e51-4f34-8986-34e18e7a34d1', '金风科技', '/upload/2e1fbaaa-22c9-4643-a1f5-6feac30abdad.jpg', '/product', '1', '2018-12-21 15:11:14');
INSERT INTO `website_industrycase` VALUES ('d7c66589-24d1-4e2e-9760-3c8016d7c34e', '国家电网', '/upload/5f6229d4-dec1-4fcb-a0f4-6b3c6b66340a.jpg', '/product', '8', '2018-12-21 15:00:29');
INSERT INTO `website_industrycase` VALUES ('f654d80e-771c-4661-974f-42fd58b9ecb9', '火电发电', '/upload/c05dfcda-d7d8-407e-ae00-f91010689405.png', '/product', '6', '2018-12-21 14:59:30');
INSERT INTO `website_industrycase` VALUES ('fb140881-a371-4a86-b1f4-538872f57d03', '光伏发电', '/upload/7383201c-a568-493f-826b-42016c2d8e11.jpg', '/product', '9', '2018-12-21 15:00:55');

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
