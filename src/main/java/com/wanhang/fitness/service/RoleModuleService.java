package com.wanhang.fitness.service;

import java.util.Map;

import com.wanhang.fitness.model.RoleModule;

public interface RoleModuleService {
	public void saveList(Map<String,Object> map);
	public void deleteByRoleCode(String roleCode);
	public RoleModule getRoleModuleByRoleCode(String roleCode);
}
