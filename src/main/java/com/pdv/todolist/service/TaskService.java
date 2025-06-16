package com.pdv.todolist.service;

import com.pdv.todolist.model.Task;
import com.pdv.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task getTask(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found"));
    }

    public Task saveTask(Task task) {
        if (taskRepository.existsByIdTask(task.getIdTask())) {
            throw new RuntimeException("Task already exists");
        }

        if (taskRepository.existsByTitle(task.getTitle())) {
            throw new RuntimeException("A task with this title already exists");
        }

        return taskRepository.save(task);
    }

    public Task updateTask(Task task, Long id) {
        Task existingTask = taskRepository.findById(id).orElseThrow();
        existingTask.setTitle(task.getTitle());
        existingTask.setDone(task.isDone());
        existingTask.setPriority(task.getPriority());
        return taskRepository.save(existingTask);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
