package com.pinyougou.sellergoods.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.sellergoods.dao.SellergoodsDao;
import com.pinyougou.sellergoods.service.SellergoodsService;

@Service
public class SellergoodsServiceImpl implements SellergoodsService {
	@Autowired
	private SellergoodsDao sellergoodsDao;
	
	

}
