package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.model.User;


public interface UserRepository extends JpaRepository<User,Long> {
	
	User findOneByUsername(String username);

}