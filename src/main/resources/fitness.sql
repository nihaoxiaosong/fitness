--新建数据库 songjie 2015-12-04
CREATE SCHEMA `fitness` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

--新建健身模块表 songjie 2015-12-04
CREATE TABLE `fitness`.`fitness_module` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `module_code` VARCHAR(45) NULL COMMENT '模块代码',
  `module_name` VARCHAR(45) NULL COMMENT '模块名称',
  `module_url` VARCHAR(45) NULL COMMENT '模块点击链接地址',
  `module_icon` VARCHAR(45) NULL COMMENT '模块图标地址',
  `level` INT NULL COMMENT '模块层级  0第一级,1第二级,2第三级',
  `parent_code` VARCHAR(45) NULL COMMENT '父级模块代码',
  `sort` int(11) DEFAULT NULL COMMENT '排序字段',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
COMMENT = '模块表';
--建索引 songjie 2015-12-05
CREATE INDEX `idx_fitness_module_parent_code`  ON `fitness`.`fitness_module` (parent_code) COMMENT ''
--模块数据 songjie 2015-12-09
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('001', '场馆管理', '/assets/images/header/gym1.png', '0', '0', '1');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('002', '会员管理', '/assets/images/header/gym2.png', '0', '0', '2');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('003', '商品管理', '/assets/images/header/gym3.png', '0', '0', '3');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('004', '合同管理', '/assets/images/header/gym4.png', '0', '0', '4');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('005', '课程管理', '/assets/images/header/gym5.png', '0', '0', '5');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('006', '租柜管理', '/assets/images/header/gym6.png', '0', '0', '6');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('007', '营销管理', '/assets/images/header/gym7.png', '0', '0', '7');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('008', '统计分析', '/assets/images/header/gym8.png', '0', '0', '8');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('009', '员工管理', '/assets/images/header/gym9.png', '0', '0', '9');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('010', '权限管理', '/assets/images/header/gym10.png', '0', '0', '10');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('011', '系统日志', '/assets/images/header/gym11.png', '0', '0', '11');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `module_icon`, `level`, `parent_code`, `sort`) VALUES ('012', '快捷入口', '/assets/images/header/gym12.png', '0', '0', '12');
--场馆管理
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('101', '场馆信息', '1', '001', '1');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('102', '场地信息', '1', '001', '2');
--会员管理
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('103', '会员列表', '1', '002', '1');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('104', '企业列表', '1', '002', '2');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('105', '短信记录', '1', '002', '3');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('106', '赠送记录', '1', '002', '4');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('107', '消费记录', '1', '002', '5');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('108', '请假记录', '1', '002', '6');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('109', '入场离场', '1', '002', '7');
--商品管理
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('110', '钥匙牌管理', '1', '003', '1');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('111', '商品管理', '1', '003', '2');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('112', '商品售卖', '1', '003', '3');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('113', '卡种管理', '1', '003', '4');
--合同管理
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('114', '私教合同', '1', '004', '1');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('115', '会籍合同', '1', '004', '2');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('116', '租柜合同', '1', '004', '3');
--课程管理
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('117', '课程种类', '1', '005', '1');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('118', '上课记录', '1', '005', '2');
--租柜管理
--营销管理
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('119', '短信审批', '1', '007', '1');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('120', '活动礼包', '1', '007', '2');
--统计分析
--员工管理
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('121', '员工列表', '1', '009', '1');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('122', '员工请假', '1', '009', '2');
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('123', '工作绩效', '1', '009', '3');
--权限管理
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('124', '权限管理', '1', '010', '1');
--系统日志
INSERT INTO `fitness`.`fitness_module` (`module_code`, `module_name`, `level`, `parent_code`, `sort`) VALUES ('125', '系统日志', '1', '011', '1');




--新建健身系统日志表 songjie 2015-12-06
CREATE TABLE `fitness_system_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `venue_id` int(11) DEFAULT NULL COMMENT '场馆id',
  `venue_name` varchar(45) DEFAULT NULL COMMENT '场馆名称',
  `module_code` varchar(45) DEFAULT NULL COMMENT '模块代码',
  `module_name` varchar(45) DEFAULT NULL COMMENT '模块名称',
  `log_content` varchar(1000) DEFAULT NULL COMMENT '日志内容',
  `creater_code` varchar(45) DEFAULT NULL COMMENT '创建人代码',
  `creater_name` varchar(45) DEFAULT NULL COMMENT '创建人姓名',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='健身系统日志表';
--建索引 song 2015-12-07
CREATE INDEX `idx_fitness_system_log_module_code_create_date`  ON `fitness`.`fitness_system_log` (module_code, create_date) COMMENT ''


--新建健身系统用户表 songjie 2015-12-07
CREATE TABLE `fitness`.`fitness_user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `user_code` VARCHAR(45) NULL COMMENT '用户工号',
  `user_name` VARCHAR(45) NULL COMMENT '用户名',
  `password` VARCHAR(45) NULL COMMENT '密码',
  `venue_id` INT NULL COMMENT '场馆id',
  `venue_name` VARCHAR(45) NULL COMMENT '场馆名称',
  `birthday` DATETIME NULL COMMENT '出生日期',
  `sex` INT NULL COMMENT '性别 0男，1女',
  `marriage` INT NULL COMMENT '婚姻状况 0未婚，1已婚',
  `ID_card` VARCHAR(45) NULL COMMENT '身份证',
  `phone` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL COMMENT '家庭地址',
  `work_status` INT NULL COMMENT '就职状态 0在职，1离职',
  `work_begin_date` DATETIME NULL COMMENT '入职日期',
  `work_end_date` DATETIME NULL COMMENT '离职日期',
  `bank_card_code` VARCHAR(45) NULL COMMENT '银行卡号',
  `clothes_size` VARCHAR(45) NULL COMMENT '衣服尺寸',
  `trousers_size` VARCHAR(45) NULL COMMENT '裤子尺寸',
  `shoes_size` VARCHAR(45) NULL COMMENT '鞋子尺寸',
  `work_year` INT NULL COMMENT '工作年限',
  `graduated_school` VARCHAR(45) NULL COMMENT '毕业学校',
  `specialty` VARCHAR(45) NULL COMMENT '专业',
  `graduated_date` DATETIME NULL COMMENT '毕业日期',
  `educational_background` VARCHAR(45) NULL COMMENT '学历',
  `hometown` VARCHAR(45) NULL COMMENT '籍贯',
  `residence` VARCHAR(45) NULL COMMENT '户口所在地',
  `career` VARCHAR(45) NULL COMMENT '职称',
  `certificate_no` VARCHAR(45) NULL COMMENT '证书号',
  `certificate_code` VARCHAR(45) NULL COMMENT '证书编号',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '用户表';
--建索引 song 2015-12-07
CREATE INDEX `idx_fitness_user_user_code`  ON `fitness`.`fitness_user` (user_code) COMMENT ''

--新健身系统角色表 songjie 2015-12-07
CREATE TABLE `fitness`.`fitness_role` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `role_code` VARCHAR(45) NULL COMMENT '角色代码',
  `role_name` VARCHAR(45) NULL COMMENT '角色名称',
  `venue_id` INT NULL COMMENT '场馆id',
  `venue_name` VARCHAR(45) NULL COMMENT '场馆名称',
  `enable` INT NULL COMMENT '是否启用 0启用，1不启用',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '角色表';
--建索引 songjie 2015-12-07
CREATE INDEX `idx_fitness_role_role_code`  ON `fitness`.`fitness_role` (role_code) COMMENT ''
--管理员帐号 任何场馆通用 songjie 2015-12-10 
INSERT INTO `fitness`.`fitness_role` (`role_code`, `role_name`, `venue_id`, `venue_name`, `enable`) VALUES ('001', '管理员', '0', '', '0');



--新建健身系统用户角色关联表 songjie 2015-12-07
CREATE TABLE `fitness`.`fitness_user_role` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `user_code` VARCHAR(45) NULL COMMENT '用户代码',
  `role_code` VARCHAR(45) NULL COMMENT '角色代码',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '用户角色关联表';
--建索引 songjie 2015-12-07
CREATE INDEX `idx_fitness_user_role_user_code`  ON `fitness`.`fitness_user_role` (user_code) COMMENT ''

--新建健身系统角色模块关联表 songjie 2015-12-07
CREATE TABLE `fitness`.`fitness_role_module` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `role_code` VARCHAR(45) NULL COMMENT '角色代码',
  `module_code` VARCHAR(45) NULL COMMENT '模块代码',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '角色模块关联表';
--建索引 songjie 2015-12-07
CREATE INDEX `idx_fitness_role_module_role_code`  ON `fitness`.`fitness_role_module` (role_code) COMMENT ''
--管理员权限 songjie 2015-12-10 
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '001');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '002');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '003');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '004');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '005');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '006');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '007');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '008');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '009');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '010');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '011');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '012');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '101');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '102');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '103');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '104');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '105');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '106');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '107');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '108');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '109');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '110');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '111');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '112');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '113');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '114');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '115');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '116');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '117');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '118');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '119');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '120');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '121');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '122');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '123');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '124');
INSERT INTO `fitness`.`fitness_role_module` (`role_code`, `module_code`) VALUES ('001', '125');


--新建健身系统快捷入口表 songjie 2015-12-08
CREATE TABLE `fitness`.`fitness_shortcut` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `user_code` VARCHAR(45) NULL COMMENT '用户代码',
  `module_code` VARCHAR(45) NULL COMMENT '模块代码',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '快捷入口，其实就是用户和模块的关联表';
--建索引 songjie 2015-12-08
CREATE INDEX `idx_fitness_shortcut_user_code`  ON `fitness`.`fitness_shortcut` (user_code) COMMENT ''


