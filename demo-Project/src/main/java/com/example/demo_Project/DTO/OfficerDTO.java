package com.example.demo_Project.DTO;

import com.example.demo_Project.Entities.ImmigrationOfficer;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OfficerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String badgeNumber;
    private String officerRank;
    private boolean active;

    public static OfficerDTO convertToDTO(ImmigrationOfficer officer){
        OfficerDTO dto = new OfficerDTO();
        dto.setId(officer.getId());
        dto.setFirstName(officer.getFirstName());
        dto.setLastName(officer.getLastName());
        dto.setBadgeNumber(officer.getBadgeNumber());
        dto.setOfficerRank(officer.getOfficerRank());
        dto.setActive(officer.isActive());
        return dto;

    }




}
