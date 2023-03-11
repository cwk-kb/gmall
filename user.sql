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

 Date: 12/03/2023 01:46:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(11) NOT NULL COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `balance` double NULL DEFAULT NULL COMMENT '余额',
  `create_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '修改人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'cwk', 9900, '', '', NULL, NULL);
INSERT INTO `user` VALUES (2, 'kb', 20040, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (3, 'zwb', 30000, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (4, 'ysq', 40000, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (1634489501176864769, 'kq', 50000, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
