package com.annotation.validation.Validation.service;

import com.annotation.validation.Validation.domain.MediaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MediaService {
    public ResponseEntity<MediaResponse> acceptMedia(MultipartFile file,String text) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
