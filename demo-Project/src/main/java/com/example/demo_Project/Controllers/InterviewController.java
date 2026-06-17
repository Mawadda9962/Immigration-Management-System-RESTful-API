package com.example.demo_Project.Controllers;

import com.example.demo_Project.DTO.InterviewDTO;
import com.example.demo_Project.Service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("interviews")
public class InterviewController {

    @Autowired
    InterviewService interviewService;

    @PostMapping("/schedule/{applicantId}/{officerId}")
    public ResponseEntity<InterviewDTO> scheduleInterview(@PathVariable Long applicantId, @PathVariable Long officerId, @RequestParam String date){

        return
    }
}
