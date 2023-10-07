package com.microservice.job.service;

import com.microservice.job.models.JobDetails;

import java.util.List;

public interface JobService {
    String addJob(JobDetails _jobDetails) throws RuntimeException;
    List<JobDetails> getJobDetailsByUserId(Long _userid) throws RuntimeException;
    List<JobDetails> getAllJobDetails() throws RuntimeException;
    String updateJobDetails(JobDetails _jobDetails) throws RuntimeException;
    String deleteJobById(Long _id) throws RuntimeException;
}
