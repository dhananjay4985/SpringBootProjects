package user.note.usernotewithcloudoauth2.service;

import java.util.List;

import user.note.usernotewithcloudoauth2.model.User;


public interface UserService {

	User getUserById(Long UserId);
	void createUser(User User);
	void updateUser(User User);
	void deleteUserById(Long UserId);
	User getUserByTitle(String title);
	List<User> getAllUser();
}
