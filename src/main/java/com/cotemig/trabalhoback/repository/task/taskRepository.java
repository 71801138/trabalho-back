package com.cotemig.trabalhoback.repository.task;

import com.cotemig.trabalhoback.models.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRepository extends JpaRepository<Task, Long> {
}
