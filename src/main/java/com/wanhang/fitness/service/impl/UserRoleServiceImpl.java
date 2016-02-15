package com.wanhang.fitness.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanhang.fitness.dao.UserRoleDao;
import com.wanhang.fitness.model.UserRole;
import com.wanhang.fitness.service.UserRoleService;

@Service("userRoleServiceImpl")
public class UserRoleServiceImpl implements UserRoleService {

	@Resource
	private UserRoleDao userRoleDao;
	
	@Override
	public void saveList(Map<String,Object> map) {
		userRoleDao.saveList(map);
	}

	@Override
	public void deleteByUserCode(String userCode) {
		userRoleDao.deleteByUserCode(userCode);
	}

	@Override
	public List<UserRole> getUserRoleListByUserCode(String userCode) {
		return userRoleDao.getUserRoleListByUserCode(userCode);
	}

}
