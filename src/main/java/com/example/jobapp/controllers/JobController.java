package com.example.jobapp.controllers;

import com.example.jobapp.models.Job;

import com.example.jobapp.repo.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping
    public ResponseEntity<List<Job>> getAllJobs() {
        try {
            List<Job> jobs = jobRepository.findAll();
            return new ResponseEntity<>(jobs, HttpStatus.OK);
        } catch (Exception e) { 
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        if (job == null || job.getTitle() == null || job.getDescription() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try {
            Job savedJob = jobRepository.save(job);
            return new ResponseEntity<>(savedJob, HttpStatus.CREATED);
        } catch (Exception e) {}
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
}
