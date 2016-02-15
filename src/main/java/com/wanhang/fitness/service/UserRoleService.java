package com.wanhang.fitness.service;

import java.util.List;
import java.util.Map;

import com.wanhang.fitness.model.UserRole;

public interface UserRoleService {
	public void saveList(Map<String,Object> map);
	public void deleteByUserCode(String userCode);
	public List<UserRole> getUserRoleListByUserCode(String userCode);
}
