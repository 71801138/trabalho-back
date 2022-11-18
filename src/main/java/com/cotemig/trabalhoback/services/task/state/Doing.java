package com.cotemig.trabalhoback.services.task.state;

import com.cotemig.trabalhoback.models.task.Task;

public class Doing extends AbstractState {

    public Doing(Task task) {
        super(task);
    }

    public Doing() {
    }

    protected Integer getIdState() {
        return 3;
    }

    @Override
    protected Boolean afterChange(AbstractState nextState) {
        return true;
    }
    @Override
    protected AbstractState nextState() {
        return new Done();
    }
}
