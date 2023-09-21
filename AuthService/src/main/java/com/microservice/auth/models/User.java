package com.microservice.auth.models;

public class User {
    private UserLogin userLogin;
    private UserDetails userDetails;
    private EducationDetails educationDetails;

    public User() {
    }

    public User(UserLogin userLogin, UserDetails userDetails, EducationDetails educationDetails) {
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

    public EducationDetails getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(EducationDetails educationDetails) {
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
