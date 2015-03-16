package de.javatricks.list;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by thomas on 15.03.15.
 */
public class SelectRandom {

    public static void main(String[] args) {
        List<String> beerList = Arrays.asList("Fürstenbräu", "Eule", "Flecks", "Bevog", "Gösser");
        String beer = beerList.get(new Random().nextInt(beerList.size()));
        System.out.println(beer);

        getRandomItem(beerList);

    }

    private static Random RANDOM = null;
    private static <T> T getRandomItem(List<T> list) {
        if(RANDOM == null){
            RANDOM = new Random();
        }
        T item = list.get(RANDOM.nextInt(list.size()));
        return item;
    }

}
