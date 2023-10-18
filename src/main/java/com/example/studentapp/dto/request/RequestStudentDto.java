package com.example.studentapp.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RequestStudentDto {
    private String name;
    private String address;
    private double salary;
}
