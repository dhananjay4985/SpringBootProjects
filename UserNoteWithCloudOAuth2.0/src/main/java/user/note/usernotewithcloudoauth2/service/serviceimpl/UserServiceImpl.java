package user.note.usernotewithcloudoauth2.service.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import user.note.usernotewithcloudoauth2.model.User;
import user.note.usernotewithcloudoauth2.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Override
	public User getUserById(Long UserId) {
		return null;
	}

	@Override
	public void createUser(User User) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User User) {
		
	}

	@Override
	public void deleteUserById(Long UserId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
