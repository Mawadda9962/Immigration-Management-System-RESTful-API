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
    private String rank;
    private int clearanceLevel;
    private boolean active;

    public static OfficerDTO convertToDTO(ImmigrationOfficer officer){
        OfficerDTO dto = new OfficerDTO();
        dto.setId(officer.getId());
        dto.
    }




}
