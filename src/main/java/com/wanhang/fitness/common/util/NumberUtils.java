package com.wanhang.fitness.common.util;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtils {

	/**
	 * 获取指定范围内的随机数
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int getRandomCaptcha(final int min, final int max) {
		Random rand = new Random();
		int r;
		do {
			r = rand.nextInt();
		} while (r == Integer.MIN_VALUE);
		int tmp = Math.abs(r);
		return tmp % (max - min + 1) + min;
	}

	/**
	 * 手机号验证
	 * 
	 * @param str
	 * @return 验证通过返回true
	 */
	public static boolean isMobile(String str) {
		boolean b = false;
		if(str == null || str.length() != 11)
			return b;
		Pattern p = null;
		Matcher m = null;
		p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
		m = p.matcher(str);
		b = m.matches();
		return b;
	}

	/**
	 * 生成订单成功的验证码
	 */
	public static String valCode() {
		String code = "";
		StringBuffer radom = new StringBuffer();
		int a = 0;
		int b = 0;
		int num[] = new int[11];
		for (int i = 1; i < num.length + 1; i++) {
			num[i - 1] = (int) (10 * (Math.random()));
			radom.append(num[i - 1]);
			if (i % 2 == 0 && i != 0) {
				a += num[i - 1];
			} else if (i % 2 != 0) {
				b += num[i - 1];
			}
		}
		int c = a * 3;
		int d = b + c;
		int e = 0;
		if (d % 10 != 0) {
			e = (d / 10 + 1) * 10 - d;
		}
		code = radom.toString() + e;
		return code;
	}
}
