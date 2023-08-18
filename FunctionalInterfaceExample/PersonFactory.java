package FunctionalInterfaceExample;

import APIExample.Person;

@FunctionalInterface
public interface PersonFactory {
    public Person create(String name,int age);
}
