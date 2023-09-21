package com.microservice.auth.repo;

import com.microservice.auth.models.EducationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationDetailsRepo extends JpaRepository<EducationDetails,Long> {
}
