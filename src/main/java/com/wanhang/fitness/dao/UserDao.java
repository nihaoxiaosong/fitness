package com.wanhang.fitness.dao;

import java.util.List;

import com.wanhang.fitness.model.User;

public interface UserDao {
	public void save(User user);
	public void update(User user);
	public User findUserById(Integer id);
	public User findUserByUserCode(String userCode);
	public List<User> getUserListByVenueId(Integer venueId);
	public User login(User user);
}
