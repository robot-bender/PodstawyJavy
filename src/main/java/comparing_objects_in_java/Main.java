package comparing_objects_in_java;

import com.google.common.collect.ComparisonChain;

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

        // String a = new String("Hello!");
        // String b = new String("Hello World!");

        // assertThat(ObjectUtils.notEqual(a, b)).isTrue();
        // assertThat(ObjectUtils.compare(a, b)).isNegative();

        // assertThat(Objects.equals(a, b)).isTrue();
        // assertThat(Ints.compare(1, 2)).isNegative();

        Person natalie = new Person("Natalie", "Portman");

        int comparisonResult = ComparisonChain.start()
                .compare(natalie.getLastName(), allan.getLastName())
                .compare(natalie.getFirstName(), allan.getFirstName())
                .result();

        assertThat(comparisonResult).isPositive();

    }
}
