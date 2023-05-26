package com.ganzymalgwi.repository;

import java.util.Optional;

import com.ganzymalgwi.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
