package this_keyword;

public class KeywordTest {

    private String name;
    private int age;

    public KeywordTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public KeywordTest() {
    //     // use of this() to call a different constructor of the same class
    //     this("John", 27);
    // }

    public KeywordTest() {
        // passing this as a parameter
        printInstance(this);
    }

    private void printInstance(KeywordTest thisKeyword) {
        System.out.println(thisKeyword);
    }

    class ThisInnerClass {

        boolean isInnerClass = true;

        public ThisInnerClass() {
            KeywordTest thisKeyword = KeywordTest.this;
            String outerString = KeywordTest.this.name;
        }
    }
}
