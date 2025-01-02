package com.openclassrooms.edoctorat.services;

import com.openclassrooms.edoctorat.models.UserModel;
import com.openclassrooms.edoctorat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Additional methods can be added as needed
}