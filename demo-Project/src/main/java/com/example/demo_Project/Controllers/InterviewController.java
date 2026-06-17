package com.example.demo_Project.Controllers;

import com.example.demo_Project.Service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/interviews")
public class InterviewController {

    @Autowired
    InterviewService interviewService;

    @
}
