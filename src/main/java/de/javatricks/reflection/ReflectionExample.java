package de.javatricks.reflection;

import de.javatricks.immutable.Person;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by thomas on 04.03.15.
 */
public class ReflectionExample {

    public static void main(String[] args) {
        Class personClass = Person.class;
        Field[] fields = personClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }
    }
}
