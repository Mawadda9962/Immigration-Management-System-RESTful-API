package Entities;

import jakarta.persistence.Entity;

@Entity
public class BorderControlOfficer extends ImmigrationOfficer {

    private String assignedCheckpoint;
}
