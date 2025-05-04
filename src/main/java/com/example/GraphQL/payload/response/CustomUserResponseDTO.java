package com.example.GraphQL.payload.response;

import java.time.LocalDateTime;
import java.util.List;

public interface CustomUserResponseDTO {
    int getId();

    String getFirstName();

    String getLastName();

    String getUsername();

    String getEmail();

    List<TaskInfo> getTask();

    interface TaskInfo {
        int getId();

        String getTitle();

        LocalDateTime getStartTime();

        LocalDateTime getEndTime();
    }
}
