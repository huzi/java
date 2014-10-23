package de.javatricks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by thomas on 20.10.14.
 */
public class ArrayToList {

    public static void main(String[] args) {

        String[] stringArray = createArray();
        List<String> list = Arrays.asList(stringArray);

        System.out.println(list);
        try{
            list.add("Egger");
        }catch (Exception e){
            e.printStackTrace();
        }
        list = new ArrayList<String>(Arrays.asList(stringArray));

        System.out.println(list);
        list.add("Egger");
        System.out.println(list);
    }

    private static String[] createArray() {
        String[] stringArray = new String[]{"Raschhofer", "Guiness", "Eggenberg", "Ottakringer", "Stiegl"};

        return stringArray;
    }
}
