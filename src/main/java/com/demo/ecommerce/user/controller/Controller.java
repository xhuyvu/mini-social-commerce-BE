package com.demo.ecommerce.user.controller;

import com.demo.ecommerce.user.dto.response.UserResponse;
import com.demo.ecommerce.user.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class Controller {
    @Autowired
    private userService service;

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable long id){
        return service.findUserById(id);
    }
}
