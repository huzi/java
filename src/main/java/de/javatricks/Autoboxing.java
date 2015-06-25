package de.javatricks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomas18 on 25.06.2015.
 */
public class Autoboxing {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);     //autoboxing
        for(int i:liste){ // unboxing
            System.out.println(i);
        }

    }
}
