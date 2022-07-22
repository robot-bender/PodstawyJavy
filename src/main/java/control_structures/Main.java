package control_structures;


public class Main {

    public static void main(String[] args) {
        int count = 3;

        if (count>2) {
            System.out.println("Count is higher than 2");
        } else {
            System.out.println("Count is lower or equal than 2");
        }

        //ternary operator as a shorthand expression that works like an if/else statement.
        System.out.println(count > 2 ? "Count is higher than 2" : "Count is lower or equal than 2");

        //switch
        switch (count) {
            case 0:
                System.out.println("Count is equal to 0");
                break;
            case 1:
                System.out.println("Count is equal to 1");
                break;
            default:
                System.out.println("Count is either negative, or higher than 1");
                break;
        }

        //loops
        for (int i = 1; i < 10; i++) {
            methodToRepeat();
        }

        System.out.println("--------");

        int whileCounter = 1;
        while (whileCounter <= 5) {
            System.out.print("a teraz ");
            methodToRepeat();
            whileCounter++;
        }
    }

    private static void methodToRepeat() {
        System.out.println("powtarzaj mnie");
    }
    
    //break
    // List<String> names = getNameList();
    // String name = "John Doe";
    // int index = 0;
    // for ( ; index < names.length; index++) {
    //     if (names[index].equals(name)) {
    //         break;
    //     }
    // }

    //continue
    // List<String> names = getNameList();
    // String name = "John Doe";
    // String list = "";
    // for (int i = 0; i < names.length; i++) {
    //     if (names[i].equals(name)) {
    //         continue;
    //     }
    //     list += names[i];
    // }
}
