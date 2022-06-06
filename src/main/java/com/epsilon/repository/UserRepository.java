package com.epsilon.repository;
import com.epsilon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email) throws Exception;

}
