package com.example.demo_Project.Entities;

import jakarta.persistence.Entity;

@Entity
public class BorderControlOfficer extends ImmigrationOfficer {

    private String assignedCheckpoint;
    private boolean k9UnitAssigned;
}
