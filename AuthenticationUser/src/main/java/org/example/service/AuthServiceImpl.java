package org.example.service;

import org.example.domain.User;
import org.example.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    private AuthRepository authRepository;


    @Autowired
    public AuthServiceImpl(AuthRepository authRepository)
    {
        this.authRepository = authRepository;
    }


    @Override
    public User saveUser(User user) {
        return authRepository.save(user);
    }
}
