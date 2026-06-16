package com.example.demo_Project.Service;

import com.example.demo_Project.Entities.ImmigrationCenter;
import com.example.demo_Project.Entities.ImmigrationOfficer;
import com.example.demo_Project.Exceptions.Exceptions;
import com.example.demo_Project.Repositories.CenterRepository;
import com.example.demo_Project.Repositories.InterviewRepository;
import com.example.demo_Project.Repositories.OfficerRepository;
import org.springframework.stereotype.Service;

@Service
public class OfficerService {

    @Override
    OfficerRepository officerRepository;

    @Override
    CenterRepository centerRepository;

    public ImmigrationOfficer promoteOfficer(Long officerId, String newOfficerRank, int newClearanceLevel1){
        if (newClearanceLevel1 < 1 || newClearanceLevel1 > 5){ //Access Level of the officer
            throw Exceptions.badRequest("Clearance Level must be between 1 and 5");
        }
        ImmigrationOfficer officer = officerRepository.findById(officerId)
                .orElseThrow(() -> Exceptions.notFound("Officer not found with id: " + officerId));

        officer.setOfficerRank(newOfficerRank);
        officer.setClearanceLevel(newClearanceLevel1);
        return officerRepository.save(officer);
    }

    public ImmigrationOfficer transferOfficer(Long officerId, Long newCenterId){
        ImmigrationOfficer officer = officerRepository.findById(officerId)
                .orElseThrow(() -> Exceptions.notFound("Officer not found with id: " + officerId));

        ImmigrationCenter center = centerRepository.findById(newCenterId)
                .orElseThrow(() -> Exceptions.notFound("Center not found with id: " + newCenterId));

        officer.setCenter(center);
        return officerRepository.save(officer);


    }





}
