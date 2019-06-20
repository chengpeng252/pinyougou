package com.pinyougou.pojo.web;

import java.io.Serializable;
import java.util.List;

import com.pinyougou.pojo.TbBrand;

import lombok.Data;

@Data
public class QryBrandForpageRes implements Serializable {
	
	private List<TbBrand>  rows;
	
	private Long total;
	

}
