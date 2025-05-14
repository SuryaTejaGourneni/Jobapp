package com.example.jobapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    private String status;
    private String resume;
    private String coverLetter;
    
    public Application() {
    }

    public Application(Long id, String name, String email, String resume, String coverLetter, Job job) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.job = job;
        this.resume = resume;
        this.coverLetter = coverLetter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job1) {
        this.job = job1;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    public void setUser(User user1) {
        this.user=user1;
    }
    
    public void setStatus(String status) {      
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }
}
