package de.javatricks;

import org.apache.commons.lang3.StringUtils;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 20.03.15
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
        String oldValue = null;
        String newValue = null;
        System.out.println(!StringUtils.equals(oldValue, newValue) + "-" + notEquals(oldValue, newValue));

        oldValue = null;
        newValue = "lala";
        System.out.println(!StringUtils.equals(oldValue, newValue) + "-" + notEquals(oldValue, newValue));

        oldValue = "lala";
        newValue = null;
        System.out.println(!StringUtils.equals(oldValue, newValue) + "-" + notEquals(oldValue, newValue));

        oldValue = "lulu";
        newValue = "lala";
        System.out.println(!StringUtils.equals(oldValue, newValue) + "-" + notEquals(oldValue, newValue));

        oldValue = "lala";
        newValue = "lala";
        System.out.println(!StringUtils.equals(oldValue, newValue) + "-" + notEquals(oldValue, newValue));

    }

    private static boolean notEquals(String oldValue, String newValue) {
        return newValue != oldValue
                && (newValue == null || !newValue.equals(oldValue));
    }
}
