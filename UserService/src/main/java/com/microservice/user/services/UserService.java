package com.microservice.user.services;

import com.microservice.user.models.User;

import java.util.List;

public interface UserService {
    public User doGetUserByUsername(String _username);
    public User doGetLoginUser(String _token);
    public List<User> doGetAllUser();
}
