package com.annotation.validation.Validation.exception;

import com.annotation.validation.Validation.domain.MediaResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentConversionNotSupportedException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import java.util.Collections;

@ControllerAdvice
@Slf4j
public class ExceptionHandlerAdvice {

    @ExceptionHandler(MethodArgumentConversionNotSupportedException.class)
    public ResponseEntity<MediaResponse> conversionHandler(MethodArgumentConversionNotSupportedException e) {
        MediaResponse mediaResponse = new MediaResponse();
        mediaResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        mediaResponse.setErrors(Collections.singletonList("Invalid type request"));
        return new ResponseEntity<>(mediaResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<MediaResponse> mismatchHandler(MethodArgumentTypeMismatchException e) {
        MediaResponse mediaResponse = new MediaResponse();
        mediaResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        mediaResponse.setErrors(Collections.singletonList("Invalid type request"));
        return new ResponseEntity<>(mediaResponse, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(MissingServletRequestPartException.class)
    public ResponseEntity<MediaResponse> mismatchHandler(MissingServletRequestPartException e) {
        MediaResponse mediaResponse = new MediaResponse();
        mediaResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        mediaResponse.setErrors(Collections.singletonList("Invalid type request"));
        return new ResponseEntity<>(mediaResponse, HttpStatus.BAD_REQUEST);
    }
}
