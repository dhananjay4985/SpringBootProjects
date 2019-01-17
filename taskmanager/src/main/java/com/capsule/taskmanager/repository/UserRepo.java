package com.capsule.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capsule.taskmanager.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
