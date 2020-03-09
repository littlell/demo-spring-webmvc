package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Controller
@RequestMapping("/upload")
public class UploadController {
    @RequestMapping("/select")
    public String select() {
        return "uploadSelect";
    }

    @RequestMapping("/submit")
    public String submit(@RequestParam("name") String name,
                         @RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            OutputStream outputStream = null;
            try {
                byte[] bytes = file.getBytes();
                outputStream = new FileOutputStream("/tmp/" + name);
                outputStream.write(bytes);
                outputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                outputStream.close();
            }
            return "uploadSuccess";
        }
        return "uploadFailure";
    }
}
