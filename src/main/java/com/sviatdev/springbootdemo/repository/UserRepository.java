package com.sviatdev.springbootdemo.repository;

import com.sviatdev.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
