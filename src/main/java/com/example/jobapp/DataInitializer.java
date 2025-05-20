package com.example.jobapp;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.jobapp.models.Application;
import com.example.jobapp.models.Job;
import com.example.jobapp.models.User;
import com.example.jobapp.repo.ApplicationRepository;
import com.example.jobapp.repo.JobRepository;
import com.example.jobapp.repo.UserRepository;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initDatabase(UserRepository userRepository, JobRepository jobRepository, ApplicationRepository applicationRepository) {
        return (String[] args) -> {
            User user1 = new User(List.of(), null, "Surya", "suryatejagourneni@gmail.com", "User");
            user1.setPassword("Surya@123");
            
            User user2 = new User(List.of(), null, "Teja", "javasuryateja@gmail.com", "User");
            user2.setPassword("Teja@123");
            
            User user3 = new User(List.of(), null, "Admin", "suryatejagourneni00@gmail.com", "Admin");
            user3.setPassword("admin123");
            
            
            Job job1 = new Job();
            job1.setTitle("Java Developer");
            job1.setDescription("Backend Java job");
            job1.setCompany("Coserv");
            job1.setLocation("Dallas");
            job1.setSalary(120000.00);
            job1.setApplications(List.of());
            
            Job job2 = new Job();
            job2.setTitle("Frontend Developer");
            job2.setDescription("React Developer job");
            job2.setCompany("Sabre Corporation");
            job2.setLocation("Remote");
            job2.setSalary(120000.00);
            job2.setApplications(List.of());
            
            Job job3 = new Job();
            job3.setTitle("Admin");
            job3.setDescription("Admin job");
            job3.setCompany("Amensys Inc");
            job3.setLocation("Dallas");
            job3.setSalary(810000.00);
            job3.setApplications(List.of());
            
            Application app1 = new Application();
            app1.setUser(user1);
            app1.setJob(job1);
            app1.setStatus("Applied");
            app1.setName("Surya Teja");
            app1.setEmail("suryatejagourneni@gmail.com");
            app1.setResume("resume.pdf");
            app1.setCoverLetter("coverletter.pdf");
            
            Application app2 = new Application();
            app2.setUser(user2);
            app2.setJob(job2);
            app2.setStatus("Interview");
            app2.setName("Teja");
            app2.setEmail("javasuryateja@gmail.com");
            app2.setResume("resume.pdf");
            app2.setCoverLetter("coverletter.pdf");
            
            Application app3 = new Application();
            app3.setUser(user3);
            app3.setJob(job3);
            app3.setStatus("Interview");
            app3.setName("Admin");
            app3.setEmail("suryatejagourneni00@gmail.com");
            app3.setResume("resume.pdf");
            app3.setCoverLetter("coverletter.pdf");
            
            user1.setApplications(List.of(app1));
            user2.setApplications(List.of(app2));
            user3.setApplications(List.of(app3));
            
            job1.setApplications(List.of(app1));
            job2.setApplications(List.of(app2));
            job3.setApplications(List.of(app3));
            
            
            userRepository.saveAll(List.of(user1, user2, user3));
            jobRepository.saveAll(List.of(job1, job2, job3));
            applicationRepository.saveAll(List.of(app1, app2, app3));
        };
    }
}
