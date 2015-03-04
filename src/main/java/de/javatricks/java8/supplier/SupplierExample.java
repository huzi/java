package de.javatricks.java8.supplier;

import java.util.function.Supplier;

/**
 * Created by thomas on 29.01.15.
 */
public class SupplierExample {

    public static void main(String[] args) {
        UserFactory webUserFactory = new UserFactory(new PasswordSupplier(8));
        UserFactory cardUseractory = new UserFactory(new PinSupplier(4));
        System.out.println(webUserFactory.createUser("user1"));
        // Ausgabe: [username:user1 , password:FlBCqfI0]
        System.out.println(cardUseractory.createUser("user2"));
        // Ausgabe: [username:user2 , password:8936]





        UserFactory factory = new UserFactory(()->"defaultPassword");
        System.out.println(factory.createUser("username"));
        for (int i = 0; i < 100; i++){
            System.out.println(factory.createUser("username"));
        }
    }

    private static User createUser(String username, Supplier<String> passwordSupplier){
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordSupplier.get());
        return user;
    }
}
