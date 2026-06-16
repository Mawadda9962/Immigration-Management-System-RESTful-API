package com.example.demo_Project.Service;

import com.example.demo_Project.Entities.ImmigrationCenter;
import com.example.demo_Project.Repositories.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CenterService {

    @Autowired
    CenterRepository centerRepository;


    public ImmigrationCenter createCenter(ImmigrationCenter center){

    }


}
