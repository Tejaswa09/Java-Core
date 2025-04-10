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

        System.out.println("Customer Name: " + dto.getCustomerName());
        System.out.println("Table Number: " + dto.getTableNumber());
        System.out.println("Dish Name: " + dto.getDishName());
        System.out.println("Servings: " + dto.getServings());
        System.out.println("Total Amount: " + dto.getTotalAmount());
        System.out.println("Payment Method: " + dto.getPaymentMethod());


        Restaurant restaurant = new Restaurant();
        restaurant.placeOrder(dto);
        restaurant.getDetails();
    }
}
