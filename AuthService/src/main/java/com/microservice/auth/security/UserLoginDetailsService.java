package com.microservice.auth.security;

import com.microservice.auth.models.UserLogin;
import com.microservice.auth.repo.UserLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserLoginDetailsService implements UserDetailsService {

    @Autowired
    UserLoginRepo _userLoginRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserLogin _userLogin;
        if(username.matches("[0-9]+")){
           _userLogin=_userLoginRepo.findUserByMobileNo(username);
           return new UserLoginDetailsViaPhone(_userLogin);
        }else{
            _userLogin=_userLoginRepo.findUserByEmail(username);
            return  new UserLoginDetailsViaEmail(_userLogin);
        }
    }
}
