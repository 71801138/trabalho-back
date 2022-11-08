package com.cotemig.trabalhoback.services.task;

import com.cotemig.trabalhoback.models.User;
import com.cotemig.trabalhoback.models.task.Task;
import com.cotemig.trabalhoback.repository.task.taskRepository;
import com.cotemig.trabalhoback.services.task.state.AbstractState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

  @Autowired
  private taskRepository taskRepository;

  public  Task create(Task task, Long userId, Long typeId){
    return null;
  }

  private AbstractState currentState(Task task){
    return task.status = new task.status();
  }

  public Boolean nextStep(Long taskId)
  {
    Optional<Task> currentTask = this.taskRepository.findById(taskId);
    AbstractState currentState = this.currentState(currentTask);
    this.taskRepository.changeStatus(currentState);
  }

  private Task createTask(Task task){
    Task taskCreated = taskRepository.save(task);
    return taskCreated;
  }
}
