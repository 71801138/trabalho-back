package com.cotemig.trabalhoback.services.task.state;

import java.util.ArrayList;
import java.util.List;

public class Backlog extends AbstractState {

    @Override
    protected String getNameState() {
        return "Backlog";
    }

    @Override
    protected Boolean change(AbstractState nextState) {
        return null;
    }

    @Override
    protected AbstractState nextState() {
        return new ToDo();
    }
}
