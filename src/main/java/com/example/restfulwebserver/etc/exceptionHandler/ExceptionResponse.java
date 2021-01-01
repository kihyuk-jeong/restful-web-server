package com.example.restfulwebserver.etc.exceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
    private Date timeStamp;
    private String message;
    private String details;
}
