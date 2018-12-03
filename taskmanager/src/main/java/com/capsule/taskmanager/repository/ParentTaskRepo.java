package com.capsule.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capsule.taskmanager.model.ParentTask;

@Repository
public interface ParentTaskRepo extends JpaRepository<ParentTask,Long>{

}
