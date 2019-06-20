package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.web.PageReq;
import com.pinyougou.pojo.web.QryBrandForpageRes;
import com.pinyougou.pojo.web.QryBrandReq;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	public List<TbBrand> findAll();
	
	public QryBrandForpageRes qryTbBrandsForPage(QryBrandReq qryBrandReq,PageReq rageReq);
	
	
}
