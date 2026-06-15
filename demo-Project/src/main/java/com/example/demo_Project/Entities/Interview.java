package com.example.demo_Project.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Applicant applicant;

    @ManyToOne
    private ImmigrationOfficer officer;

    private String interviewDate;
    private String status;
    private String purpose;
}
