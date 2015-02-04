package de.javatricks.java8.supplier;

import java.security.SecureRandom;
import java.util.function.Supplier;

public class PinSupplier implements Supplier {

    private final int length;

    public PinSupplier(int length){
        this.length = length;
    }

    @Override
    public Object get() {
        SecureRandom random = new SecureRandom();
        StringBuffer pass = new StringBuffer();
        for (int i = 0; i < length; i++) {
            pass.append(random.nextInt(10));
        }
        return pass.toString();
    }
}
