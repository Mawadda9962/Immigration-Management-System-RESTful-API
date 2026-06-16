package com.example.demo_Project.Controllers;


import com.example.demo_Project.DTO.OfficerDTO;
import com.example.demo_Project.Repositories.OfficerRepository;
import com.example.demo_Project.Service.OfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("officers")
public class OfficerController {

    @Autowired
    OfficerService officerService;

    @Autowired
    OfficerRepository officerRepository;

    @PostMapping
    public ResponseEntity<OfficerDTO> hireOfficer()


}
