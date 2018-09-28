package user.library.librarymanagementusingbasicauth.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.library.librarymanagementusingbasicauth.model.User;
import user.library.librarymanagementusingbasicauth.repository.UserRepository;
import user.library.librarymanagementusingbasicauth.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public boolean userLogin(String email, String password) {
		boolean login = false;
		User user = userRepository.findUserByEmail(email);
		if(null!=user) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				login = true;
			}
		}
		return login;
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
	
}
