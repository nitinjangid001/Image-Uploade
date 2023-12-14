package com.multipart.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileServices {

    public final String path = new ClassPathResource("static/images").getFile().getAbsolutePath();

    public FileServices() throws IOException {

    }

    public boolean fileHalper(MultipartFile multipartFile) {

        boolean isTrue = false;

        try {

            Files.copy(multipartFile.getInputStream(),
                    Path.of(path + File.separator + multipartFile.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);
            return isTrue = true;
        } catch (Exception e) {
            e.getStackTrace();
            return isTrue;
        }

    }

}
