package com.cotemig.trabalhoback.services.task.state;

public class Done extends  AbstractState {
    @Override
    protected String getNameState() {
        return "Feito";
    }

    @Override
    protected Boolean change(AbstractState nextState) {
        return null;
    }

    @Override
    protected AbstractState nextState() {
        return new Closed();
    }
}
