package com.microservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.user.models.EducationDetails;
import com.microservice.user.repo.EducationDetailsRepo;
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
}
