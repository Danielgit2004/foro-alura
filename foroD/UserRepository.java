package com.example.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.forum.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
