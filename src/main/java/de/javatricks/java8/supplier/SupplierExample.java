package de.javatricks.java8.supplier;

import java.util.function.Supplier;

/**
 * Created by thomas on 29.01.15.
 */
public class SupplierExample {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.println(new PinSupplier(5).get());
        }
    }

    private static User createUser(String username, Supplier<String> passwordSupplier){
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordSupplier.get());
        return user;
    }
}
