package com.ceilfors.javatogroovy;

/**
 * @author ceilfors
 */
public class AddressJava {

    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressJava address = (AddressJava) o;

        if (countryName != null ? !countryName.equals(address.countryName) : address.countryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return countryName != null ? countryName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Address{" +
                "countryName='" + countryName + '\'' +
                '}';
    }
}
