package com.multipart.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ControllerService {

    @Autowired
    private FileServices fileServices;

    @PostMapping("/uplode-file")
    public ResponseEntity<String> fileHandler(@RequestParam("file") MultipartFile file) {

        try {

            if (file.isEmpty()) {
                return ResponseEntity.ok("Please select a file to upload.");
            }

            this.fileServices.fileHalper(file);

            return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/")
                    .path(file.getOriginalFilename()).toUriString());

        } catch (Exception e) {
            e.getStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

}
