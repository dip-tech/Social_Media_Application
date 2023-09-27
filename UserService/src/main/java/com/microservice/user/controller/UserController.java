package com.microservice.user.controller;

import com.microservice.user.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/v1")
public class UserController {
    public User getUserDetails(){
        return null;
    }
}
