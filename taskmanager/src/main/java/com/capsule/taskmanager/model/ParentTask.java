package com.capsule.taskmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ParentTask")
public class ParentTask {
	
    @Id
	@Column(name = "parenttaskid")
	private Long parentTaskId;

	@Column(name = "parenttask")
	private String parentTask;

	public ParentTask() {
		super();
	}

	public ParentTask(Long parentTaskId, String parentTask) {
		super();
		this.parentTaskId = parentTaskId;
		this.parentTask = parentTask;
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
