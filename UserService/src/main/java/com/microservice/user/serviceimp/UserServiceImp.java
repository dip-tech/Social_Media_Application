package com.microservice.user.serviceimp;

import com.microservice.user.models.EducationDetails;
import com.microservice.user.models.User;
import com.microservice.user.models.UserDetails;
import com.microservice.user.models.UserLogin;
import com.microservice.user.repo.EducationDetailsRepo;
import com.microservice.user.repo.UserDetailsRepo;
import com.microservice.user.repo.UserLoginRepo;
import com.microservice.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserLoginRepo _userLoginRepo;
    @Autowired
    UserDetailsRepo _userDetailsRepo;
    @Autowired
    EducationDetailsRepo _educationDetailsRepo;
    @Override
    public User doGetUserByUsername(String _username) {
        UserLogin _userLogin;
        UserDetails _userDetails;
        ArrayList<EducationDetails> _educationDetails;
        if(_username.matches("[0-9]+")){
             _userLogin=_userLoginRepo.findUserLoginByMobileNo(_username);
        }
        else{
            _userLogin=_userLoginRepo.findUserLoginByEmail(_username);
        }
        _userLogin.setPASSWORD(null);
        _userDetails = _userDetailsRepo.findUserDetailsByUserId(_userLogin.getID());
        _educationDetails= _educationDetailsRepo.findEducationDetailsByUserId(_userDetails.getID());
        User _user=new User(_userLogin,_userDetails,_educationDetails);
        return _user;
    }

    @Override
    public List<User> doGetAllUser() {
        ArrayList<User> _userList=new ArrayList<User>();
        List<UserLogin> _userLoginList=_userLoginRepo.findAll();
        for(UserLogin _ul:_userLoginList){
            _userList.add(new User(_ul,_userDetailsRepo.findUserDetailsByUserId(_ul.getID()),_educationDetailsRepo.findEducationDetailsByUserId(_userDetailsRepo.findUserDetailsByUserId(_ul.getID()).getID())));
        }
        return _userList;
    }

    @Override
    public void updateUserLogin(UserLogin _userLogin) {
        if(_userLogin.getID()!=null){
            _userLoginRepo.save(_userLogin);
        }
    }


    @Override
    public void updateUserDetails(UserDetails _userDetails) {
        if(_userDetails.getID()!=null){
            _userDetailsRepo.save(_userDetails);
        }

    }

}
