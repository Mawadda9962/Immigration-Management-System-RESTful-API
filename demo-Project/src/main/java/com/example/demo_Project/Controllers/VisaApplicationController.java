package com.example.demo_Project.Controllers;

import com.example.demo_Project.DTO.VisaApplicationDTO;
import com.example.demo_Project.Service.VisaApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visas")
public class VisaApplicationController {

    @Autowired
    VisaApplicationService visaApplicationService;

    @PostMapping("/submit/{applicantId}")
    public ResponseEntity<VisaApplicationDTO> submitApplication(@PathVariable Long applicantId, @RequestParam String type){
        return ResponseEntity.ok(VisaApplicationDTO.convertToDTO(visaApplicationService.submitApplication(applicantId,type)));
    }



    @PutMapping("/{visaId}/process")
    public ResponseEntity<VisaApplicationDTO> processVisa(@PathVariable Long visaId, @RequestParam String status, @RequestParam String notes){
        return ResponseEntity.ok(VisaApplicationDTO.convertToDTO(visaApplicationService.processVisa(visaId, status,notes)));
    }

    @GetMapping("/applicant/{applicantId}")
    public ResponseEntity<List<VisaApplicationDTO>>


}
