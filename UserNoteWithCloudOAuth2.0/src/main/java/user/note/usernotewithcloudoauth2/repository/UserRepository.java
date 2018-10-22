package user.note.usernotewithcloudoauth2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import user.note.usernotewithcloudoauth2.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long>{
	@Query("SELECT u FROM User u WHERE u.email = :email and u.userId = :userId")
	List<User> loadUserByEmailandUserId(@Param("email")String email,@Param("userId") Long userId);
}
