package com.example.demo_spring_authentication.service;

import com.example.demo_spring_authentication.dto.UserCreateRQ;

public interface UserService {

    UserCreateRQ findUserByEmail(String email);
}
