package com.wanhang.fitness.model;

import java.util.Date;

/**
 * 快捷入口，其实就是用户和模块的关联表
 * @author song
 *
 */
public class Shortcut {
	/**
	 * id主键
	 */
	private Integer id;
	/**
	 * 用户代码
	 */
	private String userCode;
	/**
	 * 模块代码
	 */
	private String moduleCode;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 模块
	 */
	private Module module;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
