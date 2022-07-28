package super_keyword;

public class SuperSub extends SuperBase {

    String message = "child class";

    public SuperSub() {
        super.printMessage();
        printMessage();
    }

    public SuperSub(String message) {
        super(message);
    }


    @Override
    public void printMessage() {
        System.out.println(message);
    }

    public void getParentMessage() {
        System.out.println(super.message);
    }
}
