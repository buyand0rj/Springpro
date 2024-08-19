package com.Springdemo.Springdemo.controller;

import com.Springdemo.Springdemo.model.Task;
import com.Springdemo.Springdemo.service.TaskService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    private Task createTask(@RequestBody Task task){
        Task task1 = new Task();
        return taskService.createask(task);
    }

}
