package com.example.demo_Project.Repositories;

import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Entities.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Long> {

    List<Applicant> findByNationality(String nationality);
}
