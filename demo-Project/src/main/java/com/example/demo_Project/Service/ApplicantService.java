package com.example.demo_Project.Service;


import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Exceptions.SystemExceptions;
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


public Applicant saveApplicant(Applicant applicant) {
    if (applicant.getPassportNumber() == null || applicant.getPassportNumber().isEmpty()) {
        throw new SystemExceptions("Error:Passport number is required");
    }
    if (applicant.getFirstName() == null || applicant.getFirstName().isEmpty()) {
        throw new SystemExceptions("Error:first name is required");
    }
    if (applicant.getLastName() == null || applicant.getLastName().isEmpty()) {
        throw new SystemExceptions("Error:Last name is required");
    }
    return applicantRepository.save(applicant);
}



}
