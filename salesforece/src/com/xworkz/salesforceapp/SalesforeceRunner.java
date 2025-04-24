package com.xworkz.salesforceapp;

import com.xworkz.salesforceapp.salesforcedata.SalesforceUserDto;
import com.xworkz.salesforceapp.salesforceregistration.SalesforceRegistration;
import com.xworkz.salesforceapp.statics.Country;

public class SalesforeceRunner {
    public static void main(String[] args) {
        SalesforceUserDto userDto = new SalesforceUserDto();

        userDto.setFirstName("Tejaswa");
        userDto.setLastName("D");
        userDto.setJobTitle("Web Developer");
        userDto.setEmail("tejaswad18@gmail.com");
        userDto.setNoOfEmployees(5);
        userDto.setMobileNumber(7899455818L);
        userDto.setCountry(Country.India);
        //System.out.println(userDto);

        SalesforceRegistration salesforceRegistration = new SalesforceRegistration();
        salesforceRegistration.registration(userDto);

        SalesforceUserDto userDto1 = new SalesforceUserDto();

        userDto1.setFirstName("Tejaswa");
        userDto1.setLastName("D");
        userDto1.setJobTitle("Web Developer");
        userDto1.setEmail("tejaswad18@gmail.com");
        userDto1.setNoOfEmployees(5);
        userDto1.setMobileNumber(7899455818L);
        userDto1.setCountry(Country.India);

        System.out.println(userDto.equals(userDto1));

    }

}
