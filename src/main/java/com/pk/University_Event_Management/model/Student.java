package com.pk.University_Event_Management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private long iStudentId;
    private String first_name;
    private String last_name;
    private int age;
    @Column(unique = true)
    private String department;
}
