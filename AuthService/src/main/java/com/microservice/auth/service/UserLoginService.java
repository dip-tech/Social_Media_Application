package com.microservice.auth.service;

import com.microservice.auth.models.User;
import com.microservice.auth.models.UserLogin;

public interface UserLoginService {
            public void doSignUp(User _newUser);
            public void doLogIn(UserLogin _userLogin);
}
