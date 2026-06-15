package com.example.demo_Project.Repositories;

import com.example.demo_Project.Entities.ImmigrationOfficer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficerRepository extends JpaRepository<ImmigrationOfficer, Long> {
    List
}