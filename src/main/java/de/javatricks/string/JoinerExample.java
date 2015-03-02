package de.javatricks.string;

import com.google.common.base.Joiner;
import de.javatricks.immutable.Person;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 02.03.15
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
public class JoinerExample {

    public static void main(String[] args) {
        Person p1 = new Person("Thomas", "Lemmé");
        Person p2 = null;
        String joined = Joiner.on(",").skipNulls().join(Objects.toString(p1, null), Objects.toString(p2, null));
        System.out.println(joined);

    }


}
