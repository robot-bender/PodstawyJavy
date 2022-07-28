package super_keyword;

public class SuperBase {

    String message = "super class";

    public SuperBase() {
        printMessage();
    }

    public SuperBase(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
