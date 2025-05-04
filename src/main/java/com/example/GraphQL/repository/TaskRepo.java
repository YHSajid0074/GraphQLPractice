package com.example.GraphQL.repository;

import com.example.GraphQL.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {

    @Query(value="select t from Task t")
    List<Task> SortByid();

}
