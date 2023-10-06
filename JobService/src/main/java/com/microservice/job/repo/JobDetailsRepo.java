package com.microservice.job.repo;

import com.microservice.job.models.JobDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface JobDetailsRepo extends JpaRepository<JobDetails,Long> {
    @Query(value="SELECT * FROM tbl_job_details WHERE user_id=?",nativeQuery = true)
    public List<JobDetails> findJobDetailsByUserId(Long _userid);

    @Modifying
    @Transactional
    @Query(value="UPDATE tbl_job_details SET is_active=false WHERE id=?", nativeQuery = true)
    public void deleteJobById(Long _id);
}
