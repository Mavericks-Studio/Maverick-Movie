package com.example.maverickmovie.Service;

import com.example.maverickmovie.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    List<User> getAllUsersByEmail(String email);

}
