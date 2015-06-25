package de.javatricks.easymock;

import de.javatricks.immutable.Person;

/**
 * Created by thomas18 on 11.05.2015.
 */
public class PersonService {

    private final DataSource<Person> dataSource;

    public PersonService(DataSource<Person> dataSource){
        this.dataSource = dataSource;
    }

    public Person persistPerson(Person p){
        return dataSource.persist(p);
    }
}
