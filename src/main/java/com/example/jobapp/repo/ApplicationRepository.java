package com.example.jobapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.example.jobapp.models.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

    @Override
    @NonNull
    List<Application> findAll();
}

    
