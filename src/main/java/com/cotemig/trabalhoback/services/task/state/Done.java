package com.cotemig.trabalhoback.services.task.state;

import com.cotemig.trabalhoback.models.task.Task;

public class Done extends  AbstractState {

    public Done(Task task) {
        super(task);
    }

    public Done() {
    }

    protected Integer getIdState() {
        return 4;
    }

    @Override
    protected Boolean afterChange() {
        return true;
    }
    @Override
    protected Integer nextState() {
        return new Closed().getIdState();
    }
}
