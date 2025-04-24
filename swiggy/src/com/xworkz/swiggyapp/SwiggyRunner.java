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

        SwiggyDTO dto1 = new SwiggyDTO();
        dto1.setRestaurantName("Tandoori Nights");
        dto1.setDeliveryTime(30);
        dto1.setRating(4.2);
        dto1.setItemCount(5);

        System.out.println(dto.equals(dto1));
    }
}


