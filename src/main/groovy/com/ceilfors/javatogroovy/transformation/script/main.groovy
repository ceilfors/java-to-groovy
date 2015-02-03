package com.ceilfors.javatogroovy.transformation.script

import com.ceilfors.javatogroovy.AddressJava

/**
 * @author ceilfors
 */
AddressJava address = new AddressJava(countryName: "UK");

Set<Person> persons = [
        new Person(name: "John", address: address),
        new Person(name: "Jane", address: address),
        new Person(name: "Jane", address: address),
] as Set

persons.each { person ->
    println "$person.name lives in $person.address.countryName";
}
