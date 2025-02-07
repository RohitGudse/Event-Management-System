package com.learn.EventManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.EventManagementSystem.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
