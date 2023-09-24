package com.microservice.auth.service;

import com.microservice.auth.models.User;
import com.microservice.auth.models.UserLogin;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
            public String doSignUp(User _newUser);
            public String doLogIn(String _userLogin) throws Exception;
}
