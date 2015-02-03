package com.ceilfors.javatogroovy.transformation

import com.ceilfors.javatogroovy.AddressJava
import com.ceilfors.javatogroovy.PersonJava
import org.junit.Test

/**
 * @author ceilfors
 */
class PersonJavaTest {

    @Test
    void "Test name setting successfully"() {
        PersonJava person = new PersonJava(
                name: "John",
                address: new AddressJava(countryName: "UKtypo")
        )

        assert person.address.countryName == "UK"
    }
}
