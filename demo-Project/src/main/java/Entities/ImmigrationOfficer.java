package Entities;

import jakarta.persistence.*;

import java.util.List;


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
    List<Center> centers;

    @OneToMany
    List<Interviews> interviews;
}
