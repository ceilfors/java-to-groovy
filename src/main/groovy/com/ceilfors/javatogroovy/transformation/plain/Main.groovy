package com.ceilfors.javatogroovy.transformation.plain

import com.ceilfors.javatogroovy.AddressJava

/**
 * @author ceilfors
 */
public class Main {

    public static void main(String[] args) {
        AddressJava address = new AddressJava();
        address.setCountryName("UK");

        Set<Person> persons = new HashSet<>();
        Person person1 = new Person();
        person1.setName("John");
        person1.setAddress(address);
        persons.add(person1);

        Person person2 = new Person();
        person2.setName("Jane");
        person2.setAddress(address);
        persons.add(person2);

        Person person3 = new Person();
        person3.setName("Jane");
        person3.setAddress(address);
        persons.add(person3);

        for (Person person : persons) {
            System.out.println(person.getName() + " lives in " + person.getAddress().getCountryName());
        }
    }
}
