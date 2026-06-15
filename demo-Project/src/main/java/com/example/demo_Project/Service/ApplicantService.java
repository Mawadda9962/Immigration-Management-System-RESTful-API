package com.example.demo_Project.Service;


import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Repositories.ApplicantRepository;
import com.example.demo_Project.Repositories.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    @Autowired
    ApplicantRepository applicantRepository;

    @Autowired
    InterviewRepository interviewRepository;

public Applicant saveApplicant(Applicant applicant){
    if (applicant.getPassportNumber() == null || applicant.getPassportNumber().isEmpty()){
        throw new RuntimeException("Passport number is required");
    }
}



}
