package com.example.discutant_v0.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
@Service
public class WorkWithFiles //Отвечает за работу с файлами из бд
{
    @Value("${image.storage.path}")
    String storagePath;
    public String saveFile(MultipartFile file) throws IOException
    {
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        String fileName = currentDateTime.toString() + "_" + file.getName();
        File dest = new File(storagePath + File.separator + fileName);
        file.transferTo(dest);
        return dest.getPath();
    }

    public File readFile(String path) throws IOException
    {
        Path filePath = Paths.get(path);
        return (File) Files.readAllLines(filePath);
    }
}
