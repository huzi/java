package de.javatricks.list;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 23.02.15
 * Time: 12:34
 * To change this template use File | Settings | File Templates.
 */
public class ShuffleExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Haydnbräu", "Hirter", "Trumer", "Bevog");
        Collections.shuffle(list);
        System.out.println(list);
        // [Hirter, Trumer, Bevog, Haydnbräu]

        SecureRandom random = new SecureRandom();
        Collections.shuffle(list, random);
        System.out.println(list);

    }
}
