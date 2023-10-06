package com.microservice.job.service;

import com.microservice.job.models.JobDetails;

import java.util.List;

public interface JobService {
    public String addJob(JobDetails _jobDetails);
    public List<JobDetails> getJobDetailsByUserId(String _userid);
    public List<JobDetails> getAllJobDetails();
    public String deleteJobById(Long _id);
}
