package org.hieunguyen.builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;
    private UserWebDTO userWebDTO = null;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        this.birthday = date;
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public UserDTO build() {
        String name = firstName + " " + lastName;
        int years = Period.between(birthday, LocalDate.now()).getYears();
        userWebDTO = new UserWebDTO(name, address.toString(), String.valueOf(years));
        return userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userWebDTO;
    }
}
