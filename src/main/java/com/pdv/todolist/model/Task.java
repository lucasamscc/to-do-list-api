package com.pdv.todolist.model;

import com.pdv.todolist.Enum.Priority;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTask;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "done")
    private boolean done = false;

    @Column(name = "priority")
    private Priority priority = Priority.LOW;
}
