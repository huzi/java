package de.javatricks.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created by thomas on 11.02.15.
 */
public class StreamExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("BrewAge", "1516", "Baumgartner");
        for (String item : list) {
            System.out.println(item.length());
        }

        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String item) {
                System.out.println(item.length());
            }
        });

        list.stream().forEach((String item) -> System.out.println(item.length()) );

        list.stream().forEach(item -> System.out.println(item.length()) );

        list.stream().forEach(System.out::println);

        List<Integer> lengthList = list.stream()
                .filter(item -> item.length() > 4)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengthList);
    }
}
