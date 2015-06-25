package de.javatricks.string;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 24.04.15
 * Time: 08:56
 * To change this template use File | Settings | File Templates.
 */
public class IntToString {

    public static void main(String[] args) {
        int i = 42;
        String s = String.valueOf(i);
        System.out.println(s);
        s = Integer.toString(i);
        System.out.println(s);
        s = Integer.toString(i, 8);
        System.out.println(s);
        s = Integer.toString(i, 16);
        System.out.println(s);

        Integer integer = new Integer(42);
        String string = integer.toString();
        System.out.println(string);
    }
}
