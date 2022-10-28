package com.cotemig.trabalhoback.services.task.state;

import java.util.List;

public class ToDo extends AbstractState {
    @Override
    protected String getNameState() {
        return "Pendentes";
    }

    @Override
    protected Boolean change(AbstractState nextState) {
        return null;
    }

    @Override
    protected AbstractState nextState() {
        return new Doing();
    }
}
