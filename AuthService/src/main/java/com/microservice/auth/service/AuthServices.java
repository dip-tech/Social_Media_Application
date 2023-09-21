package com.microservice.auth.service;

import com.microservice.auth.models.User;
import com.microservice.auth.models.UserLogin;

public interface AuthServices {
    public void signUP(User _newUser);
    public void logIN(UserLogin _userLogin);
}
