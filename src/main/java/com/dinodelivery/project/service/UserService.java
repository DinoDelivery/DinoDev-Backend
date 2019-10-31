package com.dinodelivery.project.service;

import com.dinodelivery.project.object.User;
import com.dinodelivery.project.object.dto.UserDto;
import com.dinodelivery.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(UserDto userDto) {
        User user = createUser(userDto);
        Integer id = userRepository.saveUser(user);
        user.setId(id);
    }

    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    private User createUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPasswordHash(passwordEncoder.encode(userDto.getPassword()));

        return user;
    }
}