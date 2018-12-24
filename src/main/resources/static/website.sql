/*
Navicat MySQL Data Transfer

Source Server         : springboot
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : website

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-12-25 00:30:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for website_aboutus
-- ----------------------------
DROP TABLE IF EXISTS `website_aboutus`;
CREATE TABLE `website_aboutus` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `title` varchar(20) COLLATE utf8_bin NOT NULL,
  `imgurl` varchar(60) COLLATE utf8_bin NOT NULL,
  `content` varchar(2048) COLLATE utf8_bin NOT NULL,
  `introduction` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `honor` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `culture` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `course` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `order` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_aboutus
-- ----------------------------
INSERT INTO `website_aboutus` VALUES ('b203e2fc-9853-42c2-92a8-72e5f3d5bc2a', '关于我们', '/upload/08c62bc5-3f1f-489d-9e9b-1a270b310b95.png', '<h4><p><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;北京庚顿数据科技有限公司专业从事自主知识产权的&quot;实时数据库管理系统&quot;研发及产业化，作为一种基础软件，实时数据库管理系统在工业化和信息化融合过程中起着重要的支撑作用，是新一代信息技术产业中的关键。该领域关系国家安全、产业关联广泛，存在巨大的创新空间。<br></span></p><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>我们深知这项事业的艰巨性、复杂性和长期性。我们更清楚地认识到，没有基础软件的突破，我国就无法跻身世界信息技术产业强国之列。有鉴于此，我们立志“啃得了骨头、耐得住寂寞、顶得住诱惑”，决心长期专注实时数据库领域，打造优秀人才队伍、提升创新能力、突破核心技术、掌握自主知识产权、研发创新产品系列、形成高附加值的产业链条。&nbsp;&nbsp;<span><br></span></span><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>我们有一个梦想：让中国的实时数据库软件领先全球，让中国的基础软件领先全球!<br></span></p></p><p></p><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们坚信：就像中华民族的伟大复兴一定能实现一样，我们的梦想一定能实现!</p></h4>', '/product', '/product', '/product', '/product', '1', '2018-12-24 22:27:29');

-- ----------------------------
-- Table structure for website_cooperativeuser
-- ----------------------------
DROP TABLE IF EXISTS `website_cooperativeuser`;
CREATE TABLE `website_cooperativeuser` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `title` varchar(20) COLLATE utf8_bin NOT NULL,
  `imgurl` varchar(60) COLLATE utf8_bin NOT NULL,
  `order` int(2) NOT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_cooperativeuser
-- ----------------------------
INSERT INTO `website_cooperativeuser` VALUES ('06271d48-3be3-40f1-90e4-446ffadf535b', '天源科创', '/upload/7745d11e-981c-49fe-a1cd-628c8f688cb5.jpg', '6', '2018-12-24 11:38:14');
INSERT INTO `website_cooperativeuser` VALUES ('08a56ff2-c735-4ef5-9f7b-ff0f81784cb7', '天润新能', '/upload/caaa20f7-3394-41ad-9b92-e6d47906fa1d.jpg', '7', '2018-12-24 11:38:46');
INSERT INTO `website_cooperativeuser` VALUES ('0d4ad6c0-6fe7-4c7c-a113-f293b24c8f8c', '中国南方电网', '/upload/cee7b4a5-9621-4f41-b5ef-f6e66a2714c8.jpg', '16', '2018-12-24 11:47:50');
INSERT INTO `website_cooperativeuser` VALUES ('0ed23026-8554-4992-a326-2197586c93fa', '西安热工研究院有限公司', '/upload/ff66c36a-7b57-41f0-a0a5-80148723556b.jpg', '32', '2018-12-24 13:06:52');
INSERT INTO `website_cooperativeuser` VALUES ('0f7623cf-aa47-42f3-b65d-bffc7f4e8fef', '京能集团', '/upload/0a0ae8bb-6784-4222-9fec-00cc97433965.jpg', '17', '2018-12-24 11:48:16');
INSERT INTO `website_cooperativeuser` VALUES ('118f5079-cbc2-4fbe-b350-ab446b11ee51', '中国华电集团公司', '/upload/404b4db1-f6c8-476b-bf75-a89d4f69f03b.jpg', '14', '2018-12-24 11:45:14');
INSERT INTO `website_cooperativeuser` VALUES ('20890950-5edc-4407-9e37-d08be0334c60', '中国移动', '/upload/57d622cc-7481-4185-be4f-a94d71eeb049.jpg', '34', '2018-12-24 13:07:47');
INSERT INTO `website_cooperativeuser` VALUES ('3e8cd626-af62-4562-a5bc-de417a3385f9', '胜利油田', '/upload/233fee4b-5cd5-428e-a706-44c9eab0174f.jpg', '21', '2018-12-24 11:50:30');
INSERT INTO `website_cooperativeuser` VALUES ('4a120372-bb0b-408b-a7da-af18a2a5ee10', '中国联通', '/upload/68091155-2fd5-4b7b-928b-53130024d8cb.jpg', '5', '2018-12-24 11:37:47');
INSERT INTO `website_cooperativeuser` VALUES ('50acff3f-59d4-4ca4-bc22-3b4e4a9c4d47', '农夫山泉', '/upload/55460be0-4a6f-4166-8d4f-2dbeee9a14e1.jpg', '20', '2018-12-24 11:49:52');
INSERT INTO `website_cooperativeuser` VALUES ('520ce9b6-a3ae-479d-8a2a-bf5d6694fd86', '大x安监局', '/upload/e0aafdc4-49a6-4fa3-bac3-165e1fd00257.jpg', '28', '2018-12-24 13:02:22');
INSERT INTO `website_cooperativeuser` VALUES ('5e30405c-a47d-4c6e-8686-e74417cb3f22', '南瑞集团', '/upload/8863f6c3-fc7b-43d2-b548-d3de6bab2485.jpg', '4', '2018-12-24 11:37:21');
INSERT INTO `website_cooperativeuser` VALUES ('5fa98576-f049-46d3-abce-765223274d49', '华创风能', '/upload/e0b09848-d4a8-4671-96e1-8abe202094c6.jpg', '24', '2018-12-24 12:57:46');
INSERT INTO `website_cooperativeuser` VALUES ('6261dc34-907e-4fa8-bcbc-45e14e7aa60b', '国家电网', '/upload/ab9aa959-ed93-41e6-a348-97c70ba2f163.jpg', '13', '2018-12-24 11:44:20');
INSERT INTO `website_cooperativeuser` VALUES ('670ac178-662d-4b38-bb24-38b9a6cde294', '朗阳风电', '/upload/fc7003af-134f-4325-a7b3-35b1eeb0a0ea.jpg', '8', '2018-12-24 11:41:21');
INSERT INTO `website_cooperativeuser` VALUES ('6814c9a3-7c23-4c1e-a11a-95dc54918439', '宁夏嘉泽发电集团', '/upload/e80da2c0-2401-4e6d-912c-52579968bf82.png', '3', '2018-12-24 11:37:03');
INSERT INTO `website_cooperativeuser` VALUES ('687a0b6d-50b2-4b4a-b554-e1e216cef901', '中恒博瑞', '/upload/90d94ca7-e3f5-4e60-8c6e-62fa242ed38a.jpg', '33', '2018-12-24 13:07:26');
INSERT INTO `website_cooperativeuser` VALUES ('6c348578-6fc4-49d1-bead-16bbe564f613', '湖北能源集团股份有限公司', '/upload/7cdbdf83-fe8b-4f6c-a5ab-59279abcad79.jpg', '1', '2018-12-24 13:07:55');
INSERT INTO `website_cooperativeuser` VALUES ('71648dd6-d09a-4079-9a7c-8e28848f6048', '河南煤矿安监局', '/upload/08f4f8bc-f984-4d0c-bc17-c8e67e3736bf.png', '29', '2018-12-24 13:03:00');
INSERT INTO `website_cooperativeuser` VALUES ('73a94e56-bfde-494e-b921-7554cc3be15b', '四川安监局', '/upload/af509f42-fd53-463e-8c61-630eb8d54080.png', '27', '2018-12-24 13:00:13');
INSERT INTO `website_cooperativeuser` VALUES ('831243ef-fb8f-4aee-8396-4a315fbbd614', '北京华电天仁电力控制技术有限公司', '/upload/5787106d-8e20-4b0b-807c-daf06aa2db03.png', '30', '2018-12-24 13:04:16');
INSERT INTO `website_cooperativeuser` VALUES ('99f43874-721c-4ad6-97e9-e0fd049e7184', '金风科技', '/upload/fabf99f4-fd55-4ca5-b5d3-2a143e4f71b6.jpg', '9', '2018-12-24 11:41:45');
INSERT INTO `website_cooperativeuser` VALUES ('9b19714f-ac49-4546-b3d0-27d0e249f47f', '中国国电', '/upload/3c59ebf1-a39c-4f5a-8058-1e4682eb7d68.png', '15', '2018-12-24 11:47:21');
INSERT INTO `website_cooperativeuser` VALUES ('9c081e3e-f46a-4a7d-ac6d-6a5c3a9e30c4', '神华集团有限责任公司', '/upload/cb3e2300-3d0b-40e5-8ec9-37a3252688cf.jpg', '11', '2018-12-24 11:43:22');
INSERT INTO `website_cooperativeuser` VALUES ('a476e7bc-5bbe-4f7f-b8fa-6753dcdd8879', '中国大唐集团公司', '/upload/71efd8d4-93df-4b2f-9f34-a3f1d3fe74b3.jpg', '10', '2018-12-24 11:42:22');
INSERT INTO `website_cooperativeuser` VALUES ('a8a2a8ff-422f-4eb5-9aea-614f3d32a830', '国能生物发电集团', '/upload/9e71daeb-3982-4023-8af6-b713729ce233.jpg', '22', '2018-12-24 11:51:45');
INSERT INTO `website_cooperativeuser` VALUES ('bbbc5f47-9ace-46f3-84a4-15d5fadfee7a', '安泰股份', '/upload/69cb7ac2-6f66-4590-83a1-d748445fe5c7.jpg', '31', '2018-12-24 13:05:12');
INSERT INTO `website_cooperativeuser` VALUES ('c0fef97d-3c9f-4744-8138-961a905c8d66', '中国华能', '/upload/917038b7-e6ae-4bd5-a2d1-b6deba71cea2.jpg', '12', '2018-12-24 11:43:51');
INSERT INTO `website_cooperativeuser` VALUES ('d41ec6a6-6660-408d-ba08-5fd736cf996e', '岳能科技', '/upload/6e762064-99d9-4bc6-b59e-044fa86c1483.jpg', '2', '2018-12-24 13:12:12');
INSERT INTO `website_cooperativeuser` VALUES ('d98f3f94-ec0d-4620-92fc-4cd40f75d15e', '北京首领', '/upload/20453ebf-5fb7-4029-a9ff-d2016ffd008f.png', '23', '2018-12-24 12:57:17');
INSERT INTO `website_cooperativeuser` VALUES ('daf93f9a-494f-4834-a506-47e9fde8cddd', '洛阳北控水务', '/upload/f3411f6a-1a16-46d7-ac04-6b2ef7a62c1f.jpg', '26', '2018-12-24 12:59:15');
INSERT INTO `website_cooperativeuser` VALUES ('f8ae94f0-a2f7-45ec-b593-f2541e7738c4', '黄河上游水电开发有限公司', '/upload/00a6999c-d9bd-4bec-bfba-4fdab0857e47.png', '25', '2018-12-24 12:58:33');
INSERT INTO `website_cooperativeuser` VALUES ('f9fdedeb-b94b-475a-8cfd-032a4bfad787', '中国商飞', '/upload/98d778fc-52ba-45df-9f79-4b2c04d3bb17.jpg', '19', '2018-12-24 11:49:28');
INSERT INTO `website_cooperativeuser` VALUES ('fe080b1e-14f5-4355-9249-39ebf559e546', '华润电力', '/upload/e85beca2-7bb8-4cdf-a62b-d519ee0a8c29.jpg', '18', '2018-12-24 11:48:42');

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
-- Table structure for website_golden
-- ----------------------------
DROP TABLE IF EXISTS `website_golden`;
CREATE TABLE `website_golden` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `title` varchar(60) COLLATE utf8_bin NOT NULL,
  `content` varchar(8192) COLLATE utf8_bin NOT NULL,
  `module` int(2) NOT NULL COMMENT '1、成立宣言\r\n2、公司简介\r\n3、资质荣誉\r\n4、企业文化\r\n5、庚顿动态\r\n6、庚顿分享\r\n7、联系我们',
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_golden
-- ----------------------------
INSERT INTO `website_golden` VALUES ('10178314-85d1-4cce-837b-53ed09c2b5ad', '企业文化', '<p>庚顿愿景：技术达到世界领先，产品超越国际一流，产业确立民族品牌。<br><p>庚顿使命：做中国的数据库，助力中华民族的伟大复兴。<br><p>庚顿理念：专注、创新、发展。<br><p>专注于数据处理领域，坚持持续创新，实现企业的可持续发展；<br><p>只有专注我们才有高效率，只有持续创新我们才能立而不倒、不战而胜。<br><p>庚顿原则：一个中心、四个坚持<br><p>以解决问题为中心，坚持艰苦奋斗，坚持持续创新，坚持利益分享，坚持培训队伍。<br><p>庚顿文化：坦诚、分享、坚持。&nbsp;&nbsp;</p></p></p></p></p></p></p></p>', '4', '2018-12-25 00:19:19');

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
