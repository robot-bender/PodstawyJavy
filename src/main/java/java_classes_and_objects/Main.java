package java_classes_and_objects;

public class Main {

    public static void main(String[] args) {
        //objects
        Car focus = new Car("Ford", "Focus", "red");
        Car auris = new Car("Toyota", "Auris", "blue");
        Car golf = new Car("Volkswagen", "Golf", "green");

        //invoking a method
        focus.increaseSpeed(10);
        auris.increaseSpeed(20);
        golf.increaseSpeed(30);

        FancyCar car = new FancyCar();
    }
}
