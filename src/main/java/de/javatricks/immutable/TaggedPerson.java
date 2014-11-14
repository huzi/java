package de.javatricks.immutable;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 14.11.14
 * Time: 07:14
 * To change this template use File | Settings | File Templates.
 */
public class TaggedPerson {
    private String firstName;
    private String lastName;
    private String[] tags;

    public TaggedPerson(String firstName, String lastName, String[] tags){
        this.firstName = firstName;
        this.lastName = lastName;
        this.tags = tags;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String[] getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + Arrays.toString(tags);
    }
}
