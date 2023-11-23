package com.microservice.user.controller;

import com.microservice.user.models.User;
import com.microservice.user.models.UserDetails;
import com.microservice.user.serviceimp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get_user_details/{userid}")
    public UserDetails getUserDetailsByUserId(@PathVariable("userid") Long user_id){
        try {
            return _userServiceImp.doGetUserDetailsByUserID(user_id);
        }catch (Exception x){
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

    @PutMapping("/update")
    public String updateUser(@RequestBody User _user){
        try{
            _userServiceImp.updateUserLogin(_user.getUserLogin());
            _userServiceImp.updateUserDetails(_user.getUserDetails());
            return "UPDATE SUCCESS";
        }catch(Exception x){
            return "EXCEPTION FOUND";
        }

    }
}
