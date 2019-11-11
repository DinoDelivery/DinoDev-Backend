package com.dinodelivery.project.service;

import com.dinodelivery.project.object.User;
import com.dinodelivery.project.object.dto.UserDto;
import com.dinodelivery.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public void register(UserDto userDto) {
        User user = createUser(userDto);
        Integer id = userRepository.saveUser(user);
        user.setId(id);
    }

    public User getUserByPhoneNumber(String phoneNumber) {
        return userRepository.getUserByPhoneNumber(phoneNumber);
    }

    private User createUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setPassword(userDto.getPassword());

        return user;
    }
}
