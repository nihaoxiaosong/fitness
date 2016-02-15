package com.wanhang.fitness.dao;

import java.util.List;

import com.wanhang.fitness.model.Role;

public interface RoleDao {
	public void save(Role role);
	public void deleteById(Integer id);
	public void update(Role role);
	public Role findById(Integer id);
	public List<Role> getRoleListByVenueId(Integer venueId);
	public Role findRoleByRoleCode(String roleCode);
}
