package com.wanhang.fitness.model;

/**
 * 用户角色关联表
 * @author song
 *
 */
public class UserRole {
	/**
	 * id主键
	 */
	private Integer id;
	/**
	 * 用户代码
	 */
	private String userCode;
	/**
	 * 角色代码
	 */
	private String roleCode;
	/**
	 * 角色列表
	 */
	private Role role;
	
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
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", userCode=" + userCode + ", roleCode=" + roleCode + ", role=" + role + "]";
	}
	
	
}
