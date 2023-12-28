package com.shital.ecommerce.userservice.services;

import com.shital.ecommerce.userservice.models.ApplicationUser;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    private List<ApplicationUser> users = new ArrayList<>();

    public UserService() {
        users.add(new ApplicationUser(UUID.randomUUID().toString(),"armin@gmail.com", "password"));
        users.add(new ApplicationUser(UUID.randomUUID().toString(),"shital@gmail.com", "password"));
    }

    public List<ApplicationUser> getUsers() {
        return users;
    }

    public ApplicationUser getUser(String email) {
        return users.stream().filter((user) -> user.getEmail().equals(email)).findAny().orElseThrow();
    }
}
