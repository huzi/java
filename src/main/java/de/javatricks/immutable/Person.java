package de.javatricks.immutable;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 14.11.14
 * Time: 07:11
 * To change this template use File | Settings | File Templates.
 */
public class Person{
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
}
