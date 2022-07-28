package inheritance;

import interfaces.Computer;


public abstract class ComputerBuilder {

    public final Computer buildComputer() {
        addProcessor();
        addMemory();
        return null;
    }

    protected abstract void addMemory();

    protected abstract void addProcessor();
}
