package com.cotemig.trabalhoback.services.task.state;


import com.cotemig.trabalhoback.models.task.Task;
import com.cotemig.trabalhoback.repository.task.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractState {

    private Task task;

    @Autowired
    private taskRepository taskRepository;

    public AbstractState(Task task) {
        this.setTask(task);
    }

    public AbstractState() {
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public com.cotemig.trabalhoback.repository.task.taskRepository getTaskRepository() {
        return taskRepository;
    }

    public void setTaskRepository(com.cotemig.trabalhoback.repository.task.taskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Boolean changeToNextState() {
        Integer idStatus = this.getIdState();
        this.change(idStatus);
        this.afterChange(this.nextState());
        return true;
    }

    private Task change(Integer idStatus){
        Task task = this.getTask();
        task.setStatus(idStatus);
        return taskRepository.save(task);
    }

    private void generateLog(AbstractState nextState){
        System.out.println("Implementação do Log");
    }


    protected abstract Integer getIdState();

    protected abstract Boolean afterChange(AbstractState nextState);

    protected abstract AbstractState nextState();


}
