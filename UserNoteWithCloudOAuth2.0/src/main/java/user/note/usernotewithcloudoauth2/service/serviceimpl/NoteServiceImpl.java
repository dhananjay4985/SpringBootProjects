package user.note.usernotewithcloudoauth2.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.note.usernotewithcloudoauth2.exception.ResourceNotFoundException;
import user.note.usernotewithcloudoauth2.model.Note;
import user.note.usernotewithcloudoauth2.repository.NoteRepository;
import user.note.usernotewithcloudoauth2.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService{

	@Autowired
	private NoteRepository noteRepository;

	@Override
	public Note getNoteById(Long noteId) {
		return noteRepository.findById(noteId)
				.orElseThrow(()-> new ResourceNotFoundException("noteId", "Note",noteId));
	}

	@Override
	public void createNote(Note note) {		
		noteRepository.save(note);
	}

	@Override
	public void updateNote(Note Note) {
		
	}

	@Override
	public void deleteNoteById(Long noteId) {
		noteRepository.deleteById(noteId);
	}

	@Override
	public Note getNoteByTitle(String title) {
		return noteRepository.getNoteByTitle(title);
	}

	@Override
	public List<Note> getAllNote() {
		return noteRepository.findAll();
	}

}
