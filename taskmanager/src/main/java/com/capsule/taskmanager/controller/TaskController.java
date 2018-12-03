package com.capsule.taskmanager.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capsule.taskmanager.model.Task;
import com.capsule.taskmanager.service.TaskService;

@RestController
@RequestMapping(value="/taskmanager")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class TaskController {
	
	
	@Autowired
	@Qualifier("taskService")
	private TaskService taskService;
	
	@GetMapping(value="/alltasks")
	public List<Task> listAllTasks(){		
		return taskService.getTask();
	}
	@GetMapping(value="/alltasks/{taskId}")
	public Task getTaskById(@PathVariable("taskId") Long taskId) {
		return taskService.findById(taskId);
	}	
	@PutMapping(value="/alltasks/{taskId}")
	public void editTask(@PathVariable(value = "taskId") Long taskId,@Valid @RequestBody Task taskDetails) {
		taskService.editTask(taskDetails, taskId);
	}		
	@PostMapping("/alltasks")
	public void createTask(@Valid @RequestBody Task task) {
		taskService.createTask(task);
	}
	@DeleteMapping("/allbooks/{taskId}")
	public ResponseEntity<Void> deleteTask(@PathVariable(value = "taskId") Long taskId) {
		taskService.deleteTask(taskId);
		return ResponseEntity.ok().build();
	}

}
