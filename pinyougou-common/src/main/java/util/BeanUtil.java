package util;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class BeanUtil {
	
	public static <T>  T  beanConvertBean(Object obj,Class<T> class1) {
		
		String jsonString = JSON.toJSONString(obj);
		
		
		return JSON.parseObject(jsonString, class1);
		
		
	}
	
	
	public static <T>  List<T>  beanConvertBeanForList(List obj,Class<T> class1) {
		
		String jsonString = JSON.toJSONString(obj);
		
		return JSON.parseArray(jsonString, class1);
		
		
	}
	
	
}
