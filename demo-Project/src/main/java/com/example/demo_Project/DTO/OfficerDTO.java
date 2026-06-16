package com.example.demo_Project.DTO;

import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Entities.ImmigrationOfficer;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class OfficerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String badgeNumber;
    private String officerRank;
    private boolean active;

    public static OfficerDTO convertToDTO(ImmigrationOfficer officer) {
        OfficerDTO dto = new OfficerDTO();
        dto.setId(officer.getId());
        dto.setFirstName(officer.getFirstName());
        dto.setLastName(officer.getLastName());
        dto.setBadgeNumber(officer.getBadgeNumber());
        dto.setOfficerRank(officer.getOfficerRank());
        dto.setActive(officer.isActive());
        return dto;
    }

    public static List<OfficerDTO> convertToDTO(List<ImmigrationOfficer> officers) {
        List<OfficerDTO> dtos = new ArrayList<>();
        for (ImmigrationOfficer officer : officers) {
            dtos.add(convertToDTO(officer));
        }
        return dtos;

    }
}
