package com.wanhang.fitness.common.util;

import java.util.List;

/**
 * List工具类
 * @author 
 *
 */
public class ListUtil {

	/**
	 * 判断是否是空
	 * @param str
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(List list){
		if (list == null || list.isEmpty()){			
			return true;
		}
		return false;
	}
	
	/**
	 * 判断是否不是空
	 * @param str
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isNotEmpty(List list){
		if (list != null && !list.isEmpty()){			
			return true;
		}
		return false;
	}
}
