package com.example.GraphQL.payload.request;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public record TaskDto(
        int id,
        @NotEmpty
        String title,
        @NotEmpty
        LocalDateTime startTime,
        @NotEmpty
        LocalDateTime endTime,
        Integer user_id) {
}
