package com.example.demo_Project.Controllers;

import com.example.demo_Project.DTO.ApplicantDTO;
import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("applicant")
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

   // @Autowired

    public ApplicantDTO registerApplicant(@RequestBody Applicant applicant){

    }



}
