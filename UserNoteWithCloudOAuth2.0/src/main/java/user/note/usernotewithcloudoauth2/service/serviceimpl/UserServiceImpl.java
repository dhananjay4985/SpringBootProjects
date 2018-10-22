package user.note.usernotewithcloudoauth2.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.note.usernotewithcloudoauth2.exception.ResourceNotFoundException;
import user.note.usernotewithcloudoauth2.model.User;
import user.note.usernotewithcloudoauth2.repository.UserRepository;
import user.note.usernotewithcloudoauth2.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	@Resource
	private UserRepository userRepository;

	@Override
	public Optional<User> getUserById(Long userId) {
		Optional<User> optionalUser = userRepository.findById(userId);
		if(!optionalUser.isPresent()) {
			logger.info("User is not present in DB");
		}
		return optionalUser;
	}

	@Override
	public void createUser(User user) {
		logger.info("Adding user :"+user.toString());
		userRepository.save(user);
	}

	@Override
	public void updateUser(User updatedUser) {
		User oldUser = userRepository.findById(updatedUser.getUserId())
				.orElseThrow(()-> new ResourceNotFoundException("userId", "User",updatedUser.getUserId()));
		logger.info("Old User:"+oldUser.toString());
		oldUser.setUserId(updatedUser.getUserId());
		oldUser.setEmail(updatedUser.getEmail());
		oldUser.setPassword(updatedUser.getPassword());
		oldUser.setCreateTime(updatedUser.getCreateTime());
		oldUser.setLastUpdateTime(updatedUser.getLastUpdateTime());
		oldUser.setNoteList(updatedUser.getNoteList());
		userRepository.save(oldUser);
	}

	@Override
	public void deleteUserById(Long UserId) {

	}

	@Override
	public User getUserByTitle(String title) {
		return null;
	}

	@Override
	public List<User> getAllUser(String email,Long userId) {
		logger.info(":finding user by email & userId:");
		logger.info("Email: "+email +"UserId: "+userId);
		List<User> userList = userRepository.loadUserByEmailandUserId(email, userId);
		
		userList.forEach(user-> {
			user.getNoteList().forEach(note->{
				note.setUserId(user.getUserId());//note.setUser(userRepository.getOne(user.getUserId()));
			});
		});
		return userList;
	}

}
