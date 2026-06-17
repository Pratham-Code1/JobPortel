package com.s2p.jobportel.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(){
        return ResponseEntity.badRequest().body("Something went wrong");
    }


    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleException(){
        return ResponseEntity.badRequest().body("Its a bad day");
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException exception){
        return ResponseEntity.badRequest().body(exception.getMessage());
    }
}


