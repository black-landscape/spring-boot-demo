package com.example.demo;

import java.io.File;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
    @Value("${file.upload.path}")
    private String path;

    @GetMapping("/")
    public String uploadPage() {
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String create(@RequestPart MultipartFile[] files) throws Exception {
        StringBuffer message = new StringBuffer();

        for (MultipartFile file : files) {
            File dest = new File(path + file.getOriginalFilename());
            Files.copy(file.getInputStream(), dest.toPath());
            message.append("Upload file success : " + dest.getAbsolutePath()).append("<br>");
        }
        return message.toString();
    }
}
