package com.xworkz.restaurantapp.orderprocessing;

import com.xworkz.restaurantapp.restaurantdto.RestaurantOrderDto;

import java.sql.Struct;

public class Restaurant {
        public RestaurantOrderDto dto;
    public void placeOrder(RestaurantOrderDto dto) {
        boolean validated = validateOrder(dto);
        if (validated) {
            System.out.println("Order placed successfully!");
            this.dto = dto;
        }
    }

    public boolean validateOrder(RestaurantOrderDto dto) {
        boolean isValid = false ;
        boolean isNameValid = false;
        boolean isNumberValid =false ;
        boolean isDishValid = false ;
        boolean isServingValid = false ;
        boolean isTotalAmountValid = false ;
        boolean isPaymentMethodValid = false;

        if (dto.getCustomerName() != null && !dto.getCustomerName().isEmpty()) {
            isNameValid = true;
        }else System.out.println("Invalid Customer Name");

        if (dto.getTableNumber() != 0) {
            isNumberValid = true;
        }else System.out.println("Invalid Table Number!");

        if (dto.getDishName() != null && !dto.getDishName().isEmpty()) {
            isDishValid = true;
        }else System.out.println("Invalid Dish Name");

        if (dto.getServings() != 0) {
            isServingValid = true;
        }else System.out.println("Invalid Number of Servings");

        if (dto.getTotalAmount() != 0) {
            isTotalAmountValid = true;
        }else System.out.println("Invalid Total Amount!");

        if (dto.getPaymentMethod() != null) {
            isPaymentMethodValid =true;
        }else System.out.println("Invalid Payment Method!");

        if (isNameValid && isNumberValid && isDishValid  && isServingValid && isTotalAmountValid && isPaymentMethodValid){
            isValid = true ;
        }

        return isValid;
    }

    public void getDetails(){
        System.out.println("Customer Name :"+dto.getCustomerName());
        System.out.println("Table Number :"+dto.getTableNumber());
        System.out.println("Dish Name :"+dto.getDishName());
        System.out.println("Number Of servings :"+dto.getTableNumber());
        System.out.println("Total Amount :"+dto.getTotalAmount());
        System.out.println("Payment Method :"+dto.getPaymentMethod());
    }
}
