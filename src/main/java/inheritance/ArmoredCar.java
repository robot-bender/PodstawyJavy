package inheritance;

public class ArmoredCar extends Car implements Floatable, Flyable {
    int bulletProofWindows;
    void remoteStartCar() {
        // this vehicle can be started by using a remote control
    }

    public String registerModel() {
        return model;
    }

    @Override
    public void floatOnWater() {
        System.out.println("I can float!");
    }

    @Override
    public void repair() {
        Floatable.super.repair();
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }

    public void aMethod() {
        // System.out.println(duration); // won't compile
        System.out.println(Floatable.duration); // outputs 10
        System.out.println(Flyable.duration); // outputs 20
    }

    private String model;
    public String getAValue() {
        return super.model;   // returns value of model defined in base class Car
        // return this.model;   // will return value of model defined in ArmoredCar
        // return model;   // will return value of model defined in ArmoredCar
    }
}
