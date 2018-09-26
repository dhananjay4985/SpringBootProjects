package com.spring.angular.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.angular.model.User;
import com.spring.angular.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/user-portal")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	

	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		System.out.println("User info :"+user.toString());
		return userRepository.save(user);
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable(value="id") Integer id) {
		return userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException());
	}
	
	/*@PutMapping("/notes/{id}")
	public Note updateNote(@PathVariable(value="id") Long noteId,@Valid @RequestBody Note noteDetails) {
		
		Note note = noteRepository.findById(noteId).orElseThrow(()-> new ResourceNotFoundException());
		
		note.setTitle(noteDetails.getTitle());
		note.setContent(noteDetails.getContent());
		note.setAuthor(noteDetails.getAuthor());
		
		Note updateNote = noteRepository.save(note);		
		return updateNote;
	}*/
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable (value="id") int id){
		System.out.println("inside delete user"+id);
		User user = userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException());
		userRepository.delete(user);
		return ResponseEntity.ok().build();
	}
	
}
