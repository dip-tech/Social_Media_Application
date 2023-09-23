package com.microservice.auth.repo;

import com.microservice.auth.models.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserLoginRepo extends JpaRepository<UserLogin,Long> {
    @Query(value = "SELECT * FROM tbl_user_login WHERE email_id=?",nativeQuery = true)
    public UserLogin findUserByEmail(String _email);

    @Query(value = "SELECT * FROM tbl_user_login WHERE mobile_no=?",nativeQuery = true)
    public UserLogin findUserByMobileNo(String _mobileNo);
}
