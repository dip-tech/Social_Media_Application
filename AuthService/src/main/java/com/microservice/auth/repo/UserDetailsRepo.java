package com.microservice.auth.repo;

import com.microservice.auth.models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDetailsRepo extends JpaRepository<UserDetails,Long> {
    @Query(value="SELECT * FROM tbl_user_details WHERE user_login_id=?",nativeQuery = true)
    public UserDetails findUserDetailsByUserLoginId(Long _userLogInId);
}
