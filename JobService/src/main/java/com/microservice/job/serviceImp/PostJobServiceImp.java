package com.microservice.job.serviceImp;

import com.microservice.job.models.PostJob;
import com.microservice.job.service.PostJobService;

import java.util.List;

public class PostJobServiceImp implements PostJobService {
    @Override
    public String addJobPost(PostJob _postJob) throws RuntimeException {
        return null;
    }

    @Override
    public List<PostJob> getJobPostByPositionName(String _Position) throws RuntimeException {
        return null;
    }

    @Override
    public List<PostJob> getJobPostByCompanyName(String _Company) throws RuntimeException {
        return null;
    }

    @Override
    public String updateJobPost(PostJob _postJob) throws RuntimeException {
        return null;
    }

    @Override
    public String deleteJobPost(Long _id) throws RuntimeException {
        return null;
    }
}
