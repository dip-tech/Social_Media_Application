package com.microservice.user.models;

import java.util.ArrayList;

public class User {
    private UserLogin userLogin;
    private UserDetails userDetails;
    private ArrayList<EducationDetails> educationDetails;

    public User() {
    }

    public User(UserLogin userLogin, UserDetails userDetails, ArrayList<EducationDetails> educationDetails) {
        this.userLogin = userLogin;
        this.userDetails = userDetails;
        this.educationDetails = educationDetails;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public ArrayList<EducationDetails> getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(ArrayList<EducationDetails> educationDetails) {
        this.educationDetails = educationDetails;
    }

    @Override
    public String toString() {
        return "User{" +
                "userLogin=" + userLogin +
                ", userDetails=" + userDetails +
                ", educationDetails=" + educationDetails +
                '}';
    }
}
