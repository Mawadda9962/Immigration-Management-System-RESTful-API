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
public class ImmigrationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String locationCountry;
    private String type;
    private int dailyCapacity;

    @OneToMany
    private List<Officer> officers;

}
