package com.annotation.validation.Validation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
public class MediaValidator implements ConstraintValidator<ValidMedia, MultipartFile> {
    @Override
    public void initialize(ValidMedia constraintAnnotation) {

    }

    @Override
    public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = true;

        String contentType = multipartFile.getContentType();
        log.info(contentType);
        assert contentType != null;
        if (!isSupportedContentType(contentType)) {
            result = false;
            log.info(String.valueOf(result));
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
