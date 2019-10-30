-----------------------------用户信息表 begin-------------------------------------------
DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `user_id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '用户id',
  `login_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '登陆名称',
  `passwd` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `user_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名称',
  `token_id` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT 'token_id',
  `phone_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '电话号码',
  `org_id` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '机构id',  
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-----------------------------用户信息表 end-------------------------------------------


-----------------------------供应商信息表 begin-------------------------------------------

DROP TABLE IF EXISTS `supplier_info`;

CREATE TABLE `supplier_info` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '主键id',
  `cust_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '客户名称',
  `project_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '项目名称',
  `supplier_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '供应商名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


-----------------------------供应商信息表 end-----------------------------------------------

-----------------------------库存信息表 begin-------------------------------------------
DROP TABLE IF EXISTS `stock_info`;

CREATE TABLE `stock_info` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '主键 id',
  `cust_id` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '客户id 对应客户管理',
  `so` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '入仓落货纸号',
  `po` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '客户采购订单号',
  `sku` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '货物款号 asn-item',
  `inbound_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '入仓编号',
  `car_num` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '车牌号',
  `customs_meterial_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '海关系统物料号',
  `rcvd_date` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '收货日期',
  `rcvd_ctns` int(10) COLLATE utf8_bin DEFAULT NULL COMMENT '实收箱数',
  `rcvd_pcs` int(12) COLLATE utf8_bin DEFAULT NULL COMMENT '实收件数',
  `items_per_box` int(8) COLLATE utf8_bin DEFAULT NULL COMMENT '一箱几件',
  `gw_per_box_actul` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '单箱毛重',
  `gw_all_actul` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '实收总毛重',
  `box_length_actul` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '实测外箱长L',
  `box_width_actul` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '实测外箱宽W',
  `box_high_actul` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '实测外箱高H',
  `box_per_volume_actul` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '实测单箱体积cbm/ctn',
  `box_all_volume_actul` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '实收总体积',
  `custs_decla_piece_weigh` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '入仓报关单件净重N.W./pcs',
  `custs_decla_all_weigh` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '入仓报关总净重total N.W',
  `warehouse_position` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '仓库位置',
  `shipped_ctns` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '总出仓箱数',
  `shipped_pcs` int(12) COLLATE utf8_bin DEFAULT NULL COMMENT '总出仓件数',
  `shipped_gw` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '总出仓毛重',
  `shipped_weigh` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '总出仓净重',
  `shipped_volume` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '总出仓体积',
  `stock_ctns` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '总库存箱数',
  `stock_pcs` int(12) COLLATE utf8_bin DEFAULT NULL COMMENT '总库存件数',
  `stock_gw` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '总库存毛重',
  `stock_weigh` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '总库存净重',
  `stock_volume` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '总库存体积',
  `stock_check` char(1) COLLATE utf8_bin DEFAULT NULL COMMENT '库存case pack 检验',
  `customs_order_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '报关单号',
  `customs_merch_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '海关商品编码',
  `merch_name` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '报关单号',
  `decla_count` int(32) COLLATE utf8_bin DEFAULT NULL COMMENT '申报数量/成交数量',
  `decla_unit` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '申报单位/成交单位',
  `decla_unit_price` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '申报单位/成交单位',
  `decla_total_price` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '申报总价/成交总价',
  `decla_currency` char(3) COLLATE utf8_bin DEFAULT NULL COMMENT '成交币种/申报币种',
  `origin_country` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '原产国',
  `dest_country` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '目的国',
  `supervision_conditions` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '海关监管条件',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-----------------------------库存信息表 end-------------------------------------------


-----------------------------库存信息表 begin-------------------------------------------
DROP TABLE IF EXISTS `shipped_info`;

CREATE TABLE `shipped_info` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '主键 id',
  `so` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '入仓落货纸号',
  `po` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '客户采购订单号',
  `sku` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '货物款号 asn-item',
  `inbound_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '入仓编号',
  `customs_meterial_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '海关系统物料号',
  `shipped_order_date` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '出仓订单日期',
  `shipped_date` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '实际离仓日期',  
  `shipped_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '出仓单号clp',  
  `warehouse_position` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '仓库位置',
  `shipped_ctns` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '总出仓箱数',
  `shipped_pcs` int(12) COLLATE utf8_bin DEFAULT NULL COMMENT '总出仓件数',  
  `shipped_gw` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '出仓毛重',
  `shipped_volume` decimal(18,6) COLLATE utf8_bin DEFAULT NULL COMMENT '出仓体积',
  `customs_merch_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '海关商品编码',
  `merch_name` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '报关单号',
  `decla_count` int(32) COLLATE utf8_bin DEFAULT NULL COMMENT '申报数量/成交数量',
  `decla_unit` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '申报单位/成交单位',
  `decla_unit_price` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '申报单位/成交单位',
  `decla_total_price` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '申报总价/成交总价',
  `decla_currency` char(3) COLLATE utf8_bin DEFAULT NULL COMMENT '成交币种/申报币种',
  `origin_country` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '原产国',
  `dest_country` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '目的国',
  `piece_weigh` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '单件净重',
  `shipped_all_weigh` decimal(12,6) COLLATE utf8_bin DEFAULT NULL COMMENT '出仓总净重',  
  `supervision_conditions` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '海关监管条件',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-----------------------------库存信息表 end-------------------------------------------


-----------------------------前台收费信息表 begin-------------------------------------------

DROP TABLE IF EXISTS `front_desk_charge`;

CREATE TABLE `front_desk_charge` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '主键id',
  `inbound_no` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '入仓编号',
  `so` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '落货纸号码',
  `receipt_no` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '收据编码',
  `cust_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '客户名称',
  `factory` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '工厂名称',
  `tran_date` varchar(12) COLLATE utf8_bin DEFAULT NULL COMMENT '收费日期',
  `project_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '项目名称',
  `bill_one_car` int(10) COLLATE utf8_bin DEFAULT NULL COMMENT '一车几单',
  `car_num` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '车牌号',
  `pay_type` varchar(2) COLLATE utf8_bin DEFAULT NULL COMMENT '支付方式  0 现金 1 微信支付 3 月结',
  `settlement_type` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '结算方式',
  `rec_amt` decimal(18,2) DEFAULT NULL COMMENT '代收款合计',
  `fee_total` decimal(18,2) DEFAULT NULL COMMENT '费用合计',
  `enter_gate_fee` decimal(18,2) DEFAULT NULL COMMENT '入闸费',
  `customs_declaration_fee` decimal(18,2) DEFAULT NULL COMMENT '报关费',
  `commercial_inspection_flag` char(1) COLLATE utf8_bin DEFAULT NULL COMMENT '商检标识 0 否  1 是',
  `customs_meterial_no` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '海关系统物料号',
  `remark` varchar(128) DEFAULT NULL COMMENT '备注',  
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-----------------------------前台收费信息表 end-----------------------------------------------


-----------------------------客户信息管理表 begin-------------------------------------------


DROP TABLE IF EXISTS `cust_info`;

CREATE TABLE `cust_info` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '主键id',
  `cust_id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '客户id',
  `cust_short_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '客户名称',
  `cust_full_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '客户全称',  
  `project_id` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '项目id',
  `project_name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '项目名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


-----------------------------客户信息管理表 end-----------------------------------------------










