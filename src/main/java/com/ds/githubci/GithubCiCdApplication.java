package com.ds.githubci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCiCdApplication {


    @GetMapping("/wish")
    public String wish(){
        return "Good Morning GITHUB";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubCiCdApplication.class, args);
    }

}
