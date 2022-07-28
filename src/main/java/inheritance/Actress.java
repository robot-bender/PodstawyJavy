package inheritance;

public class Actress extends Person {

    public Actress() {
        super();
    }

    public String readScript(String movie) {
        return "Reading the script of " + movie;
    }

    // additional methods/constructors
}
