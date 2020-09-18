package com.example.iasback.controllers;

import com.example.iasback.payload.response.JwtResponse;
import com.example.iasback.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/session")
public class SessionController {

    @Autowired
    SessionService sessionService;


    @GetMapping("/get_session_user")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public JwtResponse getSessionUser() {
        return sessionService.getCurrentSessionUser();
    }
}
