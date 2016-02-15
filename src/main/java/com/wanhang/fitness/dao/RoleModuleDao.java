package com.wanhang.fitness.dao;

import java.util.List;
import java.util.Map;

import com.wanhang.fitness.model.RoleModule;

public interface RoleModuleDao {
	public void saveList(Map<String,Object> map);
	public void deleteByRoleCode(String roleCode);
	public RoleModule getRoleModuleByRoleCode(String roleCode);
	public List<RoleModule> getRoleModuleListByRoleCode(String roleCode);
}
