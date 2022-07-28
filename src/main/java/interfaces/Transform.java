package interfaces;

public interface Transform {
    void transform();
    default void printSpecs() {
        System.out.println("Transform Specification");
    }
}

abstract class Vehicle implements Transform {}

interface Fly {
    void fly();
}

class Car implements Fly, Transform {

    @Override
    public void transform() {
        System.out.println("I can Transform!!");
    }

    @Override
    public void fly() {
        System.out.println("I can Fly!!");
    }
}