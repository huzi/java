package de.javatricks.java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 11.02.15
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class FirstExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BrewAge", "1516", "Baumgartner");

        for (String item:list){
            System.out.println(item.length());
        }


    }
}
