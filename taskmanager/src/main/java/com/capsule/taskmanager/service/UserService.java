package com.capsule.taskmanager.service;

import com.capsule.taskmanager.model.User;

public interface UserService {

	void addUser(User addUser);
	void deleteUser(Integer userId);
	User updateUser(User updateUser);
}
