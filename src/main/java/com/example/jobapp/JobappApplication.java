package com.example.jobapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;

@SpringBootApplication(exclude = BatchAutoConfiguration.class)
public class JobappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobappApplication.class, args);
    }
}