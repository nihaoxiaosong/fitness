package com.wanhang.fitness.service;

import java.util.List;

import com.wanhang.fitness.model.User;

public interface UserService {
	public void save(User user);
	public void update(User user);
	public User findUserById(Integer id);
	public List<User> getUserListByVenueId(Integer venueId);
	public User login(User user);
}
