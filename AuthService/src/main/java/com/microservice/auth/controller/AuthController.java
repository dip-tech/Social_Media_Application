package com.microservice.auth.controller;

import com.microservice.auth.models.User;
import com.microservice.auth.serviceimpl.AuthServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth/v1")
public class AuthController {

    @Autowired
    AuthServiceImp _authServiceImp;
    @PostMapping("/signup")
    public String signUp(@RequestBody User _newUser){
        return _authServiceImp.doSignUp(_newUser);
    }
    @PostMapping(value = "/authenticate",produces = "application/json")
    public String logIn(@RequestBody String _userLogin){
        try{
            return _authServiceImp.doLogIn(_userLogin);
        }catch(Exception x){
            x.printStackTrace();
            return "AUTHENTICATION FAILED";
        }
    }

    @PostMapping("/check/token/{token}")
    public Boolean checkToken(@PathVariable("token") String _token){
        try{
            return _authServiceImp.doValidateToken(_token);
        }catch(Exception x){
            x.printStackTrace();
            return false;
        }
    }
}
