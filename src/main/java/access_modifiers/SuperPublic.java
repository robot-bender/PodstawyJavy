package access_modifiers;

public class SuperPublic {
    static void defaultMethod() {
        //...
    }

    public static void publicMethod() {
        //...
    }

    static private void privateMethod() {
        //...
    }

    private void anotherPrivateMethod() {
        privateMethod(); //available in the same class only
    }

    static protected void protectedMethod() {
        //...
    }

}
