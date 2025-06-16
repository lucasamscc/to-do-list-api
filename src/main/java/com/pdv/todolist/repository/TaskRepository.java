package com.pdv.todolist.repository;

import com.pdv.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    boolean existsByIdTask(Long idTask);
    boolean existsByTitle(String title);

    List<Task> findAllByDone(boolean done);
}
