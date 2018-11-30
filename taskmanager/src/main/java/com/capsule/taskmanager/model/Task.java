package com.capsule.taskmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Task")
public class Task {

	@Id	
	@Column(name = "taskid")	
	private Long taskId;

	@ManyToOne
	@Column(name = "parentid")
	private Long parentId;
	
	@Column(name = "taskname")
	private String taskName;

	@Column(name = "startdate")
	private Date startDate;

	@Column(name = "enddate")
	private Date endDate;


	public Task() {
		super();
	}

	public Task(Long taskId, Long parentId, String taskName, Date startDate, Date endDate) {
		super();
		this.taskId = taskId;
		this.parentId = parentId;
		this.taskName = taskName;
		this.startDate = startDate;
		this.endDate = endDate;
	}



	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", parentId=" + parentId + ", taskName=" + taskName + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
}
