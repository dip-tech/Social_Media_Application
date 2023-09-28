package com.microservice.user.serviceimp;

import com.microservice.user.models.EducationDetails;
import com.microservice.user.repo.EducationDetailsRepo;
import com.microservice.user.repo.UserDetailsRepo;
import com.microservice.user.services.EducationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EducationServiceImp implements EducationService {
    @Autowired
    EducationDetailsRepo _educationDetailsRepo;
    @Autowired
    UserDetailsRepo _userDetailsRepo;

    @Override
    public String addEducation(EducationDetails _educationDetails) throws Exception {
        if (_userDetailsRepo.findById(_educationDetails.getUSER_ID()).isPresent()) {
            _educationDetailsRepo.save(_educationDetails);
            return "EDUCATION DETAILS ADDED SUCCESSFULLY";
        }else{
            return "USER ID NOT MATCHED";
        }

    }

    @Override
    public List<EducationDetails> getEducationDetailsByUserId(Long _userId) throws Exception {
        return null;
    }

    @Override
    public String updateEducationDetails(EducationDetails _updatedEducationDetails) throws Exception {
        return null;
    }

    @Override
    public String deleteEducationDetails(EducationDetails _educationDetailsNeedToDelete) throws Exception {
        return null;
    }
}
