package com.wanhang.fitness.service;

import java.util.List;

import com.wanhang.fitness.model.Module;

public interface ModuleService {
	public Module findById(Integer id);
	public List<Module> list();
	public List<Module> getModuleListByParentCode(String parentCode);
	public Module findModuleByModuleCode(String moduleCode);
}
