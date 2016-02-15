/*-------------------------------------------------------------------------------
 * All Rights Reserved. Copyright(C) WHKJ Co.,Ltd.
 * revision : 
 * vendor   : WHKJ Co.,Ltd.
 * author   : Sun.yan
 * since    : 2015/07/06
 *-------------------------------------------------------------------------------
 * revision 
 *-----------------------------------------------------------------------------*/

package com.wanhang.fitness.common.util;

public class UserCookie {

    /**
     * 场馆ID
     */
	private String venue_id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否记住密码
     */
    private boolean isRememberPsd;

    /**
     * 是否自动登录
     */
    private boolean isAutoLogin;

    public String getVenue_id() {
		return venue_id;
	}

	public void setVenue_id(String venue_id) {
		this.venue_id = venue_id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsRememberPsd() {
        return isRememberPsd;
    }

    public void setIsRememberPsd(boolean isRememberPsd) {
        this.isRememberPsd = isRememberPsd;
    }

    public boolean getIsAutoLogin() {
        return isAutoLogin;
    }

    public void setIsAutoLogin(boolean isAutoLogin) {
        this.isAutoLogin = isAutoLogin;
    }

}
