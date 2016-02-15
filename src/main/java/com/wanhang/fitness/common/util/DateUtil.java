package com.wanhang.fitness.common.util;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil{
	public static String formatDate(Date date, String format){
		String result = "";
		if(StringUtil.isEmpty(format)) {
			return result;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if(date != null) {
			result = sdf.format(date);
		}
		return result;
	}
	
	public static Date formatString(String str, String format){
		if(StringUtil.isEmpty(str)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try{
			return sdf.parse(str);
		}catch(ParseException e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * String to Time
	 * 
	 * @param timeStr
	 * @param pattern
	 *            时间格式 ：；例 hh:mm:ss
	 * @return
	 * @throws ParseException
	 */
	public static Time stringToTime(String timeStr, String pattern) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Time time = new Time(sdf.parse(timeStr).getTime());
		return time;
	}
	
	/**
	 * 得到年
	 * 
	 * @param c
	 * @return
	 */
	public static int getYear(Calendar c){
		if(c != null) {
			return c.get(Calendar.YEAR);
		}else{
			return Calendar.getInstance().get(Calendar.YEAR);
		}
	}
	
	/**
	 * 得到月份 注意，这里的月份依然是从0开始的
	 * 
	 * @param c
	 * @return
	 */
	public static int getMonth(Calendar c){
		if(c != null) {
			return c.get(Calendar.MONTH);
		}else{
			return Calendar.getInstance().get(Calendar.MONTH);
		}
	}
	
	/**
	 * 得到日期
	 * 
	 * @param c
	 * @return
	 */
	public static int getDate(Calendar c){
		if(c != null) {
			return c.get(Calendar.DATE);
		}else{
			return Calendar.getInstance().get(Calendar.DATE);
		}
	}
	
	/**
	 * 得到星期
	 * 
	 * @param c
	 * @return
	 */
	public static int getDay(Calendar c){
		int week;
		if(c != null) {
			week = c.get(Calendar.DAY_OF_WEEK);
		}else{
			week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		}
		week = week - 1;
		if(week == 0){
			week = 7;
		}
		return week;
	}
	
	/**
	 * 得到小时
	 * 
	 * @param c
	 * @return
	 */
	public static int getHour(Calendar c){
		if(c != null) {
			return c.get(Calendar.HOUR);
		}else{
			return Calendar.getInstance().get(Calendar.HOUR);
		}
	}
	
	/**
	 * 得到分钟
	 * 
	 * @param c
	 * @return
	 */
	public static int getMinute(Calendar c){
		if(c != null) {
			return c.get(Calendar.MINUTE);
		}else{
			return Calendar.getInstance().get(Calendar.MINUTE);
		}
	}
	
	/**
	 * 得到秒
	 * 
	 * @param c
	 * @return
	 */
	public static int getSecond(Calendar c){
		if(c != null) {
			return c.get(Calendar.SECOND);
		}else{
			return Calendar.getInstance().get(Calendar.SECOND);
		}
	}
	
	/**
	 * 得到指定或者当前时间前n天的Calendar
	 * 
	 * @param c
	 * @param n
	 * @return
	 */
	public static Calendar beforeNDays(Calendar c, int n){
		// 偏移量，给定n天的毫秒数
		long offset = n * 24 * 60 * 60 * 1000;
		Calendar calendar = null;
		if(c != null) {
			calendar = c;
		}else{
			calendar = Calendar.getInstance();
		}
		
		calendar.setTimeInMillis(calendar.getTimeInMillis() - offset);
		return calendar;
	}
	
	/**
	 * 得到指定或者当前时间后n天的Calendar
	 * 
	 * @param c
	 * @param n
	 * @return
	 */
	public static Calendar afterNDays(Calendar c, int n){
		// 偏移量，给定n天的毫秒数
		long offset = n * 24 * 60 * 60 * 1000;
		Calendar calendar = null;
		if(c != null) {
			calendar = c;
		}else{
			calendar = Calendar.getInstance();
		}
		
		calendar.setTimeInMillis(calendar.getTimeInMillis() + offset);
		return calendar;
	}
	
	/**
     * 获取某年第一天日期
     * @param year 年份
     * @return Date
     */
    public static Date getYearFirst(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }
     
    /**
     * 获取某年最后一天日期
     * @param year 年份
     * @return Date
     */
    public static Date getYearLast(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }
    
    /**
     * 获取月份的第一天
     * @param year
     * @param month
     * @return
     */
    public static Date getMonthFirst(int year, int month){
    	Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }
    
    /**
     * 获取月份的最后一天
     * @param year
     * @param month
     * @return
     */
    public static Date getMonthLast(int year, int month){
    	Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));  
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }
    
    /**
     * 功能：获取本周的开始时间
     * 示例：2013-05-13 00:00:00
     */   
    public static Date getWeekFirst(int year, int week) {// 当周开始时间
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.WEEK_OF_YEAR, week);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return calendar.getTime();
    }
    
    /**
     * 功能：获取本周的结束时间
     * 示例：2013-05-19 23:59:59
     */   
    public static Date getWeekLast(int year, int week) {// 当周结束时间
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.WEEK_OF_YEAR, week);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return calendar.getTime();
    }
    
    /**
     * 根据传入日期取到周几
     * @param date
     * @return
     */
    public static int getWeekByDate(Date date){
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(date);
    	int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if(week == 0){
			week = 7;
		}
		return week;
    }
    
    /**
     * 格式timestamp
     * @param timestamp
     * @return
     */
    public static String timestampFormat(Timestamp timestamp, String pattern){
    	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    	String time = sdf.format(timestamp);
    	return time;
    }
    
    /**
     * 获取timeStamp
     * @param time
     * @return
     */
    public static Timestamp getTimestamp(String time){
    	if(time.length() <= 10){
    		return Timestamp.valueOf(time + " 00:00:00");
    	}else if(time.length() <= 16){
    		return Timestamp.valueOf(time + ":00");
    	}else{
    		return Timestamp.valueOf(time);
    	}
    }
	
}
