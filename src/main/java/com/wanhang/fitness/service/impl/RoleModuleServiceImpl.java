package com.wanhang.fitness.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanhang.fitness.dao.RoleModuleDao;
import com.wanhang.fitness.model.RoleModule;
import com.wanhang.fitness.service.RoleModuleService;

@Service("roleModuleServiceImpl")
public class RoleModuleServiceImpl implements RoleModuleService {

	@Resource
	private RoleModuleDao roleModuleDao;
	
	@Override
	public void saveList(Map<String,Object> map) {
		roleModuleDao.saveList(map);
	}

	@Override
	public void deleteByRoleCode(String roleCode) {
		roleModuleDao.deleteByRoleCode(roleCode);
	}

	@Override
	public RoleModule getRoleModuleByRoleCode(String roleCode) {
		return roleModuleDao.getRoleModuleByRoleCode(roleCode);
	}
	
}
