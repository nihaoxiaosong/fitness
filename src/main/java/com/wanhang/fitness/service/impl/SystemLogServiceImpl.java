package com.wanhang.fitness.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanhang.fitness.dao.SystemLogDao;
import com.wanhang.fitness.model.SystemLog;
import com.wanhang.fitness.service.SystemLogService;

@Service("systemLogServiceImpl")
public class SystemLogServiceImpl implements SystemLogService {

	@Resource
	private SystemLogDao systemLogDao;
	
	@Override
	public void save(SystemLog systemLog) {
		systemLogDao.save(systemLog);
	}

	@Override
	public List<SystemLog> list(Map<String, Object> map) {
		return systemLogDao.list(map);
	}

	@Override
	public List<SystemLog> search(Map<String, Object> map) {
		return systemLogDao.search(map);
	}

	@Override
	public int count() {
		return systemLogDao.count();
	}

}
