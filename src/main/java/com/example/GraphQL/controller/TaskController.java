//package com.example.GraphQL.controller;
//
//import com.example.GraphQL.entity.Task;
//import com.example.GraphQL.payload.request.TaskDto;
//import com.example.GraphQL.service.TaskService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RestController
//@RequestMapping("task")
//public class TaskController {
//    TaskService taskService;
//    public TaskController(TaskService taskService) {
//        this.taskService = taskService;
//    }
//    @PostMapping("create")
//    public ResponseEntity<Task>createTask(@RequestBody TaskDto taskdto){
//        Task createdTask = taskService.createTask(taskdto);
//        return ResponseEntity.ok(createdTask);
//    }
//    @GetMapping
//    public ResponseEntity<List<Task>>getAll( Task task){
//        return ResponseEntity.ok(taskService.getAllTasks());
//    }
//    @GetMapping("{id}")
//    public ResponseEntity<Task> getTaskById(@PathVariable Task task){
//        return ResponseEntity.ok(taskService.findTaskById(task.getId()));
//    }
//    @DeleteMapping("{id}")
//    public void deleteTaskById(@PathVariable Task task){
//        taskService.deleteTaskById(task.getId());
//    }
//    @PutMapping("{id}")
//    public ResponseEntity<Task> updateTaskById(@PathVariable int id, @RequestBody TaskDto taskdto) {
//        Task updatedTask = taskService.updateTask(id, taskdto);
//        return ResponseEntity.ok(updatedTask);
//    }
//    @GetMapping("sort")
//    public ResponseEntity<List<Task>>Sort(){
//        return ResponseEntity.ok(taskService.SortByid());
//    }
//
//
//}
