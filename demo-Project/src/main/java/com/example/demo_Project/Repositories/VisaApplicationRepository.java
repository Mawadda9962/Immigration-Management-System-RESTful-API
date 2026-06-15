package com.example.demo_Project.Repositories;

import com.example.demo_Project.Entities.VisaApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisaApplicationRepository extends JpaRepository<VisaApplication, Long> {
}
