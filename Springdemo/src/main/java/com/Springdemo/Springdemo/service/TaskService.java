package com.Springdemo.Springdemo.service;

import com.Springdemo.Springdemo.model.Task;
import com.Springdemo.Springdemo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public Task createask(Task task) {
        return taskRepository.save(task);
    }
}
