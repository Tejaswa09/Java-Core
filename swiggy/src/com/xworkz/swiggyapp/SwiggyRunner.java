package com.xworkz.swiggyapp;
import com.xworkz.swiggyapp.SwiggyDTO;

class SwiggyRunner {
    public static void main(String[] args) {
        SwiggyDTO dto = new SwiggyDTO();
        dto.setRestaurantName("Tandoori Nights");
        dto.setDeliveryTime(30);
        dto.setRating(4.2);
        dto.setItemCount(5);
        System.out.println(dto);
    }
}


