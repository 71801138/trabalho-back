package com.cotemig.trabalhoback.services.task;

import com.cotemig.trabalhoback.models.User;
import com.cotemig.trabalhoback.models.task.Task;
import com.cotemig.trabalhoback.repository.task.taskRepository;
import com.cotemig.trabalhoback.services.task.state.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

  @Autowired
  private taskRepository taskRepository;

  public Task create(Task task, Long userId, Long typeId){
    return null;
  }

  private AbstractState currentState(Task task){
    AbstractState state = new Backlog(task);
    switch (task.getStatus()) {
      case 1:
        state = new Backlog(task);
        break;
      case 2:
        state = new ToDo(task);
        break;
      case 3:
        state = new Doing(task);
        break;
      case 4:
        state = new Done(task);
        break;
      case 5:
        state = new Closed(task);
        break;
    }
    return state;
  }

  public Boolean nextStep(Long taskId)
  {
    Optional<Task> currentTask = this.taskRepository.findById(taskId);
    if(!currentTask.isPresent()){
      return false;
    }
    AbstractState currentState = this.currentState(currentTask.get());
    return currentState.changeToNextState();
  }

  private Task createTask(Task task){
    Task taskCreated = taskRepository.save(task);
    return taskCreated;
  }
}
