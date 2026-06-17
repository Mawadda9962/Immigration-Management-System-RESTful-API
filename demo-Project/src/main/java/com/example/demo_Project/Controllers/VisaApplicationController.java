package com.example.demo_Project.Controllers;

import com.example.demo_Project.DTO.VisaApplicationDTO;
import com.example.demo_Project.Service.VisaApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("visas")
public class VisaApplicationController {

    @Autowired
    VisaApplicationService visaApplicationService;

    @PostMapping("/submit/{applicantId}")
    public ResponseEntity<VisaApplicationDTO> submitApplication(@PathVariable Long applicantId, @RequestParam String type){

    }



}
