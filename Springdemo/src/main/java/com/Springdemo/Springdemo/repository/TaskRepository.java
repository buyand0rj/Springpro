package com.Springdemo.Springdemo.repository;

import com.Springdemo.Springdemo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
