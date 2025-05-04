package com.example.GraphQL.controller;
import com.example.GraphQL.entity.User1;
import com.example.GraphQL.repository.UserRepo;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserGraphQLController {

    private final UserRepo userRepository;

    public UserGraphQLController(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    @QueryMapping
    public List<User1> allUsers() {
        return userRepository.findAll();
    }

    @MutationMapping
    public User1 addUser(@Argument String firstName,
                         @Argument String lastName,
                         @Argument String username,
                         @Argument String password) {
        return userRepository.save(new User1(null,firstName, lastName, username, password));
    }
}

