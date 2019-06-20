package com.pinyougou.pojo.web;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QryBrandReq implements Serializable{
		private Long id;
	    private String name;
	    private String firstChar;
}
