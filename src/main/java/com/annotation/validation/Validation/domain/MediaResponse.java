package com.annotation.validation.Validation.domain;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@Data
public class MediaResponse {
    private HttpStatus httpStatus;
    private String message;
    private List<String> errors = new ArrayList<>();
}
