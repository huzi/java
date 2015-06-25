package de.javatricks.easymock;

import de.javatricks.immutable.Person;
import org.easymock.EasyMock;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by thomas18 on 11.05.2015.
 */
@Test
public class PersonServiceTest {

    PersonService personService;

    private DataSource<Person> mock;

    @BeforeTest
    public void setUp() {
        mock = EasyMock.createMock(DataSource.class);
        personService = new PersonService(mock);
    }


    public void testPersist(){
        Person person = new Person("Max", "Muster");
        EasyMock.expect(mock.persist(person)).andReturn(null);
        EasyMock.replay(mock);
        Person retVal = personService.persistPerson(person);
        Assert.assertEquals(retVal, person);
    }
}
