package com.wanhang.fitness.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanhang.fitness.dao.UserDao;
import com.wanhang.fitness.model.User;
import com.wanhang.fitness.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User findUserById(Integer id) {
		return userDao.findUserById(id);
	}

	@Override
	public List<User> getUserListByVenueId(Integer venueId) {
		return userDao.getUserListByVenueId(venueId);
	}

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

}
