package comparing_objects_in_java;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;


public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private LocalDate birthDate;


    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(final String firstName, final String lastName, LocalDate birthDate) {
        this(firstName, lastName);
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        Objects.equals(birthDate, person.birthDate);
        return firstName.equals(person.firstName) && lastName.equals(person.lastName) && birthDate.equals(person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public int compareTo(final Person o) {
//        return this.lastName.compareTo(o.lastName);
        return Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getBirthDate, Comparator.nullsLast(Comparator.naturalOrder()))
                .compare(this, o);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
