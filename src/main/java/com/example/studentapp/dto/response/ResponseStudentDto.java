package com.example.studentapp.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResponseStudentDto {
    private String studentId;
    private String name;
    private String address;
    private double salary;
}
