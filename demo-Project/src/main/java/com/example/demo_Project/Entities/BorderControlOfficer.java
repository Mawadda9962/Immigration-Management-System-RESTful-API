package com.example.demo_Project.Entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class BorderControlOfficer extends ImmigrationOfficer {

    private String assignedCheckpoint;
    private boolean k9UnitAssigned;
}
