package com.pinyougou.pojo.web;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class PageReq implements Serializable {
	private Integer page;
	private Integer size;
	

}
