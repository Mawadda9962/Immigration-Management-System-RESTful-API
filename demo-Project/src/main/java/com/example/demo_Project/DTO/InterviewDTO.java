package com.example.demo_Project.DTO;

import com.example.demo_Project.Entities.Interview;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class InterviewDTO {
    private Long id;
    private String interviewDate;
    private String status;
    private String purpose;
    private Long applicantId;
    private Long officerId;

    // Convert Entity to DTO
    public static InterviewDTO convertToDTO(Interview interview) {
        InterviewDTO dto = new InterviewDTO();
        dto.setId(interview.getId());
        dto.setInterviewDate(interview.getInterviewDate());
        dto.setStatus(interview.getStatus());
        dto.setPurpose(interview.getPurpose());
        dto.setApplicantId(interview.getApplicant().getId());
        dto.setOfficerId(interview.getOfficer().getId());
        return dto;
    }

    public static List<InterviewDTO> convertToDTO(List<Interview> interviews) {
        List<InterviewDTO> dtos = new ArrayList<>();
        for (Interview interview : interviews) {
            dtos.add(convertToDTO(interview));
        }
        return dtos;
    }
}
