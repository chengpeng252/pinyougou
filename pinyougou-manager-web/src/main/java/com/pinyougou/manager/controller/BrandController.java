package com.pinyougou.manager.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.web.PageReq;
import com.pinyougou.pojo.web.QryBrandForpageRes;
import com.pinyougou.pojo.web.QryBrandReq;
import com.pinyougou.sellergoods.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return brandService.findAll();		
	}
	
	
	@RequestMapping("/search")
	public QryBrandForpageRes search(@ModelAttribute("Model") PageReq pageReq,@RequestBody QryBrandReq qryBrandReq ){
		
		QryBrandForpageRes qryTbBrandsForPage = brandService.qryTbBrandsForPage(qryBrandReq, pageReq);
		
		return qryTbBrandsForPage;		
	}
	
	
}
