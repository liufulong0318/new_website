/*
Navicat MySQL Data Transfer

Source Server         : golden_oa
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : website

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-12-27 19:21:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for demo
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `module` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `menu` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of demo
-- ----------------------------

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
INSERT INTO `website_aboutus` VALUES ('b203e2fc-9853-42c2-92a8-72e5f3d5bc2a', '关于我们', '/upload/08c62bc5-3f1f-489d-9e9b-1a270b310b95.png', '<h4><p><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;北京庚顿数据科技有限公司专业从事自主知识产权的&quot;实时数据库管理系统&quot;研发及产业化，作为一种基础软件，实时数据库管理系统在工业化和信息化融合过程中起着重要的支撑作用，是新一代信息技术产业中的关键。该领域关系国家安全、产业关联广泛，存在巨大的创新空间。<br></span></p><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>我们深知这项事业的艰巨性、复杂性和长期性。我们更清楚地认识到，没有基础软件的突破，我国就无法跻身世界信息技术产业强国之列。有鉴于此，我们立志“啃得了骨头、耐得住寂寞、顶得住诱惑”，决心长期专注实时数据库领域，打造优秀人才队伍、提升创新能力、突破核心技术、掌握自主知识产权、研发创新产品系列、形成高附加值的产业链条。&nbsp;&nbsp;<span><br></span></span></p><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>我们有一个梦想：让中国的实时数据库软件领先全球，让中国的基础软件领先全球!<br></span></p><p></p><p></p><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们坚信：就像中华民族的伟大复兴一定能实现一样，我们的梦想一定能实现!</p></h4>', '/about?id=dcdb9cc1-529d-40ad-8bb8-3fc313ca6dc4', '/about?id=86e81023-73c1-47d6-bb75-e25d16d797a0', '/about?id=192a78ad-d439-4ab0-a58d-b82023c89a81', '/about?id=f0453a5f-467d-4087-9b1a-2dea83530294', '1', '2018-12-27 16:26:28');

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
-- Table structure for website_enum
-- ----------------------------
DROP TABLE IF EXISTS `website_enum`;
CREATE TABLE `website_enum` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `enumkey` int(2) NOT NULL,
  `enumvalue` varchar(60) COLLATE utf8_bin NOT NULL,
  `type` int(1) NOT NULL COMMENT '1、module 2、menu 3、title',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_enum
-- ----------------------------
INSERT INTO `website_enum` VALUES ('026bf351-739d-4f93-b95b-fc1cc42c6417', '36', '行业领域', '2');
INSERT INTO `website_enum` VALUES ('06271d48-3be3-40f1-90e4-446ffadf535b', '1', '首页', '1');
INSERT INTO `website_enum` VALUES ('08a56ff2-c735-4ef5-9f7b-ff0f81784cb7', '2', '软件产品', '1');
INSERT INTO `website_enum` VALUES ('0d4ad6c0-6fe7-4c7c-a113-f293b24c8f8c', '3', '客户案例', '1');
INSERT INTO `website_enum` VALUES ('0ed23026-8554-4992-a326-2197586c93fa', '4', '行业领域', '1');
INSERT INTO `website_enum` VALUES ('0f7623cf-aa47-42f3-b65d-bffc7f4e8fef', '5', '关于庚顿', '1');
INSERT INTO `website_enum` VALUES ('118f5079-cbc2-4fbe-b350-ab446b11ee51', '34', '产品购买', '1');
INSERT INTO `website_enum` VALUES ('20890950-5edc-4407-9e37-d08be0334c60', '6', '资料下载', '1');
INSERT INTO `website_enum` VALUES ('3522e056-fc8b-4a93-a689-f0e6289e49d2', '0', '女', '5');
INSERT INTO `website_enum` VALUES ('38c0c68a-7677-41b2-bbfc-41b88203d2c0', '1', '禁用', '4');
INSERT INTO `website_enum` VALUES ('3e8cd626-af62-4562-a5bc-de417a3385f9', '7', '成立宣言', '2');
INSERT INTO `website_enum` VALUES ('4a120372-bb0b-408b-a7da-af18a2a5ee10', '8', '公司简介', '2');
INSERT INTO `website_enum` VALUES ('50acff3f-59d4-4ca4-bc22-3b4e4a9c4d47', '9', '资质荣誉', '2');
INSERT INTO `website_enum` VALUES ('520ce9b6-a3ae-479d-8a2a-bf5d6694fd86', '10', '企业文化', '2');
INSERT INTO `website_enum` VALUES ('5e30405c-a47d-4c6e-8686-e74417cb3f22', '11', '庚顿动态', '2');
INSERT INTO `website_enum` VALUES ('5fa98576-f049-46d3-abce-765223274d49', '12', '庚顿分享', '2');
INSERT INTO `website_enum` VALUES ('6261dc34-907e-4fa8-bcbc-45e14e7aa60b', '13', '联系我们', '2');
INSERT INTO `website_enum` VALUES ('670ac178-662d-4b38-bb24-38b9a6cde294', '14', '能效管控一体化平台', '3');
INSERT INTO `website_enum` VALUES ('6814c9a3-7c23-4c1e-a11a-95dc54918439', '15', '金风科技全球监控平台', '3');
INSERT INTO `website_enum` VALUES ('687a0b6d-50b2-4b4a-b554-e1e216cef901', '16', '国能生物生产运行监控系统', '3');
INSERT INTO `website_enum` VALUES ('6c348578-6fc4-49d1-bead-16bbe564f613', '17', '公共机构能耗监管中心', '3');
INSERT INTO `website_enum` VALUES ('71648dd6-d09a-4079-9a7c-8e28848f6048', '18', '国华能源生产管理信息系统', '3');
INSERT INTO `website_enum` VALUES ('73a94e56-bfde-494e-b921-7554cc3be15b', '19', '风电集控', '3');
INSERT INTO `website_enum` VALUES ('7572f283-5533-4a6c-b575-d38603088ef8', '1', '男', '5');
INSERT INTO `website_enum` VALUES ('831243ef-fb8f-4aee-8396-4a315fbbd614', '20', '轨道交通', '3');
INSERT INTO `website_enum` VALUES ('94e2ac45-bc6e-4c49-883d-2478f8d05e43', '35', '客户案例', '2');
INSERT INTO `website_enum` VALUES ('99f43874-721c-4ad6-97e9-e0fd049e7184', '21', '智慧城市', '3');
INSERT INTO `website_enum` VALUES ('9b19714f-ac49-4546-b3d0-27d0e249f47f', '22', '智能楼宇', '3');
INSERT INTO `website_enum` VALUES ('9c081e3e-f46a-4a7d-ac6d-6a5c3a9e30c4', '23', '火力发电', '3');
INSERT INTO `website_enum` VALUES ('a476e7bc-5bbe-4f7f-b8fa-6753dcdd8879', '24', '安全生产', '3');
INSERT INTO `website_enum` VALUES ('a8a2a8ff-422f-4eb5-9aea-614f3d32a830', '25', '智能电网', '3');
INSERT INTO `website_enum` VALUES ('ae74a824-6c00-4de9-ac15-0a674d16d665', '0', '正常', '4');
INSERT INTO `website_enum` VALUES ('bbbc5f47-9ace-46f3-84a4-15d5fadfee7a', '26', '节能环保', '3');
INSERT INTO `website_enum` VALUES ('c0fef97d-3c9f-4744-8138-961a905c8d66', '27', '智能消防', '3');
INSERT INTO `website_enum` VALUES ('d41ec6a6-6660-408d-ba08-5fd736cf996e', '28', '集团生产', '3');
INSERT INTO `website_enum` VALUES ('d98f3f94-ec0d-4620-92fc-4cd40f75d15e', '29', '数据库软件', '2');
INSERT INTO `website_enum` VALUES ('daf93f9a-494f-4834-a506-47e9fde8cddd', '30', '可视化软件', '2');
INSERT INTO `website_enum` VALUES ('f8ae94f0-a2f7-45ec-b593-f2541e7738c4', '31', '数据融合软件', '2');

-- ----------------------------
-- Table structure for website_golden
-- ----------------------------
DROP TABLE IF EXISTS `website_golden`;
CREATE TABLE `website_golden` (
  `id` varchar(36) COLLATE utf8_bin NOT NULL,
  `title` varchar(60) COLLATE utf8_bin NOT NULL,
  `content` varchar(8192) COLLATE utf8_bin NOT NULL,
  `menu` int(2) DEFAULT NULL,
  `module` int(2) NOT NULL COMMENT '1、成立宣言\r\n2、公司简介\r\n3、资质荣誉\r\n4、企业文化\r\n5、庚顿动态\r\n6、庚顿分享\r\n7、联系我们',
  `imgurl` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_golden
-- ----------------------------
INSERT INTO `website_golden` VALUES ('192a78ad-d439-4ab0-a58d-b82023c89a81', '企业文化', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿愿景：技术达到世界领先，产品超越国际一流，产业确立民族品牌。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿使命：做中国的数据库，助力中华民族的伟大复兴。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿理念：专注、创新、发展。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;专注于数据处理领域，坚持持续创新，实现企业的可持续发展；</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;只有专注我们才有高效率，只有持续创新我们才能立而不倒、不战而胜。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿原则：一个中心、四个坚持</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;以解决问题为中心，坚持艰苦奋斗，坚持持续创新，坚持利益分享，坚持培训队伍。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿文化：坦诚、分享、坚持。&nbsp;&nbsp;</p>', '10', '5', null, '2018-12-26 21:52:41');
INSERT INTO `website_golden` VALUES ('252dff90-6854-4c68-9bb7-d6440995f171', '公共机构能耗监管中心', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;所属行业：节能环保</p><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户名称：安徽省安泰科技股份有限公司</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户背景介绍：</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;安徽省安泰科技股份有限公司成立于2001年，隶属于安徽出版集团，公司业务覆盖建筑智能化、建筑电气节能、建筑光伏应用、工业节能领域，是集研发、生产、工程实施于一体的高新技术企业。</div><div>项目介绍：</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;“安泰云”能源管理平台是一套基于云构架的能源资源管理及改进的信息化管理平台。通过平台的建设和应用，辅助用户提升后勤管理水平：由传统的、基础的、二维化的管理模式向现代的、全面的、多维的模式转换。通过平台应用可以明确能源管理现状，科学分析重点能源，通过政策引导和管理手段应用，结合节能改进工作，最终达成能源合理配置目标的实现。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;能源管理平台能够实现能源统计、能源审计、能源评测、能源诊断、能源定额、能源公示等管理功能，主要应用于省级、市级能耗监管平台、区域或集团级能源资源消费管理平台、大型公共建筑、政府机关、学校、医院、大型商业综合体、科技馆、博物馆、体育场馆、工业企业、机场、企业酒店餐饮、产品类远程运维管理企业，物业管理公司等。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿实时数据库在此平台中负责完成能源数据的数字化采集，为上层能源数据可视化应用提供可靠的数据支撑。该平台已经成功应用于中央国家机关办公区节能监管体系建设项目、安徽省公共机构能耗监管平台、甘肃金昌市公共建筑能耗动态监测平台项目、浙江省荣军医院迁建项目能耗监控系统等众多节能项目中。</div>', '35', '3', null, '2018-12-26 17:24:30');
INSERT INTO `website_golden` VALUES ('2d5b9532-2f44-4ce8-a0c1-52497cecf94a', '庚顿数据输出适配器', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿数据输出适配器提供将实时数据库中采集到的数据以窄表、宽表模式实时输出到后端的各种管理及分析平台，为企业进行及时决策，快速管理，为数据的充分挖掘分析提供关键性支撑。庚顿数据输出适配器是一个开放的，具有高度可扩展、可配置式的插件管理系统。对应当前主流的数据管理和分析平台，输出适配器目前可以将数据灵活输出到Hadoop大数据平台以及Oracle、MySql、SqlServer等关系数据库中。&nbsp;&nbsp;<br></p>', '31', '2', null, '2018-12-26 14:09:17');
INSERT INTO `website_golden` VALUES ('37d0add5-e027-404b-a6fd-568add4f549f', '智能电网', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;以信息化、自动化、互动化为特征的智能电网在发电、输电、变电、配电、用电和调度六个环节产生海量数据。这些数据是智能电网的重要基础。</p><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;基于实时数据库建立的海量实时/历史数据管理平台，可以满足智能电网各业务应用对海量实时/历史数据进行整合、存储、共享、统一访问的需求。</div><p><img src=\'/upload/e3b26b82-4943-41f0-b521-d0549c93ff4d.png\'><br></p>', '36', '4', '/upload/277c4fb2-fc3b-45aa-97dd-1c426b967736.jpg', '2018-12-26 21:17:54');
INSERT INTO `website_golden` VALUES ('3e3750be-7a9c-406d-9716-161e7116ff41', '庚云实时数据库管理系统', '<p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\'#808080\' face=\'微软雅黑, sans-serif\'>庚云实时数据库管理系统是庚顿公司推出的具有自主知识产权的工业基础软件产品。用于采集、存储、分析机器设备产生的海量实时/历史传感数据。特别适用于工业自动化、生产管理、节能环保、智能制造、智慧城市、智慧医疗等领域。</font></p><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\'#808080\' face=\'微软雅黑, sans-serif\'>庚云实时数据库管理系统支持多种工业及物联网通信协议，可采集现场传感数据并做分析处理。支持C++、java、.net等二次开发接口，可将数据提供给上层应用系统，并能与Hadoop、Spark等主流的大数据平台有机融合。</font></p><p>&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\'#808080\' face=\'微软雅黑, sans-serif\'>庚云实时数据库管理系统作为庚顿公司旗舰版实时数据库，通用性和易用性极高，数据库管理人员可快速掌握。用户可方便地基于实时数据库构建各类应用系统，包括：&nbsp; &nbsp;</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（1）海量实时/历史数据中心</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（2）发电厂厂级监控信息系统（SIS）</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（3）流程企业制造执行系统（MES）</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（4）企业能源管理系统（EMS）</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（5）数据采集与监视控制系统（SCADA）</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（6）生产过程监控系统</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（7）生产调度系统</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（8）水利、环境、油井、煤矿、城市管网、通信基站等远程监控系统</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（9）城市轨道交通综合监控系统</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（10）电动汽车远程服务与管理系统</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（11）智慧城市集中监控系统</font></p><p><font color=\'#808080\' face=\'微软雅黑, sans-serif\'>（12）传感器数据采集与交换系统</font></p>', '29', '2', null, '2018-12-26 16:32:45');
INSERT INTO `website_golden` VALUES ('40a4dded-ac8c-4784-8233-25366af46794', '联系我们', '<div>地址:北京市海淀区中关村软件园2号楼B座一层<br></div><div>&nbsp;</div><div>行车线路:城铁昌平线、13号线西二旗站下，步行8分钟即到；</div><div>&nbsp;</div><div>公交447路，509路，963路，570路，专34路环线，</div><div>&nbsp;</div><div>快速直达专线80路，333路，365路，642路，982路软件园广场下。<br></div><div>&nbsp;</div><div>电话:400-628-5226&nbsp;010-82790169</div><div>&nbsp;</div><div>传真:010-82825226·</div><div>&nbsp;</div><div>电子邮件:service@golden-data.com.cn</div>', '13', '5', null, '2018-12-26 21:58:34');
INSERT INTO `website_golden` VALUES ('4389ca2d-b024-4c39-961c-0547e0ec88a2', '轨道交通', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;城市轨道交通综合监控系统，以实时监控为主要应用目的，实现电力调度、机电设备监控、车站运营状态监视等功能。在体系架构设计和接口方面主要侧重于实时设备监控和数据处理，实时数据及历史数据的管理。系统主要由中心服务器及车站端、车辆段端、停车场端服务器构成，以实时数据库和关系数据库为基础构建。&nbsp;<br></p><p><img src=\'/upload/f1d96239-ef76-476e-a061-a1e4f25a3d67.png\'><br></p>', '36', '4', '/upload/f3b06a3d-28ed-40f7-ac23-c37a42ff1068.jpg', '2018-12-26 21:27:44');
INSERT INTO `website_golden` VALUES ('56895bb2-13ba-4e09-bc23-8e9fe0692e39', '节能环保', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿实时数据库可集中管理厂区、园区内的水、电、暖等各类资源的实时传感数据。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;通过对厂区、园区内各种用电、用水和用能设备的集中监视和管理，实现能源管理现代化，达到减少浪费、节约能源的目的。这是两化融合推动节约型社会建设的重要途径。</p><p><img src=\'/upload/4bc8206d-ea78-4b1d-9a9e-377d14eb5e8e.png\'><br></p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;环境实时监测可通过实时数据库有效管理环境质量监测数据，如：空气、水、噪声、辐射等，以及污染源监控数据，如：燃煤锅炉烟气、建筑工地扬尘、污水处理厂水质、传染病医院污水等。</p><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用户以此为基础，可以分析、展示环境质量状况及其变化规律、污染源排放汲取变化状况、环境风险和隐患，实现环境管理与污染源监管，完成城市环境质量目标，保障城市环境安全。</div><p><img src=\'/upload/e040a02d-5f1c-48b5-8e06-2298bf6cf698.png\'><br></p>', '36', '4', '/upload/10353cb4-e241-4810-a9b3-a29ee37c3260.jpg', '2018-12-26 21:17:35');
INSERT INTO `website_golden` VALUES ('5cbfe939-2761-4a64-ae9d-39979703f7a2', '庚顿数据采集适配器', '<div>&nbsp;为机器数据量身定制，数据采集适配器作为庚云工业大数据平台数据处理层的前端采集系统，主要负责数据采集并将采集的数据存储到实时数据库。支持分布式部署及单机部署。它能够将工业中常见的各种协议格式或自定义格式的数据输入到主流实时数据库中。支持OPC协议、电力IEC103\\104规约、控制器Modbus协议、各种PLC设备，以及可自定义格式的文件采集器，支持常见关系型数据库的采集器等。</div><p>&nbsp;</p>', '31', '2', null, '2018-12-26 14:08:52');
INSERT INTO `website_golden` VALUES ('7d4189eb-d706-40f5-a656-debc017f41d5', '国华能源生产管理信息系统', '<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;所属行业：风力发电</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户名称：国华能源投资有限公司</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户背景介绍：</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 国华能源投资有限公司于1998年经国务院领导批示，由原国家计委以煤代油资金办公室改制而成，隶属于中央特大型能源企业——神华集团，主要任务是进行以风力发电为主的可再生能源投资开发以及管理和回收煤代油资金。截止到2014年6月底，公司拥有独资、控股子公司54家，年营业收入达55.7亿元，管理总资产超过600亿元，已并网运行风电场及光伏电站45个，并网容量511万千瓦。</div><div>项目介绍：</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 国华能源投资有限公司数据中心项目是由国华集团信息中心牵头打造的包含全公司所有新能源电站接入的数据中心系统和多个区域集中监控系统项目。项目包含北京总部生产管理系统、河北赤沽集控中心、山东集控中心、河北尚义集控中心的建设和所有电站的接入。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 项目由北京岳能科技公司于2015年承建，实现现场不同监控系统、不同风机机型监控的统一接入、统一监视和统一控制。基于数据中心大数据分析的基础上，实现运维策略优化。通过对实时数据库累计收集的风机各个设备、零部件的实时/历史数据、故障数据、气候数据等进行检测、分析和挖掘，得到设备发生异常、故障或损坏的概率与设备品牌、使用年限、运行状态以及外部条件等因素的关系，为现场工作人员提前维修、更换或是准备备件提供数据支持。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 由于风电场/光伏电站地处偏远且分布分散，为了标准化统一管理，及时有效的掌握生产信息，国华投资公司建立了一个由总部数据应用中心、分公司数据应用中心及电场生产管理组成的生产管理信息系统，在山东新户区域建设以新户风电场为中心的集控中心，在河北赤城沽源地区建设以恒泰升压站为中心的集控中心。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 整个系统基于庚顿实时数据库构建，分别在总部和各分公司、区域集控中心部署庚顿实时数据库，使用庚顿实时数据库的标准采集接口完成现场数据的实时采集、存储，通过庚顿实时数据库强大的镜像功能向集团总部实时汇聚传输全量数据，实现数据由分公司到区域集控中心再到北京数据中心的层级递进汇总，打造了一套覆盖全集团公司的分布式数据库网络。目前该项目已完成并投入运行，获得客户高度认可。</div>', '35', '3', null, '2018-12-26 17:25:53');
INSERT INTO `website_golden` VALUES ('86e81023-73c1-47d6-bb75-e25d16d797a0', '资质荣誉', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;北京庚顿数据科技有限公司专业从事自主知识产权的\'实时数据库管理系统\'研发及产业化，作为一种基础软件，实时数据库管理系统在工业化和信息化融合过程中起着重要的支撑作用，是新一代信息技术产业中的关键。该领域关系国家安全、产业关联广泛，存在巨大的创新空间。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们深知这项事业的艰巨性、复杂性和长期性。我们更清楚地认识到，没有基础软件的突破，我国就无法跻身世界信息技术产业强国之列。有鉴于此，我们立志“啃得了骨头、耐得住寂寞、顶得住诱惑”，决心长期专注实时数据库领域，打造优秀人才队伍、提升创新能力、突破核心技术、掌握自主知识产权、研发创新产品系列、形成高附加值的产业链条。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们有一个梦想：让中国的实时数据库软件领先全球，让中国的基础软件领先全球!</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们坚信：就像中华民族的伟大复兴一定能实现一样，我们的梦想一定能实现!</p>', '9', '5', null, '2018-12-26 21:51:27');
INSERT INTO `website_golden` VALUES ('871c449a-c64d-45cc-8a4d-a7a49bb7d348', '成立宣言', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;北京庚顿数据科技有限公司专业从事自主知识产权的\'实时数据库管理系统\'研发及产业化，作为一种基础软件，实时数据库管理系统在工业化和信息化融合过程中起着重要的支撑作用，是新一代信息技术产业中的关键。该领域关系国家安全、产业关联广泛，存在巨大的创新空间。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们深知这项事业的艰巨性、复杂性和长期性。我们更清楚地认识到，没有基础软件的突破，我国就无法跻身世界信息技术产业强国之列。有鉴于此，我们立志“啃得了骨头、耐得住寂寞、顶得住诱惑”，决心长期专注实时数据库领域，打造优秀人才队伍、提升创新能力、突破核心技术、掌握自主知识产权、研发创新产品系列、形成高附加值的产业链条。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们有一个梦想：让中国的实时数据库软件领先全球，让中国的基础软件领先全球!</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们坚信：就像中华民族的伟大复兴一定能实现一样，我们的梦想一定能实现!</p>', '7', '5', null, '2018-12-26 21:49:40');
INSERT INTO `website_golden` VALUES ('88d4d7d3-b783-4615-acfd-06e65a2959d3', '能效管控一体化平台', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;能效管控一体化平台是一个以能源管理为中心的信息系统管理平台，从设计的角度使用不同的视图对系统进行综合的描述，包括数据采集、综合监控、与信息系统交换、节能调度管理支持、基础能源管理、重点能耗设备管理、能源信息发布、系统配置及权限管理等部分。系统可采集DCS/PLC中的生产数据及计量数据，提供对生产运行数据的在线查询功能，实现能源管理及全厂能源信息的充分共享；这套完整安全可靠的实时能源数据管理系统能够提高生产过程运行的质量和效率，节能降耗，增加企业的经济效益。&nbsp;&nbsp;<br></p><p><img src=\'/upload/366a68c3-d7f1-4f51-979a-03dc414f9176.png\'><br></p><p><img src=\'/upload/7bf92dcb-97a1-4f48-a308-304ac3be5dca.png\'><br></p><p>重点用户：顺成集团</p><p>项目名称：河南省顺成集团能源管理中心实时生产能源管理信息系统</p><p>案例简介：</p><p>&nbsp; &nbsp; &nbsp; &nbsp;能源管理中心系统搭建在集团办公大楼，与ERP、OA等现有信息系统对接并实现数据共享。集团各分厂、车间或主要设备对于已有DCS或PLC已经采集的能源数据通过与DCS系统接口方式实现，同时对于不具备自动采集条件的重点监测点通过人工录入方式上送到中心，以满足集团能源集中管理的需要。</p><p>&nbsp; &nbsp; &nbsp; &nbsp;系统具有实时数据采集、海量数据存储、历史数据追忆和数据分析的能力，系统不仅将分散在各生产现场的实时能源信息集成起来，并为管理者提供全面的实时监控能源信息的统一平台，通过对数据的再次加工处理，提炼出真正对生产管理、经营决策有用的数据，从而在产生经营管理和实时过程控制之间架起一座桥梁，达到两者之间的信息交换和紧密集成。</p><p>&nbsp; &nbsp; &nbsp; &nbsp;系统以庚顿实时数据库管理系统和能效管控平台为基础建设，可采集DCS/PLC中的生产数据和计量数据，具备对生产运行数据的在线查询能力，实现全厂能源信息的充分共享；是一套完整的、安全可靠的实时能源数据管理系统，提高生产过程运行质量和效率，节能降耗，增加企业的经济效益。</p><p><img src=\'/upload/ad4b8a72-cc9f-4eab-b941-897669977f22.png\'><br></p><p><img src=\'/upload/e75bb86f-5932-40a1-8e5d-781bffd84739.png\'><br></p>', '35', '3', null, '2018-12-26 17:20:15');
INSERT INTO `website_golden` VALUES ('95439259-4e90-41bb-ab77-6d2e75ca60db', '庚顿可视化产品系列', '<p>趋势与分析系统</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 庚顿趋势与分析系统包含了成组监控，历史趋势查询，选定时间段内的极值查询及实时趋势显示等功能，根据各专业人员所关心的数据进行编组和呈现，可以根据业务需要灵活调整趋势参数。为实现数据趋势查询和分析提供了有力的软件层面支撑。</p><p><img src=\'/upload/ea884c59-646e-452a-99eb-71e7ae7be4d3.png\'><br></p><p>&nbsp;报警与事件系统</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; 对过程/流程中的重要事件进行管理，可实现阈值报警、状态变化报警，可设置报警延时和阈值死区。支持实时报警管理、历史报警查询与报警统计。支持多级别管理，支持语音、弹窗提示。支持移动端订阅。&nbsp;</p><p><img src=\'/upload/dd10b9c1-b4b9-4fe6-92db-adea0df25c2d.jpg\'><br></p><p>&nbsp;场站集中监控系统</p><p>&nbsp;</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 庚顿场站集中监控系统（SCADA）拥有极其出色的可视化效果和操控性能，可依托庚顿监控组态平台快速构建和发布，同时支持C/S和B/S架构部署。产品依托HTML5前沿技术框架，可完美实现三屏融合，支持任意内核的浏览器。</p><p><img src=\'/upload/97663a90-c990-41f1-85ff-2908c4bf2bed.jpg\'><br></p><p><img src=\'/upload/cc0292cc-b236-46b1-8285-dfbf6641f47a.png\'><br></p><p><img src=\'/upload/d714bb21-ca8b-414e-a901-d8e9c03affd6.jpg\'><br></p>', '30', '2', null, '2018-12-26 16:53:31');
INSERT INTO `website_golden` VALUES ('977d4876-ae0c-45b2-8c05-53738d41d376', '金风科技全球监控中心', '<div>所属行业：新能源</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户名称：金风科技</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户背景介绍：</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;金风科技是全球领先的风电设备研发及制造企业以及风电整体解决方案提供商。两次荣获美国麻省理工学院《科技评论》杂志评选出的“全球最具创新能力企业50强”。拥有自主知识产权的直驱永磁技术，目前是全球最大的直驱永磁风机研制企业，同时在深圳证券交易所 (股票代码：002202)和香港联合交易所(股票代码：2208)上市，员工6000余人。</div><div>项目介绍：</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;金风科技全球风机管理系统是一套风电大数据管理与应用系统，建立于金风科技北京亦庄总部，于2014年正式投入使用。该系统目前已经接入全球2万多台风电机组数据，未来该系统将持续接入更多的机组数据。这套管理系统包含三个应用子系统：全球监控中心系统、全生命周期资产管理系统和大数据预警系统。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;全球监控中心系统负责记录各地风场的数据和运行情况，清晰展现风机功率、装机量和风速等基础变量。运维人员登陆监控系统，在线了解风机实时状况，如有任何异常，可在全生命周期资产管理系统上进行操作，系统立即作出分析，提供处理方案、注明需要的工具、备件及安全注意事项，免去值班员到风场巡检、观察、分析等一系列耗时费力的工作，实现了现场无人值守、远程维护的功能。预警系统能识别亚健康状态机组，通过海量数据的分析处理，预防性发现80%-90%的风机故障，运行准确率达70%以上。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿实时数据库在此项目中负责整合、管理、计算2万多台风电机组的近千万个传感数据，实现秒级实时数据刷新，每秒钟进行上百万次原始数据计算，提供高效数据接口满足上层应用系统的调取和全球客户端的访问。</div>', '35', '3', null, '2018-12-26 17:21:29');
INSERT INTO `website_golden` VALUES ('97ba3bfd-4ea1-456f-980e-e89aa32ec28a', '庚顿分享', '<blockquote>什么是实时数据库？</blockquote><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;实时数据库(RTDB-Real Time DataBase)是数据和事务都有定时限制的数据库，适用于处理不断更新的快速变化的数据及具有时间限制的事务处理，是数据库系统发展的一个重要分支。通俗地讲，实时数据库就是一种采集、存储和分析随时间快速变化的海量数据的软件产品，是现代工业生产信息化的核心基础软件。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其特点主要表现在数据的时效性和事务的定时限制上：数据实时性就是现场IO&nbsp;数据的更新周期，作为实时数据库，必须考虑数据实时性。一般数据的实时性主要受现场设备的制约，特别是对于一些比较老的系统而言，更是如此。事务实时性是指数据库对其事务处理的速度。它可以是事件触发方式或定时触发方式。事件触发是指该事件一旦发生则立刻获得调度，这类事件可以得到立即处理，但是比较消耗系统资源：而定时触发是指在一定时间范围内获得调度权。作为一个完整的实时数据库，必须同时提供两种调度方式来保证系统的稳定性和实时性。</div><blockquote>实时数据库有哪些应用领域？</blockquote><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;目前，实时数据库已经被广泛应用于电力、钢铁、石油、化工、水泥、造纸等流程工业，为系统的优化运行和设备可靠性检修提供了坚实的技术基础。虽然实时数据库产生于流程工业，但很多非典型流程工业如环保、交通、水利、金融、航空航天、物联网等行业也会产生大量随时间变化的实时数据，也需要实时数据库进行处理，因此，如今实时数据库的应用领域已逐步延伸至环保、交通、金融等非流程行业领域。</div><div>庚顿实时数据库适用于电力、石油、化工、钢铁、有色金属、矿业、环保等流程行业及交通、电信、邮电等非流程行业的数据融合、存储、分析、利用和发布。庚顿实时数据库可以高效、准确、方便地融合、管 理、处理数以万计的实时数据测点，并提供处理、计算、分析工具，帮助用户将数据提升为信息、进而形成可辅助决策的知识。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;在电网领域，庚顿实时数据库是智能电网的重要支撑。以信息化、自动化、互动化为特征的智能电网在发电、输电、变电、配电、用电和调度六个环节产生海量数 据。这些数据是智能电网的重要基础。基于庚顿实时数据库建立海量实时 /历史数据管理平台，可满足智能电网各业务应用对海量实时/历史数据进行整合、存储、共享、统一访问的需求。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;在发电领域，庚顿实时数据库常被用作发电厂厂级监控信息系统(SIS: Supervisory Information System)的核心。系统通过对DCS、脱硫、输煤、除灰、化水等数据的集中采集和存储管理，实现生产实时监控，进而进行机组级和厂级 性能计算、耗差分析、能量审计，形成负荷优化分配、操作优化指导等辅劣决策知识，以提高发电厂的经济性和安全性。随着高级应用模块Golden GDXP的推出，庚顿实时数据库产品线更加完善，可构建収电集团生产实时数据融合平台， 集成各分厂实时生产信息，为集团实时掌握下属各企业生产动态、实现精细化管理提供平台支撑。</div><div>在石油、化工等流程行业，以庚顿实时数据库为基础可构建制造执行系统 （MES：Manufacturing Execution System）。系统集成来自进程的各种运行数据（开关量、模拟量和累计量），实现生产实时监控、车间生产调度管理、校正物流数据、故障预测预警，最终为企业的经营决策提供科学依据。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;在各类能源、资源消耗较大的企业，以庚顿实时数据库为核心构建的能源管理系统（EMS: Energy Management System）可从各信息点获取能源、资源 消耗数据，实现企业级的能源数据集中监控、管理和统一调度。能源、资源介质包括：电、水、蒸汽、压缩空气、燃煤等。能源管理系统可以根据数据分析、计算的 结果实现不同介质之间的优化平衡，最终为节能降耗、清洁生产服务。</div><blockquote>实时数据库与关系数据库的区别？</blockquote><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;关系数据库产生于20&nbsp;世纪60&nbsp;年代，是目前在数据库领域中应用最为广泛的数据库产品，主要用于人、财、物的管理，广泛服务于各个行业的管理领域。而实时数据库则是随着20&nbsp;世纪80&nbsp;年代工业信息化的发展而产生的，主要服务于流程企业的生产领域，目前已延伸应用于非流程工业。它的功能主要是将生产过程中产生的大量实时数据采集和存储下来为下一步的优化分析提供数据基础。目前，关系数据库的发展已成熟，实时数据库则尚处于发展阶段，应用空间较大。除关系数据库、实时数据库外，其他类型的数据库主要被用来满足特定领域对数据存储的个性化需求，因此它们的应用范围往往限于某一领域，如：应用于网络搜索的非结构化数据库等。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;实时数据库与其它数据库最大的不同点就是它的时间特性较为明显，实时数据库当中的活动、事件、数据都有与之相关的时间限制。除实时性以外，实时数据库的压缩效率和检索能力等方面也远远优于关系数据库。在流程工业中由于生产线规模很大、流程很长，在任一时点生产线均会产生大量生产数据（如：温度、压力、流量等），只有采用实时数据库才能对如此大量生产数据进行存储。关系数据库与实时数据库分别有各自适用的领域，目前关系数据库技术已经成熟，主要应用于管理和商务领域，但它无法满足工业生产领域数据的实时采集、存储和数据分析的需求。实时数据库作为一种新兴的数据库技术是为了解决关系数据库的这一不足而出现的，实时数据库的重要特点是对大量不断更新、快速变化的实时数据处理能力强，能够从工业生产领域的自动化设备上采集、存储生产的全面数据最终形成一个数据平台，以便为工业企业对数据进行分析和优化提供支持。</div>', '12', '5', null, '2018-12-26 21:57:56');
INSERT INTO `website_golden` VALUES ('a3a4dd9d-df52-4890-b8e9-e16654394d1c', '智能楼宇', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;智慧楼宇平台基于庚顿实时数据库并采用先进的计算机控制技术，管理软件和节能系统程序，使建筑物机电或建筑群内的设备有条不紊、综合协调、科学地运行，从而达到有效地保证建筑物内有舒适的工作环境、实现节能、节省维护管理工作量和运行费用的目的。平台主要采集监测存储楼宇的主要耗电设备空调的运行情况，包括电流电压以及用电量等参数。分析不同时间段和分布在不同地点的空调耗电情况，可以准确诊断空调系统故障，合理选配使用空调，以及节约用电。<br></p><p><img src=\'/upload/3bb3c9f9-d8f8-443c-a76d-3330cf68c4eb.png\'><br></p>', '36', '4', '/upload/34c8503c-87c5-440c-89b9-94468ff0cf7e.jpg', '2018-12-26 21:18:33');
INSERT INTO `website_golden` VALUES ('aca1dbc0-11d1-4559-afe4-9c91633c0a45', '火力发电', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发电厂厂级监控信息系统是通过实时数据库对DCS、脱硫、输煤、除灰、化水等数据的集中采集和存储管理，实现生产实时监控，进而进行机组级和厂级性能计算、耗差分析、能量审计，形成负荷优化分配、操作优化指导等辅助决策知识，以提高发电厂的经济性和安全性。&nbsp;&nbsp;<br></p><p><img src=\'/upload/379769e5-28db-43a0-a73f-6ec3c9919671.png\'><br></p>', '36', '4', '/upload/a8b80f11-45bc-4f30-8145-10e7614c41a2.png', '2018-12-26 21:17:10');
INSERT INTO `website_golden` VALUES ('b5de9acc-4a82-44b9-b4af-fb362d8fb417', '庚星时序数据库管理系统', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;庚顿公司聚十年实时数据库研发之核心技术，专为物联网、边缘计算打造庚星时序数据库管理系统。支持中国制造2025，普惠中小企业直通工业4.0！</p><p>&nbsp; &nbsp; &nbsp; &nbsp; 庚星时序数据库是专门用于存储和处理机器设备产生的传感数据，特别适用于物联网设备监控、企业能源管理、生产安全监控、电力监控等行业场景。时序数据库可帮助企业洞察全局数据趋势，实时发现数据异常，降低生产风险，控制成本提升产能和效益。</p><p>&nbsp; &nbsp; &nbsp; &nbsp;本产品为特价促销商品。可零售，可批量采购，批量采购按不同规格数量享受不同等级折扣，欢迎垂询！</p><p><img src=\'/upload/66465fe4-5705-4eb8-b325-62f99c64f1ad.png\'><br></p>', '29', '2', null, '2018-12-26 16:29:48');
INSERT INTO `website_golden` VALUES ('b6fdeb4d-4a9e-4f58-be6a-cebdb8594b96', '智慧城市', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;城市大数据平台遵循住建部发布的智慧城市标准，实时采集水、电、气、管网、环境、路网等基础数据，实时监测城市、商圈运行体征，实现整个城市或商圈的用电信息采集及监控、能耗管控、地下管网实时监控、环境实时监测、路网实时监控、智能停车导引、室内导航、商业区客流量监控、IT设备监控、智能家居、智能照明等系统和服务。</p><p><img src=\'/upload/0feeb7b3-987c-428f-a917-3c4897f38282.png\'><br></p>', '36', '4', '/upload/9ef396e6-7ae3-4818-9606-6b1716d96a05.jpg', '2018-12-26 21:18:25');
INSERT INTO `website_golden` VALUES ('d5b324e2-bd37-4e74-a49b-8567292902eb', '集团生产', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;集团级生产实时信息系统中的实时数据库支持分布式部署，具有数据断网续传、编码转换、与第三方数据库无缝链接等功能，适于构建集团生产实时信息系统。集团数据中心实时数据库汇总各分厂实时生产信息，为集团实时掌握下属各企业生产动态、实现精细化管理提供支撑。</p><p><img src=\'/upload/8c24daf0-7ae5-42fe-90cd-58e0421970cd.png\'>&nbsp;&nbsp;<br></p>', '36', '4', '/upload/14f3274d-f418-4dc1-b9a0-b8a1859c8132.jpg', '2018-12-26 21:18:53');
INSERT INTO `website_golden` VALUES ('d6efd0b5-94aa-407e-a419-1753c7d306dd', '智慧消防', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;智慧消防云平台是一个集设备运行监测、故障分析和维保记录于一体的管理系统，它可以接收数据采集器传输过来的实时数据，全面了解设备的实时运行状态和故障分布情况，并通过多种设备和移动终端来展现。除了提供开放的信息查询窗口给用户，一些重要信息（如火警信息、关键设备故障、长期未处理故障等）将会主动推送给相关用户，发掘海量数据中有价值的数据，快速、精准的投递给需要的用户，不受时间、空间的限制。</p><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;智慧消防云平台利用大数据技术，基于大量历史数据，分析出故障率较高的设备和品牌的季节性故障、行业性故障及影响设备使用寿命的因素等，提供给不同的用户、部门、厂商、行业、机构等使用。</div><div>主要特点是快速（数据实时传输）、精准（数据经过平台的分析和筛选，不同的数据发送给不同的用户）、主动（数据可以透过手机APP、短信等方式推送给用户，避免遗漏）。</div><p><img src=\'/upload/7c00361d-97da-499c-9a97-97645e5e7348.png\'><br></p>', '36', '4', '/upload/22c435cd-2fbb-4284-9650-8e83db655e38.jpg', '2018-12-26 21:17:45');
INSERT INTO `website_golden` VALUES ('dcc2dc49-819e-4036-844c-b6c4f95c6bfd', '生产运行监控系统', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;所属行业：生物质发电</p><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户名称：国能生物发电集团有限公司</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户背景介绍：</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 国能生物发电集团有限公司成立于2005年7月7日，由国家电网公司、国能电力集团有限公司等单位共同投资设立，注册资本金20亿元。公司投入运营和在建生物质发电项目41个，总装机容量超过100万千瓦，目前已发展成为全球最大的生物质发电企业。</div><div>项目介绍：</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 国能生物发电集团生产运行监控系统，是面向集团及41家下属电厂的分布式生产过程实时监控系统。分公司的庚顿实时数据库向下与DCS、PLC等过程自动化系统相连，处理全厂生产实时数据的采集和存储，完成厂级过程监控和管理等功能。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 庚顿实时数据库采取集团总部和下属分公司分别部署的原则，即分公司产生的实时/历史数据保存在各自本地，同时把集团需要的数据，通过庚顿实时数据库强大的镜像功能，实时同步到集团本部。这些数据包括实时指标参数数据，也包括统计后的生产数据，为集团公司的经营提供数据依据。</div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;国能生物发电集团生产运行监控系统自2009年建成投入运行至今，运行稳定可靠，已成为日常生产调度的核心平台，为集团积累了大量的数据财富。</div>', '35', '3', null, '2018-12-26 17:22:09');
INSERT INTO `website_golden` VALUES ('dcdb9cc1-529d-40ad-8bb8-3fc313ca6dc4', '公司简介', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;北京庚顿数据科技有限公司成立于2007年8月，位于中关村软件园。公司专业从事自主知识产权的“实时数据库管理系统”研发及产业化，庚顿公司成立11年来，打造了一支专注民族基础软件产业、敢为天下先的创新团队。</p><p>&nbsp; &nbsp; &nbsp; &nbsp; 庚顿人坚持持续自主创新，推出适应市场需求的一系列实时数据库产品，该系列产品是工业领域信息化的核心基础软件，在两化融合中发挥着重要作用，更是大数据、云计算、物联网等新兴产业不可或缺的重要支撑软件。可应用于智能电网、生产管理、节能环保、先进控制、现代物流等行业或领域。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;目前庚顿实时数据库已达到国际领先水平，广泛应用于国家电网、南方电网、神华集团、华能集团、华润集团等世界五百强企业中，以及金风科技、广东明阳、大唐华创风能、湖北能源集团、华能新能源等风电领军企业中。</p>', '8', '5', null, '2018-12-26 21:50:37');
INSERT INTO `website_golden` VALUES ('e1ed7262-8b02-4e5c-bc43-178f138b0b81', '庚顿通用监控组态平台', '<p>&nbsp;&nbsp;&nbsp;&nbsp;新一代HMI/SCADA与数据分析可视化平台</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;专为数据工业时代打造，一款包括来自传感器、设备、基于云服务的源数据和开放的通信框架，是庚顿力推的新型软件操作平台，人们可借助于它加载新应用，从而对现有的工业机器做数据分析、预测、诊断并提高使用效率。<br></p><p>&nbsp;&nbsp;&nbsp;&nbsp; 通过软件分析传感器采集的数据，最终实现机器与机器、机器与人的连接。实现远程监控、诊断、智能运行设备。<br>&nbsp;&nbsp;&nbsp;&nbsp; 平台特点是预建立基础平台，采用模块化架构，流程和工具通用性强，便于第三方扩展，工程人员可快速创建新应用。</p><p><img src=\'/upload/32e09ba2-fcaa-4c18-893d-392ca81a97b6.png\'><br></p><p><img src=\'/upload/bae52149-9062-4c59-ae69-d194a3de2b6b.png\'><br></p><p><img src=\'/upload/df6a5c30-d2d4-4b50-b881-1b0b89d326f9.png\'><br></p><p><img src=\'/upload/470de03e-ecdc-4af2-85ec-af17655a3fe1.png\'><br></p><p><img src=\'/upload/90c19767-de4e-4c3d-938b-5b30b74fd85e.png\'><br></p><p></p>', '30', '2', null, '2018-12-26 16:44:50');
INSERT INTO `website_golden` VALUES ('eafaaf39-bcc6-4d46-b005-25ff6e1ddc16', '安全生产', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;物联网安全生产监控系统，是以生产过程的安全监控为核心，以B/S&nbsp;为架构建立的系统，整个系统以庚顿实时数据库为核心，并借助于关系库，将实时监控与信息查询有机结合起来，对不同功能的子系统进行界面集成，实现对工业企业生产过程中的安全环节进行监控。主要功能模块包括：统一展现门户，操作系统维护，应急指挥，应急管理，监测监控，统一管理等模块，整个系统具有操作简单，信息共享性强，业务扩展方便，可将不同的子系统进行界面集成，部署维护容易，为工业企业的安全生产提供可靠信息支持。&nbsp;&nbsp;<br></p><p><img src=\'/upload/da25d08d-6d46-4a35-b1ce-872a181532ca.png\'><br></p><p><img src=\'/upload/936fb0ca-367d-44be-92a3-69897d8c8258.png\'><br></p>', '36', '4', '/upload/7d16af89-92f9-4867-b31b-544b9de1bcd6.jpg', '2018-12-26 21:19:03');
INSERT INTO `website_golden` VALUES ('f0453a5f-467d-4087-9b1a-2dea83530294', '庚顿动态', '<p><blockquote>| 2018年</blockquote>2018年1月 庚顿公司成立全资子公司“庚顿河北信息科技有限公司”<br><br><blockquote>| 2017年</blockquote>2017年12月 庚顿实时数据库管理系统进入化工行业<br><br>2017年11月 庚顿面向物联网领域推出庚星时序数据库管理系统，普惠中小企业<br><br>2017年10月 庚顿与百度开始战略合作<br><br>2017年08月 庚顿实时数据库管理系统进入冶金行业<br><br>2017年06月 庚顿实时数据库管理系统获最具创新竞争力产品奖<br><br>2017年04月 庚顿实时数据库管理系统进入水泥制造行业<br><br>2017年03月 庚顿实时数据库管理系统进入烟草行业<br><br>2017年02月 庚顿实时数据库管理系统进入汽车制造行业<br><br><blockquote>| 2016年</blockquote>2016年08月 庚顿实时数据库管理系统进入石化行业<br>2016年08月 庚顿实时数据库管理系统进入水力发电行业<br><br>2016年05月 金风全球监控中心项目扩容，庚顿实时数据库管理系统成为国内最具<br><br>影响力、最大管理规模的风电监控项目实时大数据处理核心支撑平台<br><br>2016年03月 庚顿实时数据库管理系统进入石油行业<br><br>2016年01月 庚云实时数据库管理系统（大数据版）通过ISCCC IT产品信息安全认证<br><br><blockquote>| 2015年</blockquote>2015年12月 庚顿实时数据库管理系统应用于清华大学，进入教育科研领域<br><br>2015年04月 北京中恒银瑞投资管理中心（有限合伙）入资<br><br>2015年04月 庚顿实时数据库管理系统应用于农夫山泉（淳安茶园）有限公司<br><br>2015年10月 庚顿实时数据库管理系统进入煤炭行业<br><br><blockquote>| 2014年</blockquote>2014年09月 庚顿实时数据库管理系统应用于国华能源投资公司<br><br>2014年05月 “金风全球监控中心”项目启动建设，选用庚顿实时数据库管理系统<br><br>2014年03月 公司获得“数据压缩方法”发明专利证书<br><br><blockquote>| 2013年</blockquote>2013年12月 庚顿实时数据库管理系统进入物联网安监应急领域<br><br>2013年12月 国内首套支持64位操作系统的自主知识产权实时数据库管理系统发布<br><br>2013年11月 庚顿实时数据库管理系统进入电信领域<br><br>2013年10月 “庚顿实时数据交换平台V2.0”项目获北京市科技型中小企业技术创新资金支持<br><br>2013年05月 公司入选中关村“展翼计划”,成为首批展翼企业<br><br>2013年05月 公司通过ISO9001质量管理体系认证<br><br>2013年04月 庚顿实时数据库管理系统应用于中国商用飞机有限责任公司<br><br><blockquote>| 2012年</blockquote>2012年04月 庚顿实时数据库管理系统应用于国家电网<br><br>2012年04月 “云实时数据库开发”立项，公司在工业大数据领域开始发力<br><br><blockquote>| 2011年</blockquote>2011年12月 公司获中关村软件园孵化器股权投资<br><br>2011年11月 庚顿实时数据库管理系统应用于国能生物发电集团<br><br>2011年11月 公司获得“国家高新技术企业”证书<br><br>2011年10月 公司入驻北京中关村软件园（国家软件产业基地、国家软件出口基地）<br><br>2011年10月 庚顿实时数据库管理系统应用于南方电网<br><br>2011年10月 庚顿实时数据库管理系统V2.1发布<br><br>2011年07月 公司取得软件企业认定证书<br><br>2011年03月 庚顿实时数据库管理系统进入新能源光伏发电领域<br><br>2011年03月 北京中关村发展集团股份有限公司入股庚顿，公司被纳入北京物联网产业发展的整体布局<br><br><blockquote>| 2010年</blockquote>2010年11月 庚顿实时数据库管理系统进入新能源风电领域<br><br>2010年05月 庚顿实时数据库管理系统V2.0发布<br><br>2010年05月 庚顿实时数据库管理系统入选北京市自主创新产品目录（第八批）<br><br>2010年03月 公司成为“中关村物联网产业技术创新战略联盟”会员单位<br><br>2010年01月 庚顿实时数据库管理系统应用于中国华能集团公司<br><br><blockquote>| 2009年</blockquote>2009年09月 庚顿实时数据库管理系统应用于华润电力<br><br>2009年07月 庚顿实时数据库管理系统软件V1.0获北京市科委颁发的软件产品证书<br><br>2009年06月 公司申请发明专利 “计算支持方法及系统”<br><br>2009年05月 公司申请发明专利“数据压缩方法”<br><br>2009年05月 公司成为海淀区创新企业<br><br>2009年05月 公司获中关村高新技术企业证书<br><br><blockquote>| 2007年</blockquote>2007年11月 签订首套庚顿实时数据库管理系统销售合同，应用于火力发电厂SIS项目<br><br>2007年11月 庚顿实时数据库管理系统软件 V1.0 发布<br><br>2007年08月 北京庚顿数据科技有限公司成立</p>', '11', '5', null, '2018-12-26 22:18:01');
INSERT INTO `website_golden` VALUES ('fffdd4f5-3683-4713-9f25-feb7091a9198', '风电集控', '<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;大数据平台基于庚顿实时数据库、Hadoop，以及规范的数据共享技术构建。</p><p></p><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>平台功能包括采集数据接收及传输、数据实时清洗、数据实时处理、实时数据告警、元数据管理、数据压缩存储、海量数据在线多维查询及导出、数据并行分析计算、数据挖掘、作业调度管理、并提供实时数据库接口、数据共享服务、平台维护管理功能。</span></div><div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\'/upload/c2fdbde9-1fa8-4e34-a411-214f30b524fd.png\'></div>', '36', '4', '/upload/7737ba81-7348-4995-b92a-0408df1c9241.jpg', '2018-12-26 21:47:22');

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
INSERT INTO `website_industrycase` VALUES ('13c48c9c-8010-4bfc-9baa-1c1eb0a7301e', '数据中心', '/upload/e2ccec57-14e9-4a80-827a-76632c1e9b62.png', '/solution', '11', '2018-12-27 09:38:39');
INSERT INTO `website_industrycase` VALUES ('19c22f06-cbc0-4b5d-b9a8-5819991af1d5', '农夫山泉', '/upload/8a81e21b-37d3-4db6-9a60-1c0c3d4186ec.png', '/solution', '5', '2018-12-27 09:37:58');
INSERT INTO `website_industrycase` VALUES ('1f82b0fa-4bd7-4819-9cc7-46377e5cdcdf', '胜利油田', '/upload/d22f15c5-6699-4e2c-b9a8-ed22a1b46951.jpg', '/solution', '4', '2018-12-27 09:37:54');
INSERT INTO `website_industrycase` VALUES ('2152d0ba-4013-436a-bdcd-a870c0e8fef9', '国华能源', '/upload/d0e39d58-a0df-48ee-bfca-ffc8115862a4.jpg', '/solution', '12', '2018-12-27 09:38:34');
INSERT INTO `website_industrycase` VALUES ('5b178731-a9c4-471f-8877-9dadc144fcab', '安徽安泰生物', '/upload/e01ba0f8-e25f-4435-bbbe-c8b27b560e4d.jpg', '/solution', '3', '2018-12-27 09:37:40');
INSERT INTO `website_industrycase` VALUES ('6ffb2601-cac3-4d8e-ac7d-6270bc0bdce9', '煤矿领域', '/upload/80fc60ee-7beb-4013-9113-a0ec3d0a2f57.jpg', '/solution', '7', '2018-12-27 09:38:08');
INSERT INTO `website_industrycase` VALUES ('9b4281b9-4333-477b-bf32-63eb4bba3fd7', '智能制造', '/upload/cadc38b0-ff0f-4ce0-a92d-f806b3d635bb.jpg', '/solution', '10', '2018-12-27 09:38:25');
INSERT INTO `website_industrycase` VALUES ('a3fda4e9-7817-444d-9711-6ea68ec8ebb7', '国能生物集团', '/upload/19e62400-9cf9-4335-9464-1c1c2e05681b.png', '/solution', '2', '2018-12-27 09:37:29');
INSERT INTO `website_industrycase` VALUES ('af0e923b-5e51-4f34-8986-34e18e7a34d1', '金风科技', '/upload/2e1fbaaa-22c9-4643-a1f5-6feac30abdad.jpg', '/solution', '1', '2018-12-27 09:37:22');
INSERT INTO `website_industrycase` VALUES ('d7c66589-24d1-4e2e-9760-3c8016d7c34e', '国家电网', '/upload/5f6229d4-dec1-4fcb-a0f4-6b3c6b66340a.jpg', '/solution', '8', '2018-12-27 09:38:14');
INSERT INTO `website_industrycase` VALUES ('f654d80e-771c-4661-974f-42fd58b9ecb9', '火电发电', '/upload/c05dfcda-d7d8-407e-ae00-f91010689405.png', '/solution', '6', '2018-12-27 09:38:04');
INSERT INTO `website_industrycase` VALUES ('fb140881-a371-4a86-b1f4-538872f57d03', '光伏发电', '/upload/7383201c-a568-493f-826b-42016c2d8e11.jpg', '/solution', '9', '2018-12-27 09:38:20');

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
INSERT INTO `website_pwd` VALUES ('f07ba153-05e5-4017-8f89-891fab184b25', 'dd4b21e9ef71e1291183a46b913ae6f2');

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
  `sex` char(1) COLLATE utf8_bin NOT NULL DEFAULT '1' COMMENT '1 男，0 女',
  `name` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of website_user
-- ----------------------------
INSERT INTO `website_user` VALUES ('9ffe6b2a-1b6d-4b0f-b50b-ef3c12c0111a', 'golden', '0', '0', '2018-12-17 15:38:00', '1', null);
INSERT INTO `website_user` VALUES ('bb7c79e1-f748-4389-9bb4-30418b5fd9a9', 'forlong', '0', '0', '2018-12-17 15:28:56', '1', null);
INSERT INTO `website_user` VALUES ('d14b0ae0-db90-41f5-84a5-303cc3dc74c3', 'golden', '1', '0', '2018-12-17 15:41:41', '1', null);
INSERT INTO `website_user` VALUES ('f07ba153-05e5-4017-8f89-891fab184b25', 'liufulong', '0', '0', '2018-12-27 15:53:05', '1', null);
