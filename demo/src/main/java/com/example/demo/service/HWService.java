package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

public class HWService {
    public String helloWorld(String username, String password) {
        // boolean hasUser = userRepository.findByNameAndPassword(username, password);
        if (username.equals("test") && password.equals("123456"))
            return "Hello World!";
        else return null;
    }
}
