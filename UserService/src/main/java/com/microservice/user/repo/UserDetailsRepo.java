package com.microservice.user.repo;

import com.microservice.user.models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDetailsRepo extends JpaRepository<UserDetails,Long> {
    @Query(value="SELECT * FROM tbl_user_details WHERE user_login_id=?", nativeQuery = true)
    public UserDetails findUserDetailsByUserId(Long _userId);
}
