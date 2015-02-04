package de.javatricks.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by thomas on 03.11.14.
 */
public class ComparatorExample {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Tom", "Jones"),
                new Person("James", "Brown"),
                new Person("Carlos", "Santana"));

        Collections.sort(persons, new FirstNameComparator());
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                Person first = (Person) o1;
                Person second = (Person) o2;
                return first.getFirstName().compareTo(second.getFirstName());
            }
        });
        System.out.println(persons);

    }
}

class FirstNameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Person first = (Person) o1;
        Person second = (Person) o2;
        return first.getFirstName().compareTo(second.getFirstName());
    }
}

