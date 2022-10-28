package com.cotemig.trabalhoback.services.task.state;

public class Closed extends AbstractState {
    @Override
    protected String getNameState() {
        return "Não feito";
    }

    @Override
    protected Boolean change(AbstractState nextState) {
        return null;
    }

    @Override
    protected AbstractState nextState() {
        return null;
    }
}
