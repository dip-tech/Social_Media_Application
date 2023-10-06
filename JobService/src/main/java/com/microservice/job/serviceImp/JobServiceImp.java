package com.microservice.job.serviceImp;

import com.microservice.job.models.JobDetails;
import com.microservice.job.repo.JobDetailsRepo;
import com.microservice.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobServiceImp implements JobService {
    @Autowired
    private JobDetailsRepo _jobDetailsRepo;
    @Override
    public String addJob(JobDetails _jobDetails) throws RuntimeException {
        if(_jobDetails.getUSER_ID()!=null){
            _jobDetailsRepo.save(_jobDetails);
            return "JOB DETAILS SAVED";
        }else{
            throw new RuntimeException("USER ID NOT FOUND");
        }


    }

    @Override
    public List<JobDetails> getJobDetailsByUserId(Long _userid) throws RuntimeException {
        if(_userid!=null){
            return _jobDetailsRepo.findJobDetailsByUserId(_userid);
        }else{
            throw new RuntimeException("USER ID IS NULL");
        }

    }

    @Override
    public List<JobDetails> getAllJobDetails() throws RuntimeException{
        return _jobDetailsRepo.findAll();
    }

    @Override
    public String deleteJobById(Long _id) throws RuntimeException {
        if(_id!=null){
                _jobDetailsRepo.deleteJobById(_id);
                return "JOB DELETED WITH "+_id;
        }else{
                throw new RuntimeException("JOB IS NULL");
        }

    }
}
