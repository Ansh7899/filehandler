package com.example.filehandling.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUpload {
    public Long getSizeOfFile(MultipartFile file);
}
