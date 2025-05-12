package com.example.jobapp.controllers;

import com.example.jobapp.models.AuthRequest;
import com.example.jobapp.config.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController{

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest authrequest){
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(authrequest.getUsername(), authrequest.getPassword())
        );
        return jwtUtil.generateToken(auth.getName());
    }

    @GetMapping("/ping")
    public String publicEndpoint(){
        return "public access OK";
    }

}