package com.microservice.user.repo;

import com.microservice.user.models.EducationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EducationDetailsRepo extends JpaRepository<EducationDetails,Long> {

    @Query(value="SELECT * FROM tbl_education_details WHERE user_id=?",nativeQuery = true)
    public EducationDetails findEducationDetailsByUserId(Long _userId);
}
