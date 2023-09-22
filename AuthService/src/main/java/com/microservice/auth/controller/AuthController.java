package com.microservice.auth.controller;

import com.microservice.auth.models.User;
import com.microservice.auth.serviceimpl.AuthServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthServiceImp _authServiceImp;
    @GetMapping("/signup")
    public String signUp(@RequestBody User _newUser){
        return _authServiceImp.doSignUp(_newUser);
    }
}
