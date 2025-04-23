package com.xworkz.restaurantapp.restaurantdto;

import com.xworkz.restaurantapp.constants.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter

public class RestaurantOrderDto {

    private String customerName;
    private int tableNumber;
    private String dishName;
    private int servings;
    private double totalAmount;
    private PaymentMethod paymentMethod;

//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setTableNumber(int tableNumber) {
//        this.tableNumber = tableNumber;
//    }
//
//    public int getTableNumber() {
//        return tableNumber;
//    }
//
//    public void setDishName(String dishName) {
//        this.dishName = dishName;
//    }
//
//    public String getDishName() {
//        return dishName;
//    }
//
//    public void setServings(int servings) {
//        this.servings = servings;
//    }
//
//    public int getServings() {
//        return servings;
//    }
//
//    public void setTotalAmount(double totalAmount) {
//        this.totalAmount = totalAmount;
//    }
//
//    public double getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void setPaymentMethod(PaymentMethod paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public PaymentMethod getPaymentMethod() {
//        return paymentMethod;
//    }
@Override
public String toString() {
    return "RestaurantOrderDto(Customer Name: " + getCustomerName() + "\n" +
            "Table Number: " + getTableNumber() + "\n" +
            "Dish Name: " + getDishName() + "\n" +
            "Servings: " + getServings() + "\n" +
            "Total Amount: " + getTotalAmount() + "\n" +
            "Payment Method: " + getPaymentMethod() + ")";
}

}

