package com.microservice.auth.models;

public class User {
    private UserLogin userLogin;
    private UserDetails userDetails;

    public User() {
    }

    public User(UserLogin userLogin, UserDetails userDetails) {
        this.userLogin = userLogin;
        this.userDetails = userDetails;
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

    @Override
    public String toString() {
        return "User{" +
                "userLogin=" + userLogin +
                ", userDetails=" + userDetails +
                '}';
    }
}
