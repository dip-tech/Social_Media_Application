package com.microservice.job.controller;
import com.microservice.job.models.PostJob;
import com.microservice.job.service.PostJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/job/post")
public class PostJobController {
    @Autowired
    PostJobService $POST_JOB_SERVICE;

    @PostMapping("/add")
    String postJob(@RequestBody PostJob $POSTJOB){
        try{
            return $POST_JOB_SERVICE.addJobPost($POSTJOB);
        }catch(Exception x){
            return x.getMessage();
        }
    }
    @GetMapping("/view/position/{POSITION}")
    List<PostJob> viewJobPostByPosition(@PathVariable("POSITION") String $POSITION){
        try {
            return  $POST_JOB_SERVICE.getJobPostByPositionName($POSITION);
        }catch(Exception x){
            x.printStackTrace();
            return null;
        }
    }

    @GetMapping("/view/company/{COMPANY}")
    List<PostJob> viewJobPostByCompany(@PathVariable("COMPANY") String $COMPANY){
        try {
            return  $POST_JOB_SERVICE.getJobPostByCompanyName($COMPANY);
        }catch(Exception x){
            x.printStackTrace();
            return null;
        }
    }
    @PutMapping("/update")
    String updatePostJobDetails(@RequestBody PostJob $POSTJOB){
        try{
            return $POST_JOB_SERVICE.updateJobPost($POSTJOB);
        }catch(Exception x){
            return x.getMessage();
        }
    }
    @DeleteMapping("/delete/{ID}")
    String deletePostJobById(@PathVariable("ID") Long $ID){
        try{
            return $POST_JOB_SERVICE.deleteJobPost($ID);
        }catch(Exception x){
            return x.getMessage();
        }
    }
}
