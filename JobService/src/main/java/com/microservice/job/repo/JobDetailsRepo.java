package com.microservice.job.repo;

import com.microservice.job.models.JobDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDetailsRepo extends JpaRepository<JobDetails,Long> {
}
