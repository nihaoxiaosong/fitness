package com.wanhang.fitness.model;

import java.util.Date;

/**
 * 系统日志表
 * @author song
 *
 */
public class SystemLog {
	/**
	 * 主键id
	 */
	private Integer id;
	/**
	 * 场馆id
	 */
	private Integer venueId;
	/**
	 * 场馆名称
	 */
	private String venueName;
	/**
	 * 模块代码
	 */
	private String moduleCode;
	/**
	 * 模块名称
	 */
	private String moduleName;
	/**
	 * 日志内容
	 */
	private String logContent;
	/**
	 * 创建用户code
	 */
	private String createrCode;
	/**
	 * 创建用户姓名
	 */
	private String createrName;
	/**
	 * 创建时间
	 */
	private Date createDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVenueId() {
		return venueId;
	}
	public void setVenueId(Integer venueId) {
		this.venueId = venueId;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getLogContent() {
		return logContent;
	}
	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}
	public String getCreaterCode() {
		return createrCode;
	}
	public void setCreaterCode(String createrCode) {
		this.createrCode = createrCode;
	}
	public String getCreaterName() {
		return createrName;
	}
	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
