package com.springboot.service;

import java.util.List;

import com.springboot.model.User;

public interface UserService {

	User saveUser(User user);

	List<User> getAllUsers();

	User getUserById(Long id);

	boolean deleterUser(Long id);

	User updateUser(Long id, User user);

}
