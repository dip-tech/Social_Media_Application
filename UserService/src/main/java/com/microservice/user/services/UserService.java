package com.microservice.user.services;

import com.microservice.user.models.User;
import com.microservice.user.models.UserDetails;
import com.microservice.user.models.UserLogin;

import java.util.List;

public interface UserService {
    public User doGetUserByUsername(String _username);
    public UserDetails doGetUserDetailsByUserID(Long user_id);
    public List<User> doGetAllUser();

    public void updateUserLogin(UserLogin _userLogin);
    public void updateUserDetails(UserDetails _userDetails);
}
