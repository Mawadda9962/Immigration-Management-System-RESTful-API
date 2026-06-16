package com.example.demo_Project.Service;

import com.example.demo_Project.Entities.ImmigrationOfficer;
import com.example.demo_Project.Exceptions.Exceptions;
import com.example.demo_Project.Repositories.CenterRepository;
import com.example.demo_Project.Repositories.InterviewRepository;
import org.springframework.stereotype.Service;

@Service
public class OfficerService {

    @Override
    OfficerService officerService;

    @Override
    CenterRepository centerRepository;

    public ImmigrationOfficer promoteOfficer(Long officerId, String newOfficerRank, int newClearanceLevel1){
        if (newClearanceLevel1 < 1 || newClearanceLevel1 > 5){
            throw Exceptions.badRequest("Clearance Level must be between 1 and 5");

        }
    }





}
