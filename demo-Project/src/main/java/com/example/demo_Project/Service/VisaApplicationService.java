package com.example.demo_Project.Service;

import com.example.demo_Project.Entities.VisaApplication;
import com.example.demo_Project.Repositories.ApplicantRepository;
import com.example.demo_Project.Repositories.OfficerRepository;
import com.example.demo_Project.Repositories.VisaApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisaApplicationService {

    @Autowired
    VisaApplicationRepository visaApplicationRepository;

    @Autowired
    ApplicantRepository applicantRepository;

    @Autowired
    OfficerRepository officerRepository;

    public VisaApplication submitApplication(Long applicantId, String visaType){

    }


}
