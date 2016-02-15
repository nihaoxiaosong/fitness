package com.wanhang.fitness.common.util;

public class ChineseStringUtils {

	/**
	 * 把中文转成Unicode码
	 * 
	 * @param str
	 * @return
	 */
	public static String chinaToUnicode(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int chr1 = (char) str.charAt(i);
			if (chr1 >= 19968 && chr1 <= 171941) {// 汉字范围 \u4e00-\u9fa5 (中文)
				result += "\\u" + Integer.toHexString(chr1);
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = ChineseStringUtils.chinaToUnicode("悦享青春asd2134@");
		System.out.println(s);
		System.out.println("\u60a6\u4eab\u9752\u6625asd2134@");
	}
}
