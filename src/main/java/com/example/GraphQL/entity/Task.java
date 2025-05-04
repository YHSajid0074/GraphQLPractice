package com.example.GraphQL.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String title;

    LocalDateTime startTime;
    LocalDateTime endTime;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User1 user1;
}
