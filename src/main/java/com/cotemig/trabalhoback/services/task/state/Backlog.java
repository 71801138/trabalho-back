package com.cotemig.trabalhoback.services.task.state;

import com.cotemig.trabalhoback.models.task.Task;

import java.util.ArrayList;
import java.util.List;

public class Backlog extends AbstractState {

    public Backlog(Task task) {
        super(task);
    }

    public Backlog() {
    }

    @Override
    protected Integer getIdState() {
        return 1;
    }

    @Override
    protected Boolean afterChange() {
        return true;
    }

    @Override
    protected Integer nextState() {
        return new ToDo().getIdState();
    }
}
