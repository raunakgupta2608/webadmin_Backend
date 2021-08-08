package com.webadmin.webadmin.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String username);
}
