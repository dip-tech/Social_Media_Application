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
            _educationDetails.setIS_ACTIVE(true);
            _educationDetailsRepo.save(_educationDetails);
            return "EDUCATION DETAILS ADDED SUCCESSFULLY";
        }else{
            return "USER ID NOT MATCHED";
        }

    }

    @Override
    public List<EducationDetails> getEducationDetailsByUserId(Long _userId) throws Exception {
        return _educationDetailsRepo.findEducationDetailsByUserId(_userId);
    }

    @Override
    public String updateEducationDetails(EducationDetails _updatedEducationDetails) throws Exception {
        if(_updatedEducationDetails.getID()!=null && _updatedEducationDetails.getUSER_ID()!=null){
            _educationDetailsRepo.save(_updatedEducationDetails);
            return "EDUCATION SUCCESSFULLY UPDATED";
        }
        return "EDUCATION ID or USER ID MISSING";
    }

    @Override
    public String deleteEducationDetails(Long _educationDetailsIdNeedToDelete) throws Exception {
        if(_educationDetailsIdNeedToDelete!=null){
            _educationDetailsRepo.deleteEducationDetailsById(_educationDetailsIdNeedToDelete);
            return "EDUCATION DETAILS DELETED";
        }
        return "EDUCATION DETAILS DO NOT HAVE ID";
    }
}
