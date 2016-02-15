package com.wanhang.fitness.model;

import java.util.List;

/**
 * 角色表
 * @author song
 *
 */
public class Role {
	/**
	 * id主键
	 */
	private Integer id;
	/**
	 * 角色代码
	 */
	private String roleCode;
	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 * 场馆id
	 */
	private Integer venueId;
	/**
	 * 场馆名称
	 */
	private String venueName;
	/**
	 * 是否启用 0启用，1不启用
	 */
	private Integer enable;
	/**
	 * 角色模块列表
	 */
	private List<RoleModule> roleModuleList;
	
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
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	public Integer getEnable() {
		return enable;
	}
	public void setEnable(Integer enable) {
		this.enable = enable;
	}
	public List<RoleModule> getRoleModuleList() {
		return roleModuleList;
	}
	public void setRoleModuleList(List<RoleModule> roleModuleList) {
		this.roleModuleList = roleModuleList;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleCode=" + roleCode + ", roleName=" + roleName + ", venueId=" + venueId
				+ ", venueName=" + venueName + ", enable=" + enable + ", roleModuleList=" + roleModuleList + "]";
	}
	
}
