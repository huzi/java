package de.javatricks;

import com.google.common.base.Splitter;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 22.10.14
 * Time: 16:49
 * To change this template use File | Settings | File Templates.
 */
public class StringSplit {

    public static void main(String[] args) {
        String beers = "Raschhofer, Guiness,Eggenberg";
        String[] beerArray = beers.split(",\\s?");

        System.out.println(Arrays.asList(beerArray));

        Iterable<String> beerList = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(beers);
        System.out.println(beerList);


    }

}
