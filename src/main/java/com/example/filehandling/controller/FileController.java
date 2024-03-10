package com.example.filehandling.controller;

import com.example.filehandling.service.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

    @Autowired
    FileUpload fileUpload;
    @PostMapping("/upload")
    public ResponseEntity<String> FileUpload(@RequestBody MultipartFile file) {
        Long fileSize = fileUpload.getSizeOfFile(file);
        System.out.println("Received file of size: " + fileSize + "bytes");
        return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
    }

}
