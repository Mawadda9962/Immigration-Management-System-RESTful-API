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
public class ImmigrationOfficer extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String badgeNumber;
    private String rank;
    private int clearanceLevel;
    private boolean active;

    @ManyToMany
    Center centers;

    @OneToMany
    List<Interviews> interviews;
}
