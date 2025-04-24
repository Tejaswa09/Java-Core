package com.xworkz.restaurantapp;

import com.xworkz.restaurantapp.constants.PaymentMethod;
import com.xworkz.restaurantapp.restaurantdto.RestaurantOrderDto;
import com.xworkz.restaurantapp.orderprocessing.Restaurant;

public class RestaurantRunner {

    public static void main(String[] args) {

        RestaurantOrderDto dto = new RestaurantOrderDto();
        dto.setCustomerName("Tejaswa");
        dto.setTableNumber(7);
        dto.setDishName("Chicken Butter Masala");
        dto.setServings(2);
        dto.setTotalAmount(550.00);
        dto.setPaymentMethod(PaymentMethod.CARD);
        System.out.println(dto);


        System.out.println(dto);
        Restaurant restaurant = new Restaurant();
        restaurant.placeOrder(dto);
//        restaurant.getDetails();

        RestaurantOrderDto dto1 = new RestaurantOrderDto();
        dto1.setCustomerName("Tejaswa");
        dto1.setTableNumber(7);
        dto1.setDishName("Chicken Butter Masala");
        dto1.setServings(2);
        dto1.setTotalAmount(550.00);
        dto1.setPaymentMethod(PaymentMethod.CARD);

        System.out.println(dto.equals(dto1));
    }
}
