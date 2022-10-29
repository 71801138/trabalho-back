package com.cotemig.trabalhoback.services.task;

import com.cotemig.trabalhoback.models.task.Task;
import com.cotemig.trabalhoback.repository.task.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
  @Autowired
  private taskRepository taskRepository;

  protected AbstractState getCurrentState(){

  }

  public Task createTask(Task task){
    Task taskCreated = taskRepository.save(task);
    return taskCreated;
  }
}
