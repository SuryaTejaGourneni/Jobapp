package com.example.jobapp.repo;

import com.example.jobapp.models.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    
}


