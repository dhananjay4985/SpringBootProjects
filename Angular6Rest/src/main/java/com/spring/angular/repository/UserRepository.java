package com.spring.angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.angular.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
