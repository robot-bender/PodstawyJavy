package java_classes_and_objects;

public class Car {

    //fields
    private String type;
    private String model;
    private String color;
    private int speed;

    //default constructor
    public Car(){}

    //constructor
    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public Car(String type, String model) {
        // ...
    }

    //methods
    public int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }

    public String honk() {
        return "beep!";
    }

    public String drive() {
        return "vroom";
    }

    //getter
    public String getColor() {
        return color;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    //getter
    public int getSpeed() {
        return speed;
    }

}
