package com.example.filehandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestBody MultipartFile file) {
        // Here you can perform operations with the file, such as saving it or processing its content

        // For example, let's just print out the file name for demonstration purposes
        System.out.println("Received file: ");

        // You can return any response based on your business logic
        return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
    }
}
