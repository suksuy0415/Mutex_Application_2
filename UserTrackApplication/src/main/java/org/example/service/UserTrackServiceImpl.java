package org.example.service;

import org.example.domain.User;
import org.example.repository.UserTrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTrackServiceImpl implements UserTrackService{

    private UserTrackRepository userTrackRepository;

    @Autowired
    public  UserTrackServiceImpl(UserTrackRepository userTrackRepository){ this.userTrackRepository = userTrackRepository;}


    @Override
    public User registerUser(User user) {
        return userTrackRepository.save(user);
    }
}