package de.javatricks.java8.supplier;

import java.util.function.Supplier;

/**
 * Created by thomas on 07.02.15.
 */
public class UserFactory {

    private Supplier<String> passwordSupplier;

    public UserFactory(Supplier<String> supplier){
        this.passwordSupplier = supplier;
    }

    public User createUser(String username){
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordSupplier.get());
        return user;
    }
}
