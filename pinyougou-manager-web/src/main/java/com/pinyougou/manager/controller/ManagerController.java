package com.pinyougou.manager.controller;

import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.sellergoods.service.SellergoodsService;

@RestController
public class ManagerController {
	
	@Reference
	private SellergoodsService sellergoodsService;

}
