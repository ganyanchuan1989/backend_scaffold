package com.gxz.backend.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseInfo handleException(Exception e) {
        return ResponseInfo.fail(e.getMessage());
    }
}