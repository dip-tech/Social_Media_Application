package com.microservice.job.service;

import com.microservice.job.models.PostJob;

import java.util.List;

public interface PostJobService {
    String addJobPost(PostJob _postJob) throws RuntimeException;
    List<PostJob> getJobPostByPositionName(String _Position) throws RuntimeException;
    List<PostJob> getJobPostByCompanyName(String _Company) throws RuntimeException;
    String updateJobPost(PostJob _postJob) throws RuntimeException;
    String deleteJobPost(Long _id) throws RuntimeException;
}
