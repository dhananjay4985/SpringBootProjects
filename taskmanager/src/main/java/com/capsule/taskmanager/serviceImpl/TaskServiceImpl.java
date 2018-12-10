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
		List<Task> taskList = taskRepo.findAll();
		for(Task task : taskList) {
			task.setParentId(task.getParentTask().getParentTaskId());
		}
		return taskList;
	}
	@Override
	public Task findById(Long taskId) {
		Task task = taskRepo.findById(taskId).orElseThrow(() -> new ResourceNotFoundException("Task", "TaskId", taskId));
		task.setParentTask(parentTaskRepo.getOne(task.getParentId()));
		return task;
	}
	@Override
	public void editTask(Task updateTask, Long taskId) {
		Task task = taskRepo.findById(taskId).orElseThrow(() -> new ResourceNotFoundException("Task", "TaskId", taskId));
		task.setEndDate(updateTask.getEndDate());
		task.setParentId(updateTask.getParentId());
		task.setStartDate(updateTask.getStartDate());
		task.setTaskId(updateTask.getTaskId());
		task.setTaskName(updateTask.getTaskName());
		task.setPriority(updateTask.getPriority());
		task.setParentTask(parentTaskRepo.getOne(updateTask.getParentId()));
		taskRepo.save(task);
	}
	@Override
	public void deleteTask(Long taskId) {
		Task task = taskRepo.findById(taskId).orElseThrow(() -> new ResourceNotFoundException("Task", "TaskId", taskId));
		taskRepo.delete(task);
	}
}
