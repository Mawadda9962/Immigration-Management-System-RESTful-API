package com.example.demo_Project.Controllers;

import com.example.demo_Project.DTO.InterviewDTO;
import com.example.demo_Project.Service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("interviews")
public class InterviewController {

    @Autowired
    InterviewService interviewService;

    @PostMapping("/schedule/{applicantId}/{officerId}")
    public ResponseEntity<InterviewDTO> scheduleInterview(@PathVariable Long applicantId, @PathVariable Long)
}
