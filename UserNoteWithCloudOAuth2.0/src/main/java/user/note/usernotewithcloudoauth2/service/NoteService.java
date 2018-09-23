package user.note.usernotewithcloudoauth2.service;

import java.util.List;

import user.note.usernotewithcloudoauth2.model.Note;

public interface NoteService {

	Note getNoteById(Long noteId);
	void createNote(Note note);
	void updateNote(Note Note);
	void deleteNoteById(Long noteId);
	Note getNoteByTitle(String title);
	List<Note> getAllNote();
}
