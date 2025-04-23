package com.xwrokz.xworkzapp.xworkzmock;

import com.xwrokz.xworkzapp.xworkzuserdata.XworkzUserDto;

public class XworkzMockResult {
    public XworkzUserDto dto;

    public void userRegistration(XworkzUserDto dto) {
        boolean isUserValidated = validate(dto);
        if (isUserValidated) {
            System.out.println("The mock Results are: ");
            this.dto = dto;
        }
    }

    public boolean validate(XworkzUserDto dto) {
        boolean isUserValid = false;

        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isMobileNoValid = false;
        boolean isResultValid = false;

        if (dto.getName() != null && !dto.getName().isEmpty()) {
            isNameValid = true;
        } else System.out.println("Invalid Name");

        if (dto.getMail() != null && !dto.getMail().isEmpty()) {
            isEmailValid = true;
        } else System.out.println("Inavlid Mail");

        if (dto.getMobileNumber() != 0) {
            isMobileNoValid = true;
        }else System.out.println("Invalid MObile Number");

        if (dto.getResult() >= 10 && dto.getResult() <= 100) {
            isResultValid = true;
        }else System.out.println("Invalid Result ");

        if (isNameValid && isEmailValid && isResultValid && isMobileNoValid ){
            isUserValid =true ;
        }

        return isUserValid;
    }

    public void getMockResults(){
        System.out.println("Name : "+dto.getName());
        System.out.println("Email : "+dto.getMail());
        System.out.println("Mobile No :"+dto.getMobileNumber());
        System.out.println("Results : "+dto.getResult());
    }
}
