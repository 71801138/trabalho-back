package com.cotemig.trabalhoback.services.task.state;

abstract class AbstractState {

    protected Boolean changeStatus(AbstractState nextState) throws Exception {
        if(nextState != this.previousState()){
            throw  new Exception("Erro, você não pode atualizar para esse status");
        }

    }

    protected abstract Boolean change();

    protected abstract AbstractState nextState();

    protected abstract AbstractState previousState();

}
