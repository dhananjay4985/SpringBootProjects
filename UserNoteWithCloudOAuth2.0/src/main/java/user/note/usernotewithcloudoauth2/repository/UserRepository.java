package user.note.usernotewithcloudoauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import user.note.usernotewithcloudoauth2.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
