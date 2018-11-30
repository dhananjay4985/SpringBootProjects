package com.capsule.taskmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ParentTask")
public class ParentTask {
	
    @Id
	@Column(name = "parentid")
	private Long parentId;

	@Column(name = "parenttask")
	private String parentTask;

	public ParentTask() {
		super();
	}

	public ParentTask(Long parentId, String parentTask) {
		super();
		this.parentId = parentId;
		this.parentTask = parentTask;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getParentTask() {
		return parentTask;
	}

	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}

	@Override
	public String toString() {
		return "ParentTask [parentId=" + parentId + ", parentTask=" + parentTask + "]";
	}	

}
