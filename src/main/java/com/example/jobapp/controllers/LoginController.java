package com.example.jobapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.jobapp.models.Job;
import com.example.jobapp.models.User;
import com.example.jobapp.repo.UserRepository;
import com.example.jobapp.services.JobService;

@Controller
public class LoginController {

    private final JobService jobService;
    private final UserRepository userRepository;


    public LoginController(JobService jobService, UserRepository userRepository) {
        this.jobService = jobService;
        this.userRepository = userRepository;
    }

    @GetMapping("/login")
    public String login() {
        return "login"; 
    }


    @PostMapping("/login")
public String handleLogin(
        @RequestParam String username,
        @RequestParam String password,
        Model model
) {
    try {
        User user = userRepository.findByUsername(username); 

        if (user != null && user.getPassword().equals(password)) {
            System.err.println("Login successful for user: " + username);
            List<Job> jobs = jobService.getAllJobs();
            for (Job job : jobs) {
                System.out.println(job);
            }

            model.addAttribute("jobs", jobs);
            return "job-list"; 
        } else {
            model.addAttribute("error", "Invalid credentials!");
            return "login";
        }
    } catch (Exception e) {
        System.err.println("Login error:");
        model.addAttribute("error", "An error occurred. Try again.");
        return "login";
    }
}
}