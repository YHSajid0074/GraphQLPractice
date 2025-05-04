//package com.example.GraphQL.controller;
//import com.example.GraphQL.entity.User1;
//import com.example.GraphQL.payload.request.UserDto;
//import com.example.GraphQL.payload.response.CustomUserResponseDTO;
//import com.example.GraphQL.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//import java.util.List;
//import java.util.Set;
//
//@RestController
//@RequestMapping("user")
//public class UserController {
//    UserService userService ;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService=userService;
//    }
//    @PostMapping("create")
//    public ResponseEntity<String>CreateUser(@RequestBody UserDto userdto){
//        userService.createUser(userdto);
//        return ResponseEntity.ok("successfully created");
//    }
//    @GetMapping("{id}")
//    public ResponseEntity<User1>GetuserById(@PathVariable  int id){
//        User1 finduser=userService.findUserById(id);
//        return ResponseEntity.ok(finduser);
//    }
//    @GetMapping("")
//    public ResponseEntity<List<User1>> FindAll(){
//        return ResponseEntity.ok(userService.findall());
//    }
//    @DeleteMapping("{id}")
//    public String deleteUserById(@PathVariable int id){
//        userService.deleteuser(id);
//        return "User deleted";
//    }
//    @PutMapping("update/{id}")
//    public ResponseEntity<User1> updateUser(@PathVariable int id, @RequestBody UserDto userdto) {
//        User1 upadteUser1 =userService.updateUser(id,userdto);
//        return ResponseEntity.ok(upadteUser1);
//    }
//
//    @GetMapping("custom-findall")
//    public ResponseEntity<Set<CustomUserResponseDTO>> FindAllCustomUser(){
//        return ResponseEntity.ok(userService.findAllUsers());
//
//    }
//
//}