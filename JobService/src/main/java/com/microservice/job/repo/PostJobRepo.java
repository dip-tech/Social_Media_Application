package com.microservice.job.repo;

import com.microservice.job.models.PostJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJobRepo extends JpaRepository<PostJob,Long> {
}
