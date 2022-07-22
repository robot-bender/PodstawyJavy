package java_classes_and_objects;

public class FancyCar extends Vehicle implements Driveable {

    @Override
    public String honk() {
        return "beep";
    }

    @Override
    public String drive() {
        return "vroom";
    }
}