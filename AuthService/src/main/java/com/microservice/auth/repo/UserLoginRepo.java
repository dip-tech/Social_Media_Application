package com.microservice.auth.repo;

import com.microservice.auth.models.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public interface UserLoginRepo extends JpaRepository<UserLogin,Long> {
    @Query(value = "SELECT * FROM tbl_user_login WHERE email_id=? AND is_active=true",nativeQuery = true)
    public UserLogin findUserByEmail(String _email);

    @Query(value = "SELECT * FROM tbl_user_login WHERE mobile_no=? AND is_active=true",nativeQuery = true)
    public UserLogin findUserByMobileNo(String _mobileNo);
    @Modifying
    @Transactional
    @Query(value="UPDATE tbl_user_login SET last_login=?2 WHERE email_id=?1",nativeQuery = true)
    public void updateLastLoginByUserEmail(String _email, Date _lastLogin);
    @Modifying
    @Transactional
    @Query(value="UPDATE tbl_user_login SET last_login=?2 WHERE mobile_no=?1",nativeQuery = true)
    public void updateLastLoginByUserMobileNo(String _mobileNo, Date _lastLogin);
}
