package access_modifiers;

public class Public {
    public Public() {
        SuperPublic.defaultMethod(); //available in the same package
    }
}
