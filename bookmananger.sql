/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : bookmananger
Target Host     : localhost:3306
Target Database : bookmananger
Date: 2019-01-08 11:50:57
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `bookid` int(10) unsigned NOT NULL COMMENT '图书编号',
  `bookname` varchar(50) NOT NULL COMMENT '图书名称',
  `bookautor` varchar(20) NOT NULL COMMENT '作者',
  `booktype` varchar(50) NOT NULL COMMENT '图书类别',
  `bookprice` float NOT NULL COMMENT '图书价格',
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('710401', '老人与海', '海明威', '文学', '16.1');
INSERT INTO `books` VALUES ('710402', '蛙', '莫言', '文学', '24.5');
INSERT INTO `books` VALUES ('710403', '战胜华尔街', '彼得·林奇', '经管', '33.6');
INSERT INTO `books` VALUES ('710404', '十年徒步中国', '雷殿生', '生活', '28.3');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userid` int(11) NOT NULL COMMENT '用户编号',
  `username` varchar(50) NOT NULL COMMENT '登录用户名',
  `userpwd` varchar(20) NOT NULL COMMENT '密码',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1000', '张三', 'sansan');
INSERT INTO `users` VALUES ('1001', '李四', 'sisi');
INSERT INTO `users` VALUES ('1002', '王五', 'wuwu');
