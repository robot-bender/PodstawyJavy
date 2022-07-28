package inheritance_test;

import inheritance.Waitress;


public class InstanceOfPersonUnitTest {

    Waitress w1 = new Waitress("Mary", "mary@domain.com", 22);

    // @Test
    // public void givenWaitressInstance_whenCheckedType_thenIsInstanceOfPerson() {
    //     assertThat(w1).isInstanceOf(Person.class);
    // }
    //
    // @Test
    // public void givenActressInstance_whenCheckedType_thenIsInstanceOfPerson() {
    //     assertThat(new Actress("Susan", "susan@domain.com", 30))
    //             .isInstanceOf(Person.class);
    // }
}
