package com.gcu.CapstoneProject.CapstoneProject.ErrorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExpectionHandler {

    @ExceptionHandler(value = InternalServerError.class)
    public ResponseEntity<Object> internalServerError(InternalServerError internalServerError) {
        return new ResponseEntity<>("Account number does not exist in database.", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
