package com.example.demo_spring_authentication.repository;

import com.example.demo_spring_authentication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);}
