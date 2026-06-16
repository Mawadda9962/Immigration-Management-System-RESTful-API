package com.example.demo_Project.Service;

import com.example.demo_Project.Entities.ImmigrationCenter;
import com.example.demo_Project.Exceptions.Exceptions;
import com.example.demo_Project.Repositories.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CenterService {

    @Autowired
    CenterRepository centerRepository;


    public ImmigrationCenter createCenter(ImmigrationCenter center){
        if (center.getName() == null || center.getName().isBlank()){
            throw Exceptions.badRequest("Center name is required");
        }
        if (center.getLocationCountry() == null || center.getLocationCountry().isBlank()){
            throw Exceptions.badRequest("Location country is required");
        }
        if (center.getType() ==null || center.getType().isBlank()){
            throw Exceptions.badRequest("Center Type is ")
        }




    }


}
