package com.example.demo_Project.Controllers;

import com.example.demo_Project.DTO.ApplicantDTO;
import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Entities.AsylumSeeker;
import com.example.demo_Project.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("applicant")
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

   @Autowired

    @PostMapping
    public ResponseEntity<ApplicantDTO> registerApplicant(@RequestBody Applicant applicant){
        return ResponseEntity.ok(ApplicantDTO.convertToDTO(applicantService.saveApplicant(applicant)));
    }

    @PostMapping("/asylum")
    public ResponseEntity<ApplicantDTO> registerAsylumSeeker(@RequestBody AsylumSeeker asylumSeeker) {
        return ResponseEntity.ok(ApplicantDTO.convertToDTO(applicantService.saveApplicant(asylumSeeker)));
    }




}
