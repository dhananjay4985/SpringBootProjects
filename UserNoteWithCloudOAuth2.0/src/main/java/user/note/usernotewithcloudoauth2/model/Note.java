package user.note.usernotewithcloudoauth2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="note")
public class Note {

	@Id
	@GeneratedValue
	private Integer noteId;
	
	@Column(name="title")
	@NotBlank
	@Max(50)
	private String title;
	
	@Column(name="createtime")
	private Date createTime;
	
	@Column(name="lastupdatetime")
	private Date lastUpdateTime;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;

	public Integer getNoteId() {
		return noteId;
	}

	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatTime() {
		return createTime;
	}

	public void setCreatTime(Date creatTime) {
		this.createTime = creatTime;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", title=" + title + ", creatTime=" + createTime + ", lastUpdateTime="
				+ lastUpdateTime + ", user=" + user + "]";
	}	
}
