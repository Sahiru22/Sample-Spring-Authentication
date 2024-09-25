package com.example.demo_spring_authentication.dto;

import lombok.Data;

@Data
public class UserCreateRQ {

    private String name;

    private String email;

    private String password;

    private String provider;
}
