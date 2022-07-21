package comparing_objects_in_java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class Main {

    public static void main(String[] args) {
        Person joe = new Person("Joe", "Portman");
        Person allan = new Person("Allan", "Dale");

        Comparator<Person> compareByFirstNames = Comparator.comparing(Person::getFirstName);

        List<Person> people = new ArrayList<>();
        people.add(joe);
        people.add(allan);

        people.sort(compareByFirstNames);

        assertThat(people).containsExactly(allan, joe);

    }
}
