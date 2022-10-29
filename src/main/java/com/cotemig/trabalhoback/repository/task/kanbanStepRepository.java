package com.cotemig.trabalhoback.repository.task;

import com.cotemig.trabalhoback.models.task.KanbanStep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface kanbanStepRepository extends JpaRepository<KanbanStep, Long> {
}
