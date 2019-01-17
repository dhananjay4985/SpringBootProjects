package com.capsule.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capsule.taskmanager.model.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
