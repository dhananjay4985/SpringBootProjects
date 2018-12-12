package com.capsule.taskmanager.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="ParentTask")
public class ParentTask {
	
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "parenttaskid")
	private Long parentTaskId;

	@Column(name = "parenttask")
	private String parentTask;
	
	@OneToMany(fetch = FetchType.EAGER,targetEntity = Task.class ,mappedBy ="parentTask",cascade= {CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.REMOVE})
	@JsonIgnoreProperties("parentTask")	
	private Set<Task> taskSet = new HashSet<Task>();
	
	public ParentTask() {
		super();
	}	

	public ParentTask(Long parentTaskId, String parentTask, Set<Task> taskSet) {
		super();
		this.parentTaskId = parentTaskId;
		this.parentTask = parentTask;
		this.taskSet = taskSet;
	}

	public Long getParentTaskId() {
		return parentTaskId;
	}

	public void setParentTaskId(Long parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public String getParentTask() {
		return parentTask;
	}

	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}

	@Override
	public String toString() {
		return "ParentTask [parentTaskId=" + parentTaskId + ", parentTask=" + parentTask + "]";
	}	

}
