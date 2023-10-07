package com.microservice.job.serviceImp;

import com.microservice.job.models.PostJob;
import com.microservice.job.repo.PostJobRepo;
import com.microservice.job.service.PostJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostJobServiceImp implements PostJobService {
    @Autowired
    PostJobRepo POST_JOB_REPO;
    @Override
    public String addJobPost(PostJob _postJob) throws RuntimeException {
        if(_postJob.getUSER_ID()!=null){
            _postJob.setIS_ACTIVE(true);
            POST_JOB_REPO.save(_postJob);
            return "JOB POSTED SUCCESSFUL";
        }
        return "USER ID NULL";
    }

    @Override
    public List<PostJob> getJobPostByPositionName(String _Position) throws RuntimeException {
        if(_Position!=null){
            return POST_JOB_REPO.findJobByPositionName(_Position);
        }
        return null;
    }

    @Override
    public List<PostJob> getJobPostByCompanyName(String _Company) throws RuntimeException {
        if(_Company!=null){
            return POST_JOB_REPO.findJobByCompanyName(_Company);
        }
        return null;
    }

    @Override
    public String updateJobPost(PostJob _postJob) throws RuntimeException {
        if(_postJob.getID()!=null && _postJob.getUSER_ID()!=null){
            POST_JOB_REPO.save(_postJob);
            return "JOB POST UPDATED";
        }
        return "JOB ID OR USER ID NULL";
    }

    @Override
    public String deleteJobPost(Long _id) throws RuntimeException {
        if(_id!=null){
            POST_JOB_REPO.deleteJobById(_id);
            return "JOB POST DELETED";
        }
        return "POST JOB ID NOT FOUND";
    }
}
