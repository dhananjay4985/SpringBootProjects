package user.note.usernotewithcloudoauth2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.note.usernotewithcloudoauth2.model.User;
import user.note.usernotewithcloudoauth2.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
		
	@GetMapping("/users/user/{userId}/{email}")
	public List<User> loadUserByEmailandId(@PathVariable("userId") Long userId,@PathVariable("email") String email){
		return userService.getAllUser(email,userId);
	}	
	@GetMapping("/users/user/{userId}")
	public Optional<User> getUserById(@PathVariable("userId") Long userId) {
		System.out.println("Inside get user by id impl");
		return userService.getUserById(userId);
	}	
	@PostMapping("/users/adduser")
	public void addNote(@RequestBody User user) {
		userService.createUser(user);
	}
}
