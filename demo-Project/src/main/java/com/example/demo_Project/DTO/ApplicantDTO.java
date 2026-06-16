package com.example.demo_Project.DTO;

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











}
