package de.javatricks.array;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by thomas on 29.10.14.
 */
public class SortArray {

    public static void main(String[] args) {
        int[] intArray = {1,5,3,7,2,9};

        Arrays.sort(intArray);

        System.out.println(Arrays.toString(intArray));

        Person[] persons = {
                new Person("Tom", "Jones"),
                new Person("James", "Brown"),
                new Person("Carlos", "Santana")};

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person first, Person second) {
                return first.getLastName().compareTo(second.getLastName());
            }
        });
        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person first, Person second) {
                return first.getFirstName().compareTo(second.getFirstName());
            }
        });
        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons, (Person first, Person second)->first.getLastName().compareTo(second.getLastName()));
        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons, (Person first, Person second)->first.getFirstName().compareTo(second.getFirstName()));
        System.out.println(Arrays.toString(persons));
    }

}

class Person{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
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
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
