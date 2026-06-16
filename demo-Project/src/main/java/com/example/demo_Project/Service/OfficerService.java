package com.example.demo_Project.Service;

import com.example.demo_Project.Entities.ImmigrationCenter;
import com.example.demo_Project.Entities.ImmigrationOfficer;
import com.example.demo_Project.Exceptions.Exceptions;
import com.example.demo_Project.Repositories.CenterRepository;
import com.example.demo_Project.Repositories.InterviewRepository;
import com.example.demo_Project.Repositories.OfficerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfficerService {

    @Override
    OfficerRepository officerRepository;

    @Override
    CenterRepository centerRepository;

    //Officer with clearance validation
    public ImmigrationOfficer promoteOfficer(Long officerId, String newOfficerRank, int newClearanceLevel1) {
        if (newClearanceLevel1 < 1 || newClearanceLevel1 > 5) { //Access Level of the officer
            throw Exceptions.badRequest("Clearance Level must be between 1 and 5");
        }
        ImmigrationOfficer officer = officerRepository.findById(officerId)
                .orElseThrow(() -> Exceptions.notFound("Officer not found with id: " + officerId));

        officer.setOfficerRank(newOfficerRank);
        officer.setClearanceLevel(newClearanceLevel1);
        return officerRepository.save(officer);
    }

    //Transfer officer to new center
    public ImmigrationOfficer transferOfficer(Long officerId, Long newCenterId) {
        ImmigrationOfficer officer = officerRepository.findById(officerId)
                .orElseThrow(() -> Exceptions.notFound("Officer not found with id: " + officerId));

        ImmigrationCenter center = centerRepository.findById(newCenterId)
                .orElseThrow(() -> Exceptions.notFound("Center not found with id: " + newCenterId));

        officer.setCenter(center);
        return officerRepository.save(officer);
    }

    //Find Officer by rank
    public List<ImmigrationOfficer> findOfficerByRank(String rank) {
        return officerRepository.findByOfficerRank(rank);
    }

    //Find Officer by Rank with minimum clearance level
    public List<ImmigrationOfficer> findOfficerByRank(String rank, int minimumClearanceLevel) {
        List<ImmigrationOfficer> officers = officerRepository.findByOfficerRank(rank);
        List<ImmigrationOfficer> result = new ArrayList<>();
        for (ImmigrationOfficer officer : officers) {
            if (officer.getClearanceLevel() >= minimumClearanceLevel) {
                result.add(officer);
            }
        }

        return result;
    }


}
