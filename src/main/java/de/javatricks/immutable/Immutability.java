package de.javatricks.immutable;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 14.11.14
 * Time: 07:16
 * To change this template use File | Settings | File Templates.
 */
public class Immutability {

    public static void main(String[] args) {
        TaggedPerson p = new TaggedPerson("Max", "Meier", new String[]{"student", "java", "ruby"});
        System.out.println(p.toString());
        p.getTags()[0] = "arbeiter";
        System.out.println(p.toString());
    }
}
