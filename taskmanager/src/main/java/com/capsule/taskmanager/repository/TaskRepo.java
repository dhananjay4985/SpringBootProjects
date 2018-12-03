package com.capsule.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capsule.taskmanager.model.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task,Long>{

}
