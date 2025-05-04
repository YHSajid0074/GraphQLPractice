package com.example.GraphQL.controller;
import com.example.GraphQL.entity.User1;
import com.example.GraphQL.payload.request.UserDto;
import com.example.GraphQL.repository.UserRepo;
import com.example.GraphQL.service.UserService;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserGraphQLController {

    private final UserService userService;

    public UserGraphQLController(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping
    public List<User1> allUsers() {
        return userService.findall();
    }

    @MutationMapping
    public User1 addUser(@Argument String firstName,
                         @Argument String lastName,
                         @Argument String username,
                         @Argument String password) {
        return userService.createUser(new UserDto( firstName,lastName, username, password));
    }

}

