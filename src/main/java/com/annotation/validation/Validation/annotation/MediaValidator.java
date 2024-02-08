package com.annotation.validation.Validation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.web.multipart.MultipartFile;

public class MediaValidator implements ConstraintValidator<ValidMedia, MultipartFile> {
    @Override
    public void initialize(ValidMedia constraintAnnotation) {

    }

    @Override
    public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = true;

        String contentType = multipartFile.getContentType();
        assert contentType != null;
        if (!isSupportedContentType(contentType)) {
            result = false;
        }

        return result;
    }
    private boolean isSupportedContentType(String contentType) {
        return contentType.equals("text/xml")
                || contentType.equals("application/pdf")
                || contentType.equals("image/png")
                || contentType.equals("image/jpg")
                || contentType.equals("image/jpeg");
    }
}
