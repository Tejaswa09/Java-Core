package com.xworkz.xapp;

import com.xworkz.xapp.userregistration.XUserRegistration;
import com.xworkz.xapp.xuserdata.XUserDto;

public class XRunner {
    public static void main(String[] args) {
        XUserDto userDto = new XUserDto();
        userDto.setName("Tejaswa D");
        userDto.setEmail("tejaswad18@gmail.com");
        userDto.setDay(29);
        userDto.setMonth(9);
        userDto.setYear(2003);
        System.out.println(userDto);

        XUserRegistration x = new XUserRegistration();
        x.userRegistration(userDto);

        XUserDto userDto1 = new XUserDto();
        userDto1.setName("Tejaswa D");
        userDto1.setEmail("tejaswad18@gmail.com");
        userDto1.setDay(29);
        userDto1.setMonth(9);
        userDto1.setYear(2003);

        System.out.println(userDto.equals(userDto1));


    }
}
