package com.example.GraphQL.repository;

import com.example.GraphQL.entity.User1;
import com.example.GraphQL.payload.response.CustomUserResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepo extends  JpaRepository<User1, Integer> {
    @Query("""
         SELECT
                user1
            FROM User1 user1
        """)
    Set<CustomUserResponseDTO> findAllUsers();


//    @Query(value = "SELECT * FROM user1 WHERE email = :email", nativeQuery = true)
//    User findByEmail(@Param("email") String email);
}
