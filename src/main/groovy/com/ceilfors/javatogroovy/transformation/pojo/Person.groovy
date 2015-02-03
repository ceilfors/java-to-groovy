package com.ceilfors.javatogroovy.transformation.pojo

import com.ceilfors.javatogroovy.AddressJava
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

/**
 * @author ceilfors
 */
@ToString(includePackage = false)
@EqualsAndHashCode
public class Person {

    String name;
    AddressJava address;
}
