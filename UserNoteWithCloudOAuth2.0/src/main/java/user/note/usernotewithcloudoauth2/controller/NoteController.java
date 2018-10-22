package user.note.usernotewithcloudoauth2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.note.usernotewithcloudoauth2.model.Note;
import user.note.usernotewithcloudoauth2.service.NoteService;

@RestController
public class NoteController {

	@Autowired
	private NoteService noteService;

	@GetMapping("/notes")
	public List<Note> getAllNotes(){
		return noteService.getAllNote();
	}
	@PutMapping("/notes/addnote")
	public void addNote(@RequestBody Note note) {
		noteService.createNote(note);
	}

	@GetMapping("/notes/noteid/{noteId}")
	public Note getNoteById(@PathVariable("noteId") Long noteId) {
		return noteService.getNoteById(noteId);
	}
	@GetMapping("/notes/note/notetitle/{title}")
	public Note getNoteByTitle(@PathVariable("title") String title) {
		return noteService.getNoteByTitle(title);
	}
}
