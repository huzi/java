package de.javatricks.java8.supplier;

import java.security.SecureRandom;
import java.util.function.Supplier;

public class PasswordSupplier implements Supplier {

    private static String ALLOWED_CHARS = "0123456789abcdefghijklmnopqrstuvwABCDEFGHIJKLMNOP";

    private final int length;

    public PasswordSupplier(int length){
        this.length = length;
    }

    @Override
    public Object get() {
        SecureRandom random = new SecureRandom();
        StringBuffer pass = new StringBuffer();
        for (int i = 0; i < length; i++) {
            pass.append(ALLOWED_CHARS.charAt(random.nextInt(ALLOWED_CHARS.length())));
        }
        return pass.toString();
    }
}
