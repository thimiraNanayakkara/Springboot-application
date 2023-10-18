package com.example.studentapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @Column(name = "student_id")
    private String studentId;
    @Column(nullable = false, length = 45)
    private String name;
    @Column(nullable = false, length = 200)
    private String address;
    @Column(nullable = false)
    private double salary;
}
