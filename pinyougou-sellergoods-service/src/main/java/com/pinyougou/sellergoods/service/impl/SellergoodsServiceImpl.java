package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.sellergoods.service.SellergoodsService;

@Service
public class SellergoodsServiceImpl implements SellergoodsService {
	
	

	@Override
	public String test() {
		
		return "test";
	}
	
	

}
