package user.note.usernotewithcloudoauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import user.note.usernotewithcloudoauth2.model.Note;

public interface NoteRepository extends JpaRepository<Note,Long>{

}
