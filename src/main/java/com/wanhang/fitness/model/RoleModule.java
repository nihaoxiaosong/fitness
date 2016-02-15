package com.wanhang.fitness.model;

/**
 * 角色模块关联表
 * @author song
 *
 */
public class RoleModule {
	/**
	 * id主键
	 */
	private Integer id;
	/**
	 * 角色代码
	 */
	private String roleCode;
	/**
	 * 模块代码
	 */
	private String moduleCode;
	/**
	 * 模块列表
	 */
	private Module module;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
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
	@Override
	public String toString() {
		return "RoleModule [id=" + id + ", roleCode=" + roleCode + ", moduleCode=" + moduleCode + ", module=" + module
				+ "]";
	}
	
}
