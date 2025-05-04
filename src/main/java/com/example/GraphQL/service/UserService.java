package com.example.GraphQL.service;

import com.example.GraphQL.entity.User1;
import com.example.GraphQL.payload.request.UserDto;
import com.example.GraphQL.payload.response.CustomUserResponseDTO;
import com.example.GraphQL.repository.UserRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


@Service
@Data
public class UserService {
    UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public User1 createUser(UserDto userdto) {

        User1 user1 =new User1();
        user1.setFirstName(userdto.firstName());
        user1.setLastName(userdto.lastName());
        user1.setPassword(userdto.password());
        user1.setUsername(userdto.username());

        return userRepo.save(user1);
    }
    public User1 findUserById(int id) {
        User1 user1 = userRepo.findById(id).orElseThrow(
                ()->new RuntimeException("user Not Found")
        );
        return user1;
    }

    public List<User1> findall() {
        return  userRepo.findAll();
    }

    public User1 updateUser(int id, UserDto userDto) {
        User1 existingUser1 = userRepo.findById(id).orElseThrow(
                ()->new RuntimeException("User Not Found")
        );

        existingUser1.setFirstName(userDto.firstName());
        existingUser1.setLastName(userDto.lastName());
        existingUser1.setPassword(userDto.password());
        existingUser1.setUsername(userDto.username());

        return userRepo.save(existingUser1);
    }

    public String deleteuser(int id){
        userRepo.findById(id).orElseThrow(
                ()->new RuntimeException("User Not Found")
        );

        userRepo.deleteById(id);
        return "successfully deleted";
    }

    public  Set<CustomUserResponseDTO> findAllUsers(){
        return userRepo.findAllUsers();
    }



}
