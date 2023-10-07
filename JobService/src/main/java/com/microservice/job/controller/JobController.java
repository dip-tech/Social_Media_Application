package com.microservice.job.controller;

import com.microservice.job.models.JobDetails;
import com.microservice.job.serviceImp.JobServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobServiceImp _jobService;

    @PostMapping("/add")
    public String addJob(@RequestBody JobDetails _jobDetails){
            try{
                _jobService.addJob(_jobDetails);
                return "JOB DETAILS ADDED";
            }catch(Exception x){
                return x.getMessage();
            }
        }
    @GetMapping("/get_job_by_user_id/{user_id}")
    public List<JobDetails> getJobByUserId(@PathVariable("user_id") Long _USER_ID){
        try {
            return _jobService.getJobDetailsByUserId(_USER_ID);
        }catch (Exception x){
            x.printStackTrace();
            return null;
        }
    }

    @GetMapping("/get_all_jobs")
    public List<JobDetails> getAllJobs(){
        try{
            return _jobService.getAllJobDetails();
        }catch(Exception x){
            x.printStackTrace();
            return null;
        }
    }
    @PutMapping("/update")
    public String updateJobDetails(@RequestBody JobDetails _jobDeatails){
        try{
            return _jobService.updateJobDetails(_jobDeatails);
        }catch(Exception x){
            return x.getMessage();
        }
    }
    @DeleteMapping("/delete/{job_id}")
    public String deleJobDetailsById(@PathVariable("job_id") Long _jobID){
        try{
            return _jobService.deleteJobById(_jobID);
        }catch(Exception x){
            return x.getMessage();
        }
    }
}
