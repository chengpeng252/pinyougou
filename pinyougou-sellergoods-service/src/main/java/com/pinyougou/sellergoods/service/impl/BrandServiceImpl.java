package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.web.PageReq;
import com.pinyougou.pojo.web.QryBrandForpageRes;
import com.pinyougou.pojo.web.QryBrandReq;
import com.pinyougou.sellergoods.service.BrandService;

import util.BeanUtil;
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;
	
	@Override
	public List<TbBrand> findAll() {
		

		return brandMapper.qryTbBrand(null);
	}

	@Override
	public QryBrandForpageRes qryTbBrandsForPage(QryBrandReq qryBrandReq, PageReq rageReq) {
		
		TbBrand tbBrand = BeanUtil.beanConvertBean(qryBrandReq, TbBrand.class);
		System.out.println(tbBrand);
		PageHelper.startPage(rageReq.getPage(), rageReq.getSize());
		List<TbBrand> qryTbBrand = brandMapper.qryTbBrand(tbBrand);
		PageInfo<TbBrand> pageInfo=new PageInfo<>(qryTbBrand);
		QryBrandForpageRes qryBrandForpageRes = new QryBrandForpageRes();
		List<TbBrand> beanConvertBeanForList = BeanUtil.beanConvertBeanForList(qryTbBrand, TbBrand.class);
		qryBrandForpageRes.setRows(beanConvertBeanForList);
		qryBrandForpageRes.setTotal(pageInfo.getTotal());
		return qryBrandForpageRes;
	}

}
