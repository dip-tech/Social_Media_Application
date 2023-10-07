package com.microservice.job.service;

import com.microservice.job.models.JobDetails;

import java.util.List;

public interface JobService {
    public String addJob(JobDetails _jobDetails) throws RuntimeException;
    public List<JobDetails> getJobDetailsByUserId(Long _userid) throws RuntimeException;
    public List<JobDetails> getAllJobDetails() throws RuntimeException;
    public String updateJobDetails(JobDetails _jobDetails) throws RuntimeException;
    public String deleteJobById(Long _id) throws RuntimeException;
}
