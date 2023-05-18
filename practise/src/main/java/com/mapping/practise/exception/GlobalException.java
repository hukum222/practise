package com.mapping.practise.exception;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalException {

    @ExceptionHandler(Exception.class)
    public String exception(Exception exception){
        return exception.getMessage();
    }

}



