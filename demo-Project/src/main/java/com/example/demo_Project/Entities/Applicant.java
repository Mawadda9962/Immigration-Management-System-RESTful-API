package com.example.demo_Project.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Applicant extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String passportNumber;
    private String nationality;
    private boolean criminalRecorde;


@OneToMany
private List<VisaApplication> visaApplications;

@OneToMany
private List<Interview> interviews;

}
