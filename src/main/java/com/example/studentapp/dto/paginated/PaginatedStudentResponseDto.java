package com.example.studentapp.dto.paginated;

import com.example.studentapp.dto.response.ResponseStudentDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class PaginatedStudentResponseDto {
    private long count;
    private List<ResponseStudentDto> dataList;
}
