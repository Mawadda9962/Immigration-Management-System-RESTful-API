package com.example.demo_Project.Service;

import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Entities.ImmigrationOfficer;
import com.example.demo_Project.Entities.Interview;
import com.example.demo_Project.Exceptions.Exceptions;
import com.example.demo_Project.Repositories.ApplicantRepository;
import com.example.demo_Project.Repositories.InterviewRepository;
import com.example.demo_Project.Repositories.OfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {

    @Autowired
    InterviewRepository interviewRepository;

    @Autowired
    ApplicantRepository applicantRepository;

    @Autowired
    OfficerRepository officerRepository;

    public Interview scheduleInterview(Long applicantId, Long officerId, String date){
        Applicant applicant = applicantRepository.findById(applicantId)
                .orElseThrow(() -> Exceptions.notFound("Applicant not found with id: " + applicantId));

        ImmigrationOfficer officer = officerRepository.findById(officerId)
                .orElseThrow(() -> Exceptions.notFound("Officer not found with id: " + officerId));


        List<Interview> existing = interviewRepository.findByOfficerIdAndInterviewDate(officerId,date){
            if (!existing.isEmpty()){
                throw Exceptions.badRequest("Officer is booked!");
            }

            Interview interview = new Interview();
            interview.setApplicant(applicant);
            interview.setOfficer(officer);
            interview.setInterviewDate(date);
            interview.setStatus("SCHEDULED");

            return interviewRepository.save(interview);
        }
    }

    public Interview cancelInterview(Long interviewId) {



    }
