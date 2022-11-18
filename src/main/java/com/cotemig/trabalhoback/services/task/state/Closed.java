package com.cotemig.trabalhoback.services.task.state;

import com.cotemig.trabalhoback.models.task.Task;

public class Closed extends AbstractState {

    public Closed(Task task) {
        super(task);
    }

    public Closed() {
    }

    protected Integer getIdState() {
        return 5;
    }

    @Override
    protected Boolean afterChange(AbstractState nextState) {
        return true;
    }

    @Override
    protected AbstractState nextState() {
        return null;
    }
}
