package com.example.jobapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    private String name;
    private String email;
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

    public Application(String coverLetter, String email, Long id, Job job, String name, String resume, String status, User user) {
        this.coverLetter = coverLetter;
        this.email = email;
        this.id = id;
        this.job = job;
        this.name = name;
        this.resume = resume;
        this.status = status;
        this.user = user;
    }

    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Job getJob() { return job; }
    public void setJob(Job job) { this.job = job; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getResume() { return resume; }
    public void setResume(String resume) { this.resume = resume; }
    public String getCoverLetter() { return coverLetter; }
    public void setCoverLetter(String coverLetter) { this.coverLetter = coverLetter; }
}
