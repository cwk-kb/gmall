/*
 Navicat Premium Data Transfer

 Source Server         : gmall
 Source Server Type    : MySQL
 Source Server Version : 50728 (5.7.28-log)
 Source Host           : localhost:3306
 Source Schema         : gmall

 Target Server Type    : MySQL
 Target Server Version : 50728 (5.7.28-log)
 File Encoding         : 65001

 Date: 12/03/2023 01:46:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for balance_detail
-- ----------------------------
DROP TABLE IF EXISTS `balance_detail`;
CREATE TABLE `balance_detail`  (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `detail_state` tinyint(4) NULL DEFAULT NULL COMMENT '明细类型(1:消费,2退款,3:充值,4:取出)',
  `money` double NULL DEFAULT NULL COMMENT '金额',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `record_time` datetime NULL DEFAULT NULL COMMENT '记录时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of balance_detail
-- ----------------------------
INSERT INTO `balance_detail` VALUES (1634505588123688961, 1, 100, 1, NULL);
INSERT INTO `balance_detail` VALUES (1634506072247033857, 1, 100, 1, NULL);
INSERT INTO `balance_detail` VALUES (1634516621345226753, 1, 100, 1, NULL);
INSERT INTO `balance_detail` VALUES (1634516966863642626, 2, 20, 2, NULL);
INSERT INTO `balance_detail` VALUES (1634566466080616450, 2, 20, 2, '2023-03-11 22:46:29');

SET FOREIGN_KEY_CHECKS = 1;
