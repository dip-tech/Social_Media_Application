package com.microservice.auth.security;

import com.microservice.auth.models.UserLogin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class UserLoginDetailsViaEmail implements UserDetails {

    private UserLogin _userLogin;

    public UserLoginDetailsViaEmail(UserLogin _userLogin){
        this._userLogin=_userLogin;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return _userLogin.getPASSWORD();
    }

    @Override
    public String getUsername() {
        return _userLogin.getEMAIL_ID();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
