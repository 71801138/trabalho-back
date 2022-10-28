package com.cotemig.trabalhoback.services.task.state;


abstract class AbstractState {

    public Boolean changeToNextState(AbstractState nextState) throws Exception {
        if(nextState != this.nextState()) {
            throw new Exception("Erro, você não pode atualizar para esse status");
        }
        if(this.change(nextState)){
            this.generateLog(nextState);
            return  true;
        }
        return false;
    }

    private void generateLog(AbstractState nextState){
        System.out.println("Implementação do Log");
    }
    protected abstract String getNameState();

    protected abstract Boolean change(AbstractState nextState);

    protected abstract AbstractState nextState();


}
