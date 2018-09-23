package user.note.usernotewithcloudoauth2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.note.usernotewithcloudoauth2.model.Note;
import user.note.usernotewithcloudoauth2.service.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {

	private NoteService noteService;

	@PutMapping("/addnote")
	public void addNote(@RequestBody Note note) {
		noteService.createNote(note);
	}

	@GetMapping("/note/{noteId}")
	public Note getNoteById(@PathVariable("noteId") Long noteId) {
		return noteService.getNoteById(noteId);
	}

	@GetMapping("/note/{title}")
	public Note getNoteByTitle(@PathVariable("title") String title) {
		return noteService.getNoteByTitle(title);
	}

	@GetMapping
	public List<Note> getAllNotes(){
		return noteService.getAllNote();
	}
	
	
}
