package com.pinyougou.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.sellergoods.service.SellergoodsService;

@RestController
public class ShopController {
	
	@Reference
	private SellergoodsService sellergoodsService;
	
	@RequestMapping("/hello/test")
	public String test() {
		
	
		return	sellergoodsService.test();
		
	}
	

}
