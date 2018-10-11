package user.note.usernotewithcloudoauth2.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="note")
public class Note {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long noteId;
	
	@Column(name="title")
	@NotBlank
	@Max(50)
	private String title;
	
	@Column(name="createtime")
	private Date createTime;
	
	@Column(name="lastupdatetime")
	private Date lastUpdateTime;
	
	private transient Long userId;
	
	@ManyToOne
	@JoinColumn(name="userid")
	@JsonIgnoreProperties("noteList")
	private User user;

	
	public Note() {
		//default constructor
	}

	public Long getNoteId() {
		return noteId;
	}

	public void setNoteId(Long noteId) {
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
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", title=" + title + ", creatTime=" + createTime + ", lastUpdateTime="
				+ lastUpdateTime + ", user=" + user + "]";
	}	
}
