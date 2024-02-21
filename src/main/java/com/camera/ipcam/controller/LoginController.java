package com.camera.ipcam.controller;

import com.camera.ipcam.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    public String login() {
        return "You are logged in";
    }
    public  String home() {
        return "You are in the home";
    }

    public String liveFeed() {
        return "You are live";
    }
}
