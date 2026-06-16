package com.example.demo_Project.Controllers;

import com.example.demo_Project.DTO.CenterDTO;
import com.example.demo_Project.Entities.ImmigrationCenter;
import com.example.demo_Project.Service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("centers")
public class CenterController {

    @Autowired
    CenterService centerService;


    @PostMapping
    public CenterDTO addCenter(@RequestBody ImmigrationCenter center){
        return CenterDTO.convertToDTO(centerService.createCenter(center));
    }



}
