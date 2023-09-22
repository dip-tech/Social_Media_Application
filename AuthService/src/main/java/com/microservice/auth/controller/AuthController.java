package com.microservice.auth.controller;

import com.microservice.auth.models.User;
import com.microservice.auth.models.UserLogin;
import com.microservice.auth.serviceimpl.AuthServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthServiceImp _authServiceImp;
    @PostMapping("/signup")
    public String signUp(@RequestBody User _newUser){
        return _authServiceImp.doSignUp(_newUser);
    }
    @PostMapping("/authenticate")
    public String logIn(UserLogin _userLogin){
        return "";
    }
}
