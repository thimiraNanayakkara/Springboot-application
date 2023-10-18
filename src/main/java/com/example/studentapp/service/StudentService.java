package com.example.studentapp.service;

import com.example.studentapp.dto.paginated.PaginatedStudentResponseDto;
import com.example.studentapp.dto.request.RequestStudentDto;
import com.example.studentapp.dto.response.ResponseStudentDto;

public interface StudentService {
    public void saveStudent(RequestStudentDto dto);
    public void updateStudent(RequestStudentDto dto,String id);
    public void deleteStudent(String id);
    public ResponseStudentDto findStudent(String id);
    public PaginatedStudentResponseDto findAllStudents(int page, int size);

    public PaginatedStudentResponseDto searchStudents(int page, int size,String text);

}
