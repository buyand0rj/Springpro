package com.Springdemo.Springdemo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private LocalDate dueDate;

    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Registration user;

    public Task() {
        Long a = Long.parseLong("123");
        this.id= a;

    }

    public Task(Long id, String title, String description, LocalDate dueDate, String status, Registration user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.user = user;
    }

}
