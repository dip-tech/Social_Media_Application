package com.microservice.auth.repo;

import com.microservice.auth.models.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepo extends JpaRepository<UserLogin,Long> {
}
