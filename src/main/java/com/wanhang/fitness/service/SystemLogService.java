package com.wanhang.fitness.service;

import java.util.List;
import java.util.Map;

import com.wanhang.fitness.model.SystemLog;

public interface SystemLogService {
	public void save(SystemLog systemLog);
	public List<SystemLog> list(Map<String, Object> map);
	public List<SystemLog> search(Map<String, Object> map);
	public int count();
}
