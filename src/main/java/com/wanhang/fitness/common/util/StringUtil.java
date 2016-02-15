package com.wanhang.fitness.common.util;


/**
 * 字符串工具类
 * @author 
 *
 */
public class StringUtil {

	/**
	 * 判断是否是空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(str==null||"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 判断是否不是空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if((str!=null)&&!"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 去掉多余的小数位   1.20 -- 1.2 ； 1.00 -- 1
	 * @param s
	 * @return
	 */
    public static String subZeroAndDot(String s){
        if (isEmpty(s))
              return "" ;
        if(s.indexOf("." ) > 0){ 
             s = s.replaceAll( "0+?$", "" );//去掉多余的0 
             s = s.replaceAll( "[.]$", "" );//如最后一位是.则去掉 
        }
        return s; 
   }
}
