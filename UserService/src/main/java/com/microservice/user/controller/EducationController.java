package com.microservice.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.microservice.user.models.EducationDetails;
import com.microservice.user.serviceimp.EducationServiceImp;

@RestController
@RequestMapping("/education/v1")
public class EducationController {

    @Autowired
    private EducationServiceImp _educationService;
    
    @PostMapping("/add_education")
    public String doAddEducation(@RequestBody EducationDetails _educationDetails){
        try{
            _educationService.addEducation(_educationDetails);
            return "EDUCATION ADDED";
        }catch(Exception x){
            x.printStackTrace();
            return x.getMessage().toString();
        }
        
    }

    @GetMapping("/get_education_details_by_user/{userid}")
    public List<EducationDetails> doGetEducation(@PathVariable("userid") Long _userId){
        try{
            return _educationService.getEducationDetailsByUserId(_userId);
        }catch(Exception x){
            return null;
        }
    }

    @PutMapping("/update")
    public String doUpdateEducation(@RequestBody EducationDetails _updatedEducationdetails){
        try{
            return _educationService.updateEducationDetails(_updatedEducationdetails);
        }catch(Exception x){
            x.printStackTrace();
            return x.getMessage();
        }
    }
}
