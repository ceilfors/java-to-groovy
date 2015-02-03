package com.ceilfors.javatogroovy.transformation.plain

import com.ceilfors.javatogroovy.AddressJava

/**
 * @author ceilfors
 */
public class Person {

    private String name;

    private AddressJava address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressJava getAddress() {
        return address;
    }

    public void setAddress(AddressJava address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this.is(o)) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (address != null ? !address.equals(person.address) : person.address != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
