package com.camera.ipcam.service.impl;

import com.camera.ipcam.Repo.UserRepository;
import com.camera.ipcam.model.UserModel;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class UserServiceImpl {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
