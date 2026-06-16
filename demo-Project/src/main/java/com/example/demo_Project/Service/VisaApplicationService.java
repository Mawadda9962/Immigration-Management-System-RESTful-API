package com.example.demo_Project.Service;

import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Entities.ImmigrationOfficer;
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
        return visaApplicationRepository.save(visa);
    }

    public VisaApplication assignOfficer(Long visaId, Long officerId){
        VisaApplication visa = visaApplicationRepository.findById(visaId)
                .orElseThrow(() -> Exceptions.notFound("Visa application not found with id: " + visaId));

        ImmigrationOfficer officer = officerRepository.findById(officerId)
                .orElseThrow(() -> Exceptions.notFound("Officer not found with id: " + officerId));

        if (visa.getVisaType().equals("Asylum")){
            if (officer.getClearanceLevel() != 4 && officer.getClearanceLevel() != 5){
                throw Exceptions.badRequest("Asylum visas require officer with clearance level 4 or 5");
            }
        }
        visa.setHandlingOfficer(officer);
        return visaApplicationRepository.save(visa);
    }

    //Process Visa
    public VisaApplication processVisa


}
