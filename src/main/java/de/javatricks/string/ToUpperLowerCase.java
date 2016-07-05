/*
 * Copyright (c) CompuGroup Medical Software GmbH,
 * This software is the confidential and proprietary information of
 * CompuGroup Medical Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGroup Medical Software GmbH.
 */
package de.javatricks.string;

import java.util.Locale;

/**
 * Created by thomas18 on 08.06.2016.
 */
public class ToUpperLowerCase {

    public static void main(String[] args) {
        String toUpper = "String in Großbuchstaben konvertieren üöä.";
//        System.out.println(toUpper.toUpperCase());
//        System.out.println(toUpper.toUpperCase(Locale.GERMANY));
        String toLower = "String in Kleinbuchstaben konvertieren öäüß.";
//        System.out.println(toLower.toLowerCase());
//        System.out.println(toLower.toLowerCase(Locale.GERMAN));

        String input = toUpper;

        stringToUpper(input);

        input = toLower;
        System.out.println(stringToLower("Groß-/Kleinbuchstaben"));
        System.out.println(stringToLower("xüäöx"));
        System.out.println(stringToLower("123ß"));
    }

    private static String stringToLower(String input) {
        StringBuilder sb = new StringBuilder(input.toLowerCase(Locale.forLanguageTag("de_DE")));
        sb.append(" - ");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c))
                sb.append(Character.toLowerCase(c));
            else
                sb.append(c);
        }
        return sb.toString();
    }

    private static String stringToUpper(String input) {
        StringBuilder sb = new StringBuilder(input.toUpperCase(Locale.GERMAN));
        sb.append(" - ");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
