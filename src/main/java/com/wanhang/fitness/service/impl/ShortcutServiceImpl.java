package com.wanhang.fitness.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanhang.fitness.dao.ShortcutDao;
import com.wanhang.fitness.model.Shortcut;
import com.wanhang.fitness.service.ShortcutService;

@Service("shortcutServiceImpl")
public class ShortcutServiceImpl implements ShortcutService {

	@Resource
	private ShortcutDao shortcutDao;
	
	@Override
	public void save(Shortcut shortcut) {
		shortcutDao.save(shortcut);
	}

	@Override
	public void delete(Integer id) {
		shortcutDao.delete(id);
	}

	@Override
	public void update(Shortcut shortcut) {
		shortcutDao.update(shortcut);
	}

	@Override
	public List<Shortcut> getShortcutListByUserCode(String userCode) {
		return shortcutDao.getShortcutListByUserCode(userCode);
	}

}
