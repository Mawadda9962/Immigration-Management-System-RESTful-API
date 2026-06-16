package com.example.demo_Project.Controllers;


import com.example.demo_Project.DTO.OfficerDTO;
import com.example.demo_Project.Entities.BorderControlOfficer;
import com.example.demo_Project.Entities.ImmigrationOfficer;
import com.example.demo_Project.Repositories.OfficerRepository;
import com.example.demo_Project.Service.OfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("officers")
public class OfficerController {

    @Autowired
    OfficerService officerService;

    @PostMapping
    public ResponseEntity<OfficerDTO> hireOfficer(@RequestBody ImmigrationOfficer officer){
        return ResponseEntity.ok(OfficerDTO.convertToDTO(officerService.saveOfficer(officer)));

    }

    @PostMapping("/{id}")
    public ResponseEntity<OfficerDTO> hireBorderOfficer(@RequestBody BorderControlOfficer officer) {
        return ResponseEntity.ok(OfficerDTO.convertToDTO(officerRepository.save(officer)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OfficerDTO> getOfficerById(@PathVariable Long id){
        return ResponseEntity.ok(OfficerDTO.convertToDTO(officerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Officer not found with id: " + id))));
    }

    @GetMapping
    public ResponseEntity<List<OfficerDTO>> getAllOfficers(){
        return ResponseEntity.ok(OfficerDTO.convertToDTO(officerService.fi))
    }

}
