package com.microservice.user.services;

import com.microservice.user.models.EducationDetails;

public interface EducationService {
    public String addEducation(EducationDetails _educationDetails) throws Exception;
    public EducationDetails getEducationDetailsByUserId(Long _userId) throws Exception;
    public String updateEducationDetails(EducationDetails _updatedEducationDetails) throws Exception;
    public String deleteEducationDetails(EducationDetails _educationDetailsNeedToDelete) throws Exception;
}
