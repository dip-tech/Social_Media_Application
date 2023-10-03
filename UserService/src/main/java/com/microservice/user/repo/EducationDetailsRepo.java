package com.microservice.user.repo;

import com.microservice.user.models.EducationDetails;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface EducationDetailsRepo extends JpaRepository<EducationDetails,Long> {

    @Query(value="SELECT * FROM tbl_education_details WHERE user_id=? AND is_active=true",nativeQuery = true)
    public ArrayList<EducationDetails> findEducationDetailsByUserId(Long _userId);

    @Modifying
    @Transactional
    @Query(value="UPDATE tbl_education_details SET is_active=false WHERE id=?",nativeQuery = true )
    public void deleteEducationDetailsById(Long _id);
}
