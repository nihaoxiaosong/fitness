package com.wanhang.fitness.model;

/**
 * 模块表
 * @author song
 * 
 */
public class Module {
	/**
	 * id主键
	 */
	private Integer id;
	/**
	 * 模块代码
	 */
	private String moduleCode;
	/**
	 * 模块名称
	 */
	private String moduleName;
	/**
	 * 模块点击链接地址
	 */
	private String moduleUrl;
	/**
	 * 模块图标地址
	 */
	private String moduleIcon;
	/**
	 * 模块层级
	 * 0第一级
	 * 1第二级
	 * 2第三级
	 */
	private Integer level;
	/**
	 * 父级模块代码
	 */
	private String parentCode;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getModuleUrl() {
		return moduleUrl;
	}
	public void setModuleUrl(String moduleUrl) {
		this.moduleUrl = moduleUrl;
	}
	public String getModuleIcon() {
		return moduleIcon;
	}
	public void setModuleIcon(String moduleIcon) {
		this.moduleIcon = moduleIcon;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	@Override
	public String toString() {
		return "Module [id=" + id + ", moduleCode=" + moduleCode + ", moduleName=" + moduleName + ", moduleUrl="
				+ moduleUrl + ", moduleIcon=" + moduleIcon + ", level=" + level + ", parentCode=" + parentCode + "]";
	}
	
}
