package com.securityOne.demo.controller;

import com.securityOne.demo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class MainController {

    @Autowired
    private FileService fileService;

    @PostMapping
    public String saveFile(@RequestParam MultipartFile reqFile) throws IOException {
        System.out.println("Catch the file");
        return fileService.saveFile(reqFile);
    }


}
