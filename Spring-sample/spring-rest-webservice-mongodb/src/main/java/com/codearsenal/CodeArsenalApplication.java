package com.codearsenal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CodeArsenalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeArsenalApplication.class, args);
    }
    
}
