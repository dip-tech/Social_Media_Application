package com.microservice.user.serviceimp;

import com.microservice.user.models.User;
import com.microservice.user.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Override
    public User doGetUserByUsername(String _username) {

        return null;
    }

    @Override
    public User doGetLoginUser(String _token) {
        return null;
    }

    @Override
    public List<User> doGetAllUser() {
        return null;
    }
}
