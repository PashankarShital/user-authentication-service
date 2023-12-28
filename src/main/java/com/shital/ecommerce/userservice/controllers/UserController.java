package com.shital.ecommerce.userservice.controllers;

import com.shital.ecommerce.userservice.models.ApplicationUser;
import com.shital.ecommerce.userservice.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/{email}")
    public ApplicationUser getUser(@PathVariable("email") String email) {
        return userService.getUser(email);
    }

    @GetMapping("/")
    public List<ApplicationUser> getUsers() {
        return userService.getUsers();
    }


}
