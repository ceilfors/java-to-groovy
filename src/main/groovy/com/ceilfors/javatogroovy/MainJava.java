package com.ceilfors.javatogroovy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ceilfors
 */
public class MainJava {

    public static void main(String[] args) {
        AddressJava address = new AddressJava();
        address.setCountryName("UK");

        Set<PersonJava> persons = new HashSet<>();
        PersonJava person1 = new PersonJava();
        person1.setName("John");
        person1.setAddress(address);
        persons.add(person1);

        PersonJava person2 = new PersonJava();
        person2.setName("Jane");
        person2.setAddress(address);
        persons.add(person2);

        PersonJava person3 = new PersonJava();
        person3.setName("Jane");
        person3.setAddress(address);
        persons.add(person3);
    }
}
