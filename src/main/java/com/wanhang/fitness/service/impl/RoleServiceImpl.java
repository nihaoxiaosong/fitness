package com.wanhang.fitness.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanhang.fitness.dao.RoleDao;
import com.wanhang.fitness.model.Role;
import com.wanhang.fitness.service.RoleService;

@Service("roleServiceImpl")
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleDao roleDao;
	
	@Override
	public void save(Role role) {
		roleDao.save(role);
	}

	@Override
	public void deleteById(Integer id) {
		roleDao.deleteById(id);
	}

	@Override
	public void update(Role role) {
		roleDao.update(role);
	}

	@Override
	public Role findById(Integer id) {
		return roleDao.findById(id);
	}

	@Override
	public List<Role> getRoleListByVenueId(Integer venueId) {
		return roleDao.getRoleListByVenueId(venueId);
	}

}
