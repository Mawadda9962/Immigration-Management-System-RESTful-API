package com.example.demo_Project.Service;

import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Entities.VisaApplication;
import com.example.demo_Project.Exceptions.Exceptions;
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
        Applicant applicant = applicantRepository.findById(applicantId)
                .orElseThrow(() -> Exceptions.notFound("Applicant not found with id: " + applicantId));

        VisaApplication visa = new VisaApplication();
        visa.setApplicant(applicant);
        visa.setVisaType(visaType);

        if (applicant.isCriminalRecorde()){
            visa.setStatus("REJECTED");
            visa.setVisaType("Auto-rejected due to criminal flag");
        }else {
            visa.setStatus("PENDING");
        }
        return visaApplicationRepository.save(visa)

    }


}
