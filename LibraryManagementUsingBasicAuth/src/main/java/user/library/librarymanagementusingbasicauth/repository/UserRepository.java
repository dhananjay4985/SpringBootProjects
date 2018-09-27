package user.library.librarymanagementusingbasicauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import user.library.librarymanagementusingbasicauth.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	User findUserByEmail(String email);
}
