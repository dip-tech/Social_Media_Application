package com.microservice.user.controller;

import com.microservice.user.models.User;
import com.microservice.user.serviceimp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/v1")
public class UserController {
    @Autowired
    UserServiceImp _userServiceImp;
    @GetMapping("/get_user_by_username/{username}")
    public User getUserDetails(@PathVariable("username") String _username){
        User _user=null;
        try{
            _user=_userServiceImp.doGetUserByUsername(_username);
            return _user;
        }catch(Exception x){
            x.printStackTrace();
            return null;
        }
    }

    @GetMapping("/get_all_users")
    public List<User> getAllUsers(){
        try{
            return _userServiceImp.doGetAllUser();
        }catch(Exception x){
            return null;
        }

    }
}
