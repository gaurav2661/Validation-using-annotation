package com.annotation.validation.Validation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = MediaValidator.class)
public @interface ValidMedia {
    //error message
    public String message() default "Invalid File";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
