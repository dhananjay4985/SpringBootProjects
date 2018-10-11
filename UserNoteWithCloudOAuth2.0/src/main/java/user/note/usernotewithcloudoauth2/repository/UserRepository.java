package user.note.usernotewithcloudoauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import user.note.usernotewithcloudoauth2.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
