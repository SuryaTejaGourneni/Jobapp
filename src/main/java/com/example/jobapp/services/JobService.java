package com.example.jobapp.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.jobapp.models.Job;

import jakarta.persistence.EntityNotFoundException;
import com.example.jobapp.repo.JobRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepository jobRepository;

    
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    @Transactional
    public Job createJob(Job job) {
        if (job == null) {
            throw new IllegalArgumentException("Job cannot be null");
        }
        validateJob(job);
        return jobRepository.save(job);
    }

    @Transactional
    public Job updateJob(Long id, Job jobDetails) {
        if (jobDetails == null) {
            throw new IllegalArgumentException("Job details cannot be null");
        }
        validateJob(jobDetails);

        Job job = jobRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Job not found with id: " + id));
        job.setTitle(jobDetails.getTitle());
        job.setDescription(jobDetails.getDescription());
        job.setCompany(jobDetails.getCompany());
        return jobRepository.save(job);
    }

    @Transactional
    public void deleteJob(Long id) {
        if (!jobRepository.existsById(id)) {
            throw new EntityNotFoundException("Job not found with id: " + id);
        }
        jobRepository.deleteById(id);
    }

    private void validateJob(Job job) {
        if (job.getTitle() == null || job.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Job title cannot be null or empty");
        }
        if (job.getDescription() == null || job.getDescription().isEmpty()) {
            throw new IllegalArgumentException("Job description cannot be null or empty");
        }
        if (job.getCompany() == null || job.getCompany().isEmpty()) {
            throw new IllegalArgumentException("Job company cannot be null or empty");
        }
    }
}