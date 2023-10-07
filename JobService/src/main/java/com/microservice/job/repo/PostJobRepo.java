package com.microservice.job.repo;

import com.microservice.job.models.PostJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PostJobRepo extends JpaRepository<PostJob,Long> {
    @Query(value="SELECT * FROM tbl_post_job_details WHERE post_name=?",nativeQuery = true)
    List<PostJob> findJobByPositionName(String _position);
    @Query(value="SELECT * FROM tbl_post_job_details WHERE company_name=?",nativeQuery = true)
    List<PostJob> findJobByCompanyName(String _company);
    @Modifying
    @Transactional
    @Query(value="UPDATE tbl_post_job_details SET is_active=false WHERE id=?",nativeQuery = true)
    void deleteJobById(Long _id);
}