package de.javatricks.java8;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * Created by thomas on 26.01.15.
 */
public class MethodReferences {

    private static Comparator<String> lowerCaseComparator = (s1,s2)-> s1.toLowerCase().compareTo(s2.toLowerCase());

    public static void main(String[] args) {


        int result;
        result = compareStrings("BrewAge", "brewage", lowerCaseComparator);
        System.out.println(result);

        result = compareStrings("BrewAge", "brewage", MethodReferences::stringsToNonsense);
        System.out.println(result);

        result = stringLength(()->"");
        System.out.println(result);

        result = stringLength(()->"fixed string");
        System.out.println(result);

        //result = stringLength(MethodReferences::createPassword);
        System.out.println(result);

        Supplier<String> fixedStringSupplier = () -> "fixed string";
        result = stringLength(fixedStringSupplier);
        System.out.println(result);

        System.out.println(createPassword(4));
        System.out.println(createPin(4));

    }

    public static int stringLength(Supplier<String> supplier){
        return supplier.get().length();
    }

    private static int compareStrings(String s1, String s2, Comparator<String> comparator) {
        return comparator.compare(s1, s2);
    }

    private static int stringsToNonsense(String s1, String s2) {
        return 123_123;
    }

    public static String createPassword(int length){
        final String allowedChars = "0123456789abcdefghijklmnopqrstuvwABCDEFGHIJKLMNOP!§$%&?*+#";
        SecureRandom random = new SecureRandom();
        StringBuffer pass = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            pass.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
        }
        return pass.toString();
    }

    public static String createPin(int length){
        SecureRandom random = new SecureRandom();
        StringBuffer pass = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            pass.append(random.nextInt(10));
        }
        return pass.toString();
    }

}
