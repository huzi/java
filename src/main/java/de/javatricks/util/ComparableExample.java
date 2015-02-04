package de.javatricks.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by thomas on 03.11.14.
 */
public final class ComparableExample {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Tom", "Jones"),
                new Person("James", "Brown"),
                new Person("Carlos", "Santana"));

        Collections.sort(persons);
        System.out.println(persons);

    }

}

class Person implements Comparable {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{firstName='" + firstName + "', lastName='" + lastName + "'}";
    }

    @Override
    public int compareTo(Object o) {
        Person other = (Person) o;
        if (lastName == null && other.lastName == null) {
            return 0;
        }
        if (this.lastName != null) {
        }
        return this.lastName.compareTo(other.lastName);
    }
}

class MutablePerson extends Person {
    private String firstName;
    private String lastName;

    public MutablePerson(String firstName, String lastName) {
        super(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}