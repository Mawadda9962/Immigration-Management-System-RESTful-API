package com.example.demo_Project.Service;

import com.example.demo_Project.Repositories.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewService {

    @Autowired
    InterviewRepository interviewRepository;


}
