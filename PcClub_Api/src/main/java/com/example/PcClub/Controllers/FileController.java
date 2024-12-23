package com.example.PcClub.Controllers;

import com.example.PcClub.Services.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/files")
public class FileController {
    private final FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<?> upload(@RequestBody MultipartFile file, UserDetails userDetails) throws IOException {
        return fileService.uploadFile(file, userDetails);
    }
}
