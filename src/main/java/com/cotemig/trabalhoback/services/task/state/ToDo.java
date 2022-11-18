package com.cotemig.trabalhoback.services.task.state;

import com.cotemig.trabalhoback.models.task.Task;

import java.util.List;

public class ToDo extends AbstractState {

    public ToDo(Task task) {
        super(task);
    }

    public ToDo() {
    }

    protected Integer getIdState() {
        return 2;
    }

    @Override
    protected Boolean afterChange() {
        return true;
    }

    @Override
    protected Integer nextState() {
        return new Doing().getIdState();
    }
}
