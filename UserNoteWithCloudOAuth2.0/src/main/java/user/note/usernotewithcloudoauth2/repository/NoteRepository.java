package user.note.usernotewithcloudoauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import user.note.usernotewithcloudoauth2.model.Note;

@Repository("noteRepository")
public interface NoteRepository extends JpaRepository<Note,Long>{
	Note getNoteByTitle(String title);
}
