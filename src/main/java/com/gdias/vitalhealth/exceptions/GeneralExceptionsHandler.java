package com.gdias.vitalhealth.exceptions;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class GeneralExceptionsHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity exception404() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity exception400(MethodArgumentNotValidException exception) {

        List<FieldError> fieldErrorList = exception.getFieldErrors();
        System.out.println(fieldErrorList);

        return ResponseEntity.badRequest().body(fieldErrorList.stream().map(FieldErrorsMessage::new).toList());
    }
}


record FieldErrorsMessage(String errorCode, String errorField, String errorMessage) {

    public FieldErrorsMessage(FieldError fieldError) {
        this(fieldError.getCode(), fieldError.getField(), fieldError.getDefaultMessage());
    }
}