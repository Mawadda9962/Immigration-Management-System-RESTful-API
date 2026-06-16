package com.example.demo_Project.DTO;

import com.example.demo_Project.Entities.Applicant;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.SpringVersion;

@Data
@NoArgsConstructor
public class ApplicantDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String nationality;
    private String passportNumber;
    private boolean criminalRecorde;

   public static ApplicantDTO convertToDTO(Applicant applicant){
       ApplicantDTO dto = new ApplicantDTO();

       dto.setId(applicant.getId());
       dto.setFirstName(applicant.getFirstName());
       dto.setLastName(applicant.getLastName());
       dto.setNationality(applicant.getNationality());
       dto.setPassportNumber(applicant.getPassportNumber());
       dto.setCriminalRecorde(applicant.isCriminalRecorde());
       return dto;
   }

   public










}
