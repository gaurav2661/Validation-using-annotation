package com.annotation.validation.Validation.controller;

import com.annotation.validation.Validation.annotation.ValidMedia;
import com.annotation.validation.Validation.domain.MediaResponse;
import com.annotation.validation.Validation.service.MediaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1")
public class MediaController {
    private final MediaService mediaService;

    public MediaController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @PostMapping({"", "/"})
    public ResponseEntity<MediaResponse> addMedia(@RequestPart(name = "file") @ValidMedia MultipartFile file,
                                                  @RequestPart(name = "text") String text) {
        return mediaService.acceptMedia(file,text);
    }
}
