package com.example.jobapp.repo;

import com.example.jobapp.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
    
}