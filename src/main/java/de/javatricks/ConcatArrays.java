package de.javatricks;

import com.google.common.collect.ObjectArrays;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatArrays {

    public static void main(String[] args) {

        String[] beer = {"Zwickl", "Porter", "Weizen", "Pils"};
        String[] wine = {"Grüner Veltliner", "Chardonnay", "Blauburgunder", "Merlot"};
        String[] drinks;

        drinks = ArrayUtils.addAll(beer, wine);
        System.out.println(Arrays.asList(drinks));

        drinks = concatArrays(beer, wine);
        System.out.println(Arrays.asList(drinks));

        drinks = ObjectArrays.concat(beer, wine, String.class);
        System.out.println(Arrays.asList(drinks));

        drinks = Stream.concat(Arrays.stream(beer), Arrays.stream(wine)).toArray(String[]::new);
        System.out.println(Arrays.asList(drinks));
    }

    public static <T> T[] concatArrays(T[] one, T[] two) {
        T[] result = Arrays.copyOf(one, one.length + two.length);
        System.arraycopy(two, 0, result, one.length, two.length);
        return result;
    }
}
