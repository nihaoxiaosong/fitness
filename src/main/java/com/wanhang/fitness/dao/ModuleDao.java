package com.wanhang.fitness.dao;

import java.util.List;

import com.wanhang.fitness.model.Module;

public interface ModuleDao {
	public Module findById(Integer id);
	public List<Module> list();
	public List<Module> getModuleListByParentCode(String parentCode);
	public Module findModuleByModuleCode(String moduleCode);
}
