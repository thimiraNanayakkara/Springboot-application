package com.example.studentapp.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StandardResponseEntity {
    private int statusCode;
    private String message;
    private Object data;
}
