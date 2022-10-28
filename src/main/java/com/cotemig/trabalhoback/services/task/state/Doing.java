package com.cotemig.trabalhoback.services.task.state;

public class Doing extends AbstractState {
    @Override
    protected String getNameState() {
        return "Fazendo";
    }

    @Override
    protected Boolean change(AbstractState nextState) {
        return null;
    }

    @Override
    protected AbstractState nextState() {
        return new Done();
    }
}
