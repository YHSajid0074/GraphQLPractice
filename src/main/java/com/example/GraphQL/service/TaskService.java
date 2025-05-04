package com.example.GraphQL.service;

import com.example.GraphQL.entity.Task;
import com.example.GraphQL.payload.request.TaskDto;
import com.example.GraphQL.repository.TaskRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class TaskService {
    TaskRepo taskRepo;
    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Task createTask(TaskDto taskdto) {
        Task task=new Task();
        task.setTitle(taskdto.title());
        task.setStartTime(taskdto.startTime());
        task.setEndTime(taskdto.endTime());
        return taskRepo.save(task);

    }

    public Task findTaskById(int id) {
        Task task = taskRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Task Not Found")
        );
        return task;
    }

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }
    public Task updateTask(int id,TaskDto taskdto) {
        Task existingTask = taskRepo.findById(id).orElseThrow(
                () -> new RuntimeException("Task not found")
        );

        existingTask.setTitle(taskdto.title());
        existingTask.setStartTime(taskdto.startTime());
        existingTask.setEndTime(taskdto.endTime());
        return taskRepo.save(existingTask);


    }
    public String deleteTaskById(int id) {
        taskRepo.deleteById(id);
        return "Task deleted";
    }

    public List<Task>SortByid(){
        List<Task> tasks = taskRepo.SortByid();
        return tasks;
    }

}
