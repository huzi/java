package de.javatricks.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by thomas on 18.02.15.
 */
public class SortExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Freistädter");
        list.add("Zipfer");
        list.add("Schnaitl");
        list.add("Brauhaus Gusswerk");

        Collections.sort(list);

        System.out.println(list);
        // [Brauhaus Gusswerk, Freistädter, Schnaitl, Zipfer]

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });

        System.out.println(list);
        // [Zipfer, Schnaitl, Freistädter, Brauhaus Gusswerk]
    }
}
