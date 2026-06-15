package com.example.demo_Project.Repositories;

import com.example.demo_Project.Entities.Applicant;
import com.example.demo_Project.Entities.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterviewRepository extends JpaRepository<Interview,Long> {
    List<Interview> findByOfficerIdAndInterviewDate(Long officerId, String date);
    List<Interview> findByApplicantId(Long applicantId);
    List<Interview> findByStatus(String status);
    List<Interview> findByApplicantIdAndStatus(Long applicantId, String status);

}
