package FunctionalInterfaceExample;

import APIExample.Person;

public class PersonFactoryTest {
    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;

        Person person = personFactory.create("고길동", 46);

        System.out.println("person = " + person);
    }
}
