package access_modifiers;

public class AnotherSubclass extends SuperPublic {
    public AnotherSubclass() {
        SuperPublic.protectedMethod(); //available in subclass. Let's note different package.
    }
}
