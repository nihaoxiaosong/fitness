
package com.wanhang.fitness.common.util;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;


/**
 * cookie的增加、删除、查询
 */
public class CookieUtils {

    public static final String COOKIENAME = "VENSITECOOKIE";

    private static UserCookie userCookie = new UserCookie();

    // 添加一个cookie
    public static Cookie addCookie(UserCookie userCookie) {
        Cookie cookie;
		try {
			cookie = new Cookie(COOKIENAME, SecurityUtil.encrypt(userCookie.getUserId() + ";" + userCookie.getUserName() + ";" + userCookie.getPassword() + ";"
			    + userCookie.getIsRememberPsd() + ";" + userCookie.getIsAutoLogin()));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
        // 添加cookie
        cookie.setMaxAge(60 * 60 * 24 * 30);// cookie保存30天
        cookie.setPath("/");
        cookie.setDomain(PropertiesUtils.getString("domain_name"));
        return cookie;
    }

    // 得到cookie
    public static UserCookie getCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println("cookie: " + cookie.getName());
                if (CookieUtils.COOKIENAME.equals(cookie.getName())) {
                    String value;
					try {
						value = SecurityUtil.decrypt(cookie.getValue());
					} catch (Exception e) {
						e.printStackTrace();
						return null;
					}
                    if (StringUtils.isNotBlank(value)) {
                        String[] split = value.split(";");
                        userCookie.setVenue_id(split[0]);
                        userCookie.setUserId(split[1]);
                        userCookie.setUserName(split[2]);
                        userCookie.setPassword(split[3]);
                        if (split[4].equals("true")) {
                            userCookie.setIsRememberPsd(true);
                        }
                        else
                            userCookie.setIsRememberPsd(false);

                        if (split[5].equals("true")) {
                            userCookie.setIsAutoLogin(true);
                        }
                        else
                            userCookie.setIsAutoLogin(false);
                        return userCookie;
                    }
                }
            }
        }
        return null;
    }

    // 添加一个sTimestemp
    public static Cookie addSTimestemp() {
        Cookie cookie;
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.MINUTE,30);
			cookie = new Cookie("STimestemp", SecurityUtil.encrypt(cal.getTime().toString()));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
        // 添加cookie
        cookie.setPath("/");
        cookie.setDomain(PropertiesUtils.getString("domain_name"));
        return cookie;
    }

    // 得到sTimestemp
    public static String getSTimestemp(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println("cookie: " + cookie.getName());
                if ("STimestemp".equals(cookie.getName())) {
                    String value = cookie.getValue();
                    if (StringUtils.isNotBlank(value)) {
    					try {
    						value = SecurityUtil.decrypt(value);
    					} catch (Exception e) {
    						e.printStackTrace();
    						return null;
    					}
    					return value;
                    }
                }
            }
        }
        return null;
    }
    
    // 删除cookie
    public static Cookie delCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (COOKIENAME.equals(cookie.getName())) {
                    cookie.setValue("");
                    cookie.setMaxAge(0);
                    return cookie;
                }
            }
        }
        return null;
    }
}
