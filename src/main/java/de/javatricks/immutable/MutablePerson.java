package de.javatricks.immutable;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 14.11.14
 * Time: 07:11
 * To change this template use File | Settings | File Templates.
 */
public class MutablePerson extends Person {
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
