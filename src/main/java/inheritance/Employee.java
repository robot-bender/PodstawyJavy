package inheritance;

public class Employee {
    private String name;
    private Car car;

    // standard constructor

    Employee e1 = new Employee("Shreya", new ArmoredCar());
    // Employee e2 = new Employee("Paul", new SpaceCar());
    // Employee e3 = new Employee("Pavni", new BMW());

    public Employee(final String shreya, final ArmoredCar armoredCar) {
    }
}
