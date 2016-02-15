package com.wanhang.fitness.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanhang.fitness.dao.ModuleDao;
import com.wanhang.fitness.model.Module;
import com.wanhang.fitness.service.ModuleService;

@Service("moduleServiceImpl")
public class ModuleServiceImpl implements ModuleService {

	@Resource
	private ModuleDao moduleDao;
	
	@Override
	public Module findById(Integer id) {
		return moduleDao.findById(id);
	}

	@Override
	public List<Module> list() {
		return moduleDao.list();
	}

	@Override
	public List<Module> getModuleListByParentCode(String parentCode) {
		return moduleDao.getModuleListByParentCode(parentCode);
	}

	@Override
	public Module findModuleByModuleCode(String moduleCode) {
		return moduleDao.findModuleByModuleCode(moduleCode);
	}

}
