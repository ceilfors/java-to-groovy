package com.ceilfors.javatogroovy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ceilfor
 */
public class PersonJavaTest {

    /**
     * Test name setting successfully.
     */
    @Test
    public void testSetName() {
        AddressJava address = new AddressJava();
        address.setCountryName("UKtypo");

        PersonJava person = new PersonJava();
        person.setName("John");
        person.setAddress(address);

        assertEquals("UK", person.getAddress().getCountryName());
    }

}