package com.example.demo.service;

import com.example.demo.user.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    List<User> getAllUsers();
    User getUserById(String id);
    void deleteUserById(String id);
}
