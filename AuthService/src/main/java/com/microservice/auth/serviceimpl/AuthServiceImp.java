package com.microservice.auth.serviceimpl;

import com.microservice.auth.models.User;
import com.microservice.auth.models.UserDetails;
import com.microservice.auth.models.UserLogin;
import com.microservice.auth.repo.UserDetailsRepo;
import com.microservice.auth.repo.UserLoginRepo;
import com.microservice.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AuthServiceImp implements AuthService {
    @Autowired
    UserLoginRepo _userLoginRepo;
    @Autowired
    UserDetailsRepo _userDetailsRepo;
    @Override
    public String doSignUp(User _newUser) {
        UserLogin _userLogin= _newUser.getUserLogin();
        _userLogin.setCREATED_AT(new Date());
        Long _userLoginId=_userLoginRepo.save(_userLogin).getID();
        UserDetails _userDetails= _newUser.getUserDetails();
        _userDetails.setUSER_LOGIN_ID(_userLoginId);
        _userDetailsRepo.save(_userDetails);
        return "USER CREATED";
    }

    @Override
    public void doLogIn(UserLogin _userLogin) {

    }
}
