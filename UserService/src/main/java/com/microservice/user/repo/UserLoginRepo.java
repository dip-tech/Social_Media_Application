package com.microservice.user.repo;

import com.microservice.user.models.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserLoginRepo extends JpaRepository<UserLogin,Long> {
    @Query(value="SELECT * FROM tbl_user_login WHERE email_id=? AND is_active=true",nativeQuery = true)
    public UserLogin findUserLoginByEmail(String _email);
    @Query(value="SELECT * FROM tbl_user_login WHERE mobile_no=? AND is_active=true",nativeQuery = true)
    public UserLogin findUserLoginByMobileNo(String _mobile);
}
