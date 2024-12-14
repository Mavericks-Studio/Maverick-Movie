package com.example.maverickmovie.Service.Impl;

import com.example.maverickmovie.Model.User;
import com.example.maverickmovie.Repository.UserRepository;
import com.example.maverickmovie.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        List<User> result = userRepository.findAll();
        return result;
    }

    @Override
    public List<User> getAllUsersByEmail(String email) {
        List<User> result = userRepository.findByEmail(email);
        return result;
    }

}
