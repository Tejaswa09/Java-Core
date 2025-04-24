package com.xwrokz.xworkzapp;

import com.xwrokz.xworkzapp.xworkzmock.XworkzMockResult;
import com.xwrokz.xworkzapp.xworkzuserdata.XworkzUserDto;

public class XworkzRunner {
    public static void main(String[] args) {
        XworkzUserDto dto = new XworkzUserDto();

        dto.setName("Tejaswa D");
        dto.setMail("tejaswa.xworkz@outlook.com");
        dto.setMobileNumber(7899455818L);
        dto.setResult(55);
        System.out.println(dto);

        XworkzMockResult xworkzMockResult = new XworkzMockResult();
        xworkzMockResult.userRegistration(dto);
        xworkzMockResult.getMockResults();

        XworkzUserDto dto1 = new XworkzUserDto();

        dto1.setName("Tejaswa D");
        dto1.setMail("tejaswa.xworkz@outlook.com");
        dto1.setMobileNumber(7899455818L);
        dto1.setResult(55);
        System.out.println(dto.equals(dto1));
    }
}





