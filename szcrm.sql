/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : szcrm

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 18/03/2022 23:34:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
create database szcrm;
use szcrm;
-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES (1, 'admin', '123');
INSERT INTO `admin` VALUES (2, 'xfh', '666');
INSERT INTO `admin` VALUES (3, '邢福豪', '666');
INSERT INTO `admin` VALUES (4, '管理员', '123');
COMMIT;

-- ----------------------------
-- Table structure for coruseorder
-- ----------------------------
DROP TABLE IF EXISTS `coruseorder`;
CREATE TABLE `coruseorder` (
  `uuid` varchar(45) DEFAULT NULL,
  `id` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `wecharno` varchar(45) DEFAULT NULL,
  `wecharname` varchar(45) DEFAULT NULL,
  `qqno` varchar(45) DEFAULT NULL,
  `coursename` varchar(45) DEFAULT NULL,
  `courseprice` varchar(45) DEFAULT NULL,
  `orderdate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coruseorder
-- ----------------------------
BEGIN;
INSERT INTO `coruseorder` VALUES ('0287e514-a49a-11eb-af55-7567a2f6edbe', '0287e528-a49a-11eb-af55-7567a2f6edbe', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `coruseorder` VALUES ('0b16dde8-a49a-11eb-af55-7567a2f6edbe', '0b16de06-a49a-11eb-af55-7567a2f6edbe', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `coruseorder` VALUES ('11bbd59a-a49a-11eb-af55-7567a2f6edbe', '11bbd5b8-a49a-11eb-af55-7567a2f6edbe', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `coruseorder` VALUES ('03772150-a49b-11eb-af55-7567a2f6edbe', '0377216e-a49b-11eb-af55-7567a2f6edbe', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `coruseorder` VALUES ('0ffcfa44-a49b-11eb-af55-7567a2f6edbe', '0ffcfa4e-a49b-11eb-af55-7567a2f6edbe', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `coruseorder` VALUES ('165aa044-a49b-11eb-af55-7567a2f6edbe', '165aa058-a49b-11eb-af55-7567a2f6edbe', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `coruseorder` VALUES ('0d61e492-a49c-11eb-af55-7567a2f6edbe', '0d61e4a6-a49c-11eb-af55-7567a2f6edbe', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `coruseorder` VALUES ('23e4cb6a-a598-11eb-8392-270291d36eae', '23e4cb7e-a598-11eb-8392-270291d36eae', '1', '1', '1', '1', '1', NULL, '2021-04-25 00:00:00');
INSERT INTO `coruseorder` VALUES ('5f2f8df4-a598-11eb-8392-270291d36eae', '5f2f8e08-a598-11eb-8392-270291d36eae', '2', '2', '2', '2', '2', NULL, '2021-04-25 00:00:00');
INSERT INTO `coruseorder` VALUES ('60f9c76c-a598-11eb-8392-270291d36eae', '60f9c78a-a598-11eb-8392-270291d36eae', '', '', '', '', '', NULL, '2021-04-25 00:00:00');
INSERT INTO `coruseorder` VALUES ('cdbca02c-a598-11eb-8392-270291d36eae', 'cdbca04a-a598-11eb-8392-270291d36eae', '1', '1', '1', '1', '1', NULL, '2021-04-25 00:00:00');
INSERT INTO `coruseorder` VALUES ('ced519f8-a598-11eb-8392-270291d36eae', 'ced51a0c-a598-11eb-8392-270291d36eae', '', '', '', '', '', NULL, '2021-04-25 00:00:00');
COMMIT;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `ordercode` varchar(45) DEFAULT NULL,
  `providername` varchar(45) DEFAULT NULL,
  `ispay` varchar(45) DEFAULT NULL,
  `orderprice` decimal(9,0) DEFAULT NULL,
  `orderdate` datetime DEFAULT NULL,
  `sale` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
BEGIN;
INSERT INTO `order` VALUES ('a9dd9dec-a5ba-11eb-8392-270291d36eae', '牛奶', '002', '北京伊利牛奶有限公司', '是', 67, '2020-12-26 00:00:00', 30);
INSERT INTO `order` VALUES ('cf7c0cf0-a5ba-11eb-8392-270291d36eae', ' 花生油', '001', '河南豫油有限公司', '是', 89, '2021-03-06 00:00:00', 39);
INSERT INTO `order` VALUES ('d3d75b82-a5bb-11eb-8392-270291d36eae', '面包', '003', '上海宏大面包有限公司', '是', 29, '2021-04-26 00:00:00', 39);
INSERT INTO `order` VALUES ('a1b58988-a5bd-11eb-8392-270291d36eae', '方便面', '006', '杭州斯美特有限公司', '否', 88, '2021-02-01 00:00:00', 40);
INSERT INTO `order` VALUES ('920e7152-a5c7-11eb-8392-270291d36eae', '火腿肠', '008', '北京有限公司', '是', 69, '2021-05-06 00:00:00', 39);
INSERT INTO `order` VALUES ('25bc3e02-a627-11eb-8392-270291d36eae', '洗发水', '005', '联合利华有限公司', '是', 12, '2021-06-17 00:00:00', 43);
COMMIT;

-- ----------------------------
-- Table structure for provider
-- ----------------------------
DROP TABLE IF EXISTS `provider`;
CREATE TABLE `provider` (
  `id` varchar(45) NOT NULL,
  `pcode` varchar(20) DEFAULT NULL,
  `pname` varchar(20) DEFAULT NULL,
  `pcontext` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `createdate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of provider
-- ----------------------------
BEGIN;
INSERT INTO `provider` VALUES ('f6b50570-ae29-11eb-859b-b3b571171e50', '100', '北京三木堂有限公司', '万潇艾', '16527289728', '2018273922@qq.com', '2021-05-06 00:00:00');
INSERT INTO `provider` VALUES ('2053e5f4-ae2a-11eb-859b-b3b571171e50', '101', '上海斯美特有限责任公司', '张三', '16538297825', '292383778@qq.com', '2021-05-06 00:00:00');
INSERT INTO `provider` VALUES ('4e54f3d0-ae2a-11eb-859b-b3b571171e50', '102', '杭州科技有限公司', '杭布钱', '1628392026', '2826183739@qq.com', '2021-05-06 00:00:00');
COMMIT;

-- ----------------------------
-- Table structure for userm
-- ----------------------------
DROP TABLE IF EXISTS `userm`;
CREATE TABLE `userm` (
  `id` varchar(45) NOT NULL,
  `usercode` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `userPassword` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `creationDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userm
-- ----------------------------
BEGIN;
INSERT INTO `userm` VALUES ('88af4f60-ad73-11eb-859b-b3b571171e50', '17031210227', '王湘', '18', '女', NULL, '15637296838', '上海市闵行区', '2020-04-26 00:00:00');
INSERT INTO `userm` VALUES ('d015eecc-ad73-11eb-859b-b3b571171e50', '17031210221', '王武', '18', '男', NULL, '16243567886', '浙江省杭州市西湖区', '2020-04-28 00:00:00');
INSERT INTO `userm` VALUES ('96f6cb6a-ad74-11eb-859b-b3b571171e50', '17031210226', '虞向婉', '21', '女', NULL, '18625628986', '浙江省杭州市滨江区', '2021-05-05 00:00:00');
INSERT INTO `userm` VALUES ('a44a843a-ad76-11eb-859b-b3b571171e50', '17031210216', '赵小小', '22', '女', NULL, '18626565636', '北京市朝阳区', '2021-04-25 00:00:00');
INSERT INTO `userm` VALUES ('fdd2f30c-ad76-11eb-859b-b3b571171e50', '17031210006', '昭君鹏', '18', '男', NULL, '15678925686', '河南省安阳市文峰区', '2020-02-18 00:00:00');
INSERT INTO `userm` VALUES ('05a12562-ad78-11eb-859b-b3b571171e50', '17031210208', '赵晏嫣', '22', '女', NULL, '1852388596', '广州市东完区', '2021-05-05 00:00:00');
INSERT INTO `userm` VALUES ('62910e54-ad78-11eb-859b-b3b571171e50', '1703121006', '王望旺', '22', '男', NULL, '16723692688', '上海市闵行区', '2021-05-05 00:00:00');
INSERT INTO `userm` VALUES ('9b32787e-ad78-11eb-859b-b3b571171e50', '17031210106', '商禅飒', '26', '男', NULL, '1862563856', '河南省郑州市', '2021-05-05 00:00:00');
INSERT INTO `userm` VALUES ('dd02784e-ad78-11eb-859b-b3b571171e50', '17031210666', '邢牧谦', '18', '男', NULL, '16826425666', '浙江省杭州市西湖区', '2021-05-05 00:00:00');
INSERT INTO `userm` VALUES ('12690246-ad79-11eb-859b-b3b571171e50', '17031210886', '武仁杰', '28', '男', NULL, '16836295638', '浙江省杭州市拱墅区', '2021-05-05 00:00:00');
INSERT INTO `userm` VALUES ('a3e05afa-ad95-11eb-859b-b3b571171e50', '17031210226', '邢福豪', '22', '男', NULL, '15237295636', '河南省周口市郸城县虎岗乡', '2021-05-05 00:00:00');
INSERT INTO `userm` VALUES ('10690fc2-b544-11eb-ab8d-535ac8daef20', '17031210226', '邢福豪', '22', '男', NULL, '15237295636', '河南省周口市郸城县', '2021-05-15 00:00:00');
INSERT INTO `userm` VALUES ('54801750-b544-11eb-ab8d-535ac8daef20', '', '', '', '', NULL, '', '', '2021-05-15 00:00:00');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
