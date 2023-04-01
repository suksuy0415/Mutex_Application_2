package org.example.controller;

import org.example.domain.User;
import org.example.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class AuthServiceController {


    private AuthService authService;



    @Autowired
    public AuthServiceController(AuthService authService)
    {
        this.authService = authService;
    }
    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody User user)  {
        return new ResponseEntity<>(authService.saveUser(user), HttpStatus.CREATED);
    }
}