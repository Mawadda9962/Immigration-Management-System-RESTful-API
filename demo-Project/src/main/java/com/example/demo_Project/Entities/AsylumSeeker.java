package com.example.demo_Project.Entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class AsylumSeeker extends Applicant {
    private String countryOfOrigin;
    private String sponsorOrganization;
}
