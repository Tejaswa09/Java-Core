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
        System.out.println(userDto);

        SalesforceRegistration salesforceRegistration = new SalesforceRegistration();
        salesforceRegistration.registration(userDto);



    }

}
