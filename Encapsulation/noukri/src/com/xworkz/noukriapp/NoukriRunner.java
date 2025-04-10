package com.xworkz.noukriapp;

import com.xworkz.noukriapp.noukriuserdata.NoukriUserDto;
import com.xworkz.noukriapp.noukriuserregistration.NoukriUserRegistration;
import com.xworkz.noukriapp.statics.WorkStatus;

public class NoukriRunner {
    public static void main(String[] args) {
        NoukriUserDto userDto = new NoukriUserDto();

        userDto.setFullName("Tejaswa");
        userDto.setEmail("tejaswad18@gmail.com");
        userDto.setPassword("Tejaswa@123");
        userDto.setMobileNumber(7899455818L);
        userDto.setWorkStatus(WorkStatus.fresher);

        NoukriUserRegistration noukri = new NoukriUserRegistration();
        noukri.userRegistration(userDto);
        noukri.getUserData();
    }

}
