package com.impressico.lnd.alert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestMeApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestMeApplication.class, args);
    }

    @GetMapping("/testme")
    public ResponseEntity<String> testMe() {
        return new ResponseEntity<>("TestMe micro-service app is running!", HttpStatus.OK);
    }
}
