package de.javatricks.string;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 20.02.15
 * Time: 09:46
 * To change this template use File | Settings | File Templates.
 */
public class StringBuilderBuffer {

    public static void main(String[] args) {

        String s = "";
        for (int i = 1; i < 10; i++) {
            s += i;
        }
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());
    }
}
