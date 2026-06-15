package com.example.demo_Project;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@MappedSuperclass
public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNumber;
    private String email;





}
