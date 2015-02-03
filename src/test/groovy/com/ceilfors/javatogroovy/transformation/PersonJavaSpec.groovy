package com.ceilfors.javatogroovy.transformation

import com.ceilfors.javatogroovy.AddressJava
import com.ceilfors.javatogroovy.PersonJava
import spock.lang.Specification

/**
 * @author ceilfors
 */
class PersonJavaSpec extends Specification {

    def "Test set name successfully"() {
        // given:

        when:
        PersonJava person = new PersonJava(
                name: "John",
                address: new AddressJava(countryName: "aaUKtypo")
        )

        then:
        person.name == "John"
        person.address.countryName == "UK"
    }

    def "Data table specification"() {
        // setup:
        expect:
        a * a == b

        where:
        a   || b
        1   || 1
        2   || 4
        3   || 9
        10  || 100
        100 || 10001
    }
}
