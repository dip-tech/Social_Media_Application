package com.microservice.auth.serviceimpl;

import com.microservice.auth.jwt.JwtUtills;
import com.microservice.auth.models.User;
import com.microservice.auth.models.UserDetails;
import com.microservice.auth.models.UserLogin;
import com.microservice.auth.repo.UserDetailsRepo;
import com.microservice.auth.repo.UserLoginRepo;
import com.microservice.auth.security.UserLoginDetailsService;
import com.microservice.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class AuthServiceImp implements AuthService {
    @Autowired
    UserLoginRepo _userLoginRepo;
    @Autowired
    UserDetailsRepo _userDetailsRepo;
    @Autowired
    AuthenticationManager _authenticationManager;
    @Autowired
    UserLoginDetailsService _userLoginDetailsService;
    @Autowired
    JwtUtills _jwtUtils;

    @Override
    public String doSignUp(User _newUser) {
        UserLogin _userLogin= _newUser.getUserLogin();
        try{
            if(_userLoginRepo.findUserByEmail(_userLogin.getEMAIL_ID())!=null){
                return "EMAIL ALREADY EXIST";
            }else if(_userLoginRepo.findUserByMobileNo(_userLogin.getMOBILE_NO())!=null){
                return "MOBILE NO ALREADY EXIST";
            }
            else{
                BCryptPasswordEncoder _bcryptPasswordEncoder=new BCryptPasswordEncoder();

                _userLogin.setPASSWORD(_bcryptPasswordEncoder.encode(_userLogin.getPASSWORD()));
                _userLogin.setCREATED_AT(new Date());
                Long _userLoginId=_userLoginRepo.save(_userLogin).getID();
                UserDetails _userDetails= _newUser.getUserDetails();
                _userDetails.setUSER_LOGIN_ID(_userLoginId);
                _userDetailsRepo.save(_userDetails);
                return "USER CREATED";
            }
        }catch(Exception x){
            x.printStackTrace();
            return x.getMessage();
        }

    }

    @Override
    public String doLogIn(String _userLogin)throws Exception {
        String TOKEN="";
        JSONObject _jsonObject=new JSONObject(_userLogin);
        Authentication _authentication=_authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(_jsonObject.get("user_NAME"),_jsonObject.get("password")));
        if(_authentication!=null){
            org.springframework.security.core.userdetails.UserDetails _userDetails=_userLoginDetailsService.loadUserByUsername(_jsonObject.get("user_NAME").toString());
            TOKEN= _jwtUtils.generateJwtToken(_userDetails);
            return TOKEN;
        }
        return null;
    }
}
