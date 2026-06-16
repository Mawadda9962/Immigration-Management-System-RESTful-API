package com.example.demo_Project.Controllers;

import com.example.demo_Project.DTO.CenterDTO;
import com.example.demo_Project.Entities.ImmigrationCenter;
import com.example.demo_Project.Service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("centers")
public class CenterController {

    @Autowired
    CenterService centerService;


    @PostMapping
    public ResponseEntity<CenterDTO> addCenter(@RequestBody ImmigrationCenter center){
        return ResponseEntity.ok(CenterDTO.convertToDTO(centerService.createCenter(center)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CenterDTO> getCenterById(@PathVariable Long id){
        return ResponseEntity.ok(CenterDTO.convertToDTO(centerService.getCenterByID(id)));
    }
}
