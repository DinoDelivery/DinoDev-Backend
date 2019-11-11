package com.dinodelivery.project.controller;

import com.dinodelivery.project.object.dto.UserDto;
import com.dinodelivery.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public class RegistrationController {

    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    public ResponseEntity register(@Valid @RequestBody UserDto userDto) {
        if (userService.getUserByPhoneNumber(userDto.getPhoneNumber()) == null) {
            userService.register(userDto);

            return new ResponseEntity(HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
