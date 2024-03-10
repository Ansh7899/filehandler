package com.example.filehandling.service.implementation;

import com.example.filehandling.service.FileUpload;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadImplementation implements FileUpload {

    @Override
    public Long getSizeOfFile(MultipartFile file) {
        return file.getSize();
    }

}
