package com.wanhang.fitness.service;

import java.util.List;

import com.wanhang.fitness.model.Shortcut;

public interface ShortcutService {
	public void save(Shortcut shortcut);
	public void delete(Integer id);
	public void update(Shortcut shortcut);
	public List<Shortcut> getShortcutListByUserCode(String userCode);
}
