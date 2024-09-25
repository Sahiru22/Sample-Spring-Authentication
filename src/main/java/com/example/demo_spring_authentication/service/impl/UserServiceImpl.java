package com.example.demo_spring_authentication.service.impl;

import com.example.demo_spring_authentication.domain.User;
import com.example.demo_spring_authentication.dto.UserCreateRQ;
import com.example.demo_spring_authentication.repository.UserRepository;
import com.example.demo_spring_authentication.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserCreateRQ findUserByEmail(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        UserCreateRQ dto = new UserCreateRQ();
        dto.setEmail(user.getEmail());
        dto.setName(user.getName());
        dto.setProvider(user.getProvider());

        return dto;
    }
}

