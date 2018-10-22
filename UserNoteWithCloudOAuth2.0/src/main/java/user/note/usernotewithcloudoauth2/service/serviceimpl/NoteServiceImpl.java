package user.note.usernotewithcloudoauth2.service.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import user.note.usernotewithcloudoauth2.exception.ResourceNotFoundException;
import user.note.usernotewithcloudoauth2.model.Note;
import user.note.usernotewithcloudoauth2.repository.NoteRepository;
import user.note.usernotewithcloudoauth2.repository.UserRepository;
import user.note.usernotewithcloudoauth2.service.NoteService;

@Service("noteService")
@Transactional
public class NoteServiceImpl implements NoteService{

	@Autowired
	private NoteRepository noteRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public Note getNoteById(Long noteId) {
		Note note = noteRepository.findById(noteId).orElseThrow(()-> new ResourceNotFoundException("noteId", "Note",noteId));
		note.setUserId(note.getUser().getUserId());
		return note;
	}

	@Override
	public void createNote(Note note) {		
		noteRepository.save(note);
	}

	@Override
	public void updateNote(Note updatedNote) {
		Note existingNote = noteRepository.findById(updatedNote.getNoteId()).
				orElseThrow(()-> new ResourceNotFoundException("noteId", "Note",updatedNote.getNoteId()));
		existingNote.setNoteId(updatedNote.getNoteId());
		existingNote.setTitle(updatedNote.getTitle());
		existingNote.setCreatTime(updatedNote.getCreatTime());
		existingNote.setLastUpdateTime(updatedNote.getLastUpdateTime());
		existingNote.setUser(userRepository.getOne(updatedNote.getUserId()));
		noteRepository.save(existingNote);
	}

	@Override
	public void deleteNoteById(Long noteId) {
		noteRepository.deleteById(noteId);
	}

	@Override
	public Note getNoteByTitle(String title) {
		Note note = noteRepository.getNoteByTitle(title);
		note.setUserId(note.getUser().getUserId());
		return note;
	}

	@Override
	public List<Note> getAllNote() {
		List<Note> noteList = noteRepository.findAll();
		noteList.forEach(note->{
			note.setUserId(note.getUser().getUserId());
		});
		return noteList;
	}
}
