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
    @SuppressWarnings("unused")
    private User user;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "job_id")
    @SuppressWarnings("unused")
    private Job job;
    @SuppressWarnings("unused")
    private String status;
    private Job jobId;
    private String resume;
    private String coverLetter;
    
    public Application() {
    }

    public Application(Long id, String name, String email, Job jobId, String resume, String coverLetter) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobId = jobId;
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

    public Job getJobId() {
        return jobId;
    }

    public void setJobId(Job job1) {
        this.jobId = job1;
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
        
        throw new UnsupportedOperationException("Unimplemented method 'setUser'");
    }

    public void setStatus(String string) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setStatus'");
    }
}
