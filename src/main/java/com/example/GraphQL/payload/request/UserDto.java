package com.example.GraphQL.payload.request;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record UserDto(
        @NotEmpty
        String firstName,
        @NotEmpty
        String lastName,
        @NotEmpty
        String username,
        String password
) {
}
