package com.capsule.taskmanager.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsule.taskmanager.exceptionhandler.ResourceNotFoundException;
import com.capsule.taskmanager.model.Task;
import com.capsule.taskmanager.repository.ParentTaskRepo;
import com.capsule.taskmanager.repository.TaskRepo;
import com.capsule.taskmanager.service.TaskService;

@Service("taskService")
public class TaskServiceImpl implements TaskService {

	//@Autowired
	private TaskRepo taskRepo;
	private ParentTaskRepo parentTaskRepo;
	
	@Autowired
	public TaskServiceImpl(TaskRepo taskRepo, ParentTaskRepo parentTaskRepo) {
		this.taskRepo = taskRepo;
		this.parentTaskRepo = parentTaskRepo;
	}

	@Override
	public void createTask(Task task) {
		task.setParentTask(parentTaskRepo.getOne(task.getParentId()));
		taskRepo.save(task);
	}
	@Override
	public List<Task> getTask() {
		return taskRepo.findAll();
	}
	@Override
	public Task findById(Long taskId) {
		Task task = taskRepo.findById(taskId).orElseThrow(() -> new ResourceNotFoundException("Task", "TaskId", taskId));
		task.setParentTask(task.
		return task;
	}
	@Override
	public void editTask(Task task, Long taskId) {
		Task task1 = taskRepo.findById(taskId).orElseThrow(() -> new ResourceNotFoundException("Task", "TaskId", taskId));
		task1.setEndDate(task1.getEndDate());
		task1.setParentId(task1.getParentId());
		task1.setStartDate(task1.getStartDate());
		task1.setTaskId(task1.getTaskId());
		task1.setTaskName(task1.getTaskName());
		taskRepo.save(task);
	}
	@Override
	public void deleteTask(Long taskId) {
		Task task = taskRepo.findById(taskId).orElseThrow(() -> new ResourceNotFoundException("Task", "TaskId", taskId));
		taskRepo.delete(task);
	}
}
