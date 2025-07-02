package com.xworksz.xworkzapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarkdDto {
    private String name;
    private String email;
    private String mobileNumber;
    private int marks;


}
