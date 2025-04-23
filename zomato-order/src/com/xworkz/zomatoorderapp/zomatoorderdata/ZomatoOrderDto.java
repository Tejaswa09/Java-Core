package com.xworkz.zomatoorderapp.zomatoorderdata;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZomatoOrderDto {
    private int orderNo;
    private String itemName;
    private int noOfItems;
    private String address;

    //    public void setOrderNo(int orderNo){
//        this.orderNo = orderNo;
//    }
//
//    public int getOrderNo(){
//        return orderNo;
//    }
//
//    public void setNoOfItems(int noOfItems) {
//        this.noOfItems = noOfItems;
//    }
//
//    public int getNoOfItems(){
//        return noOfItems;
//    }
//
//    public void setItemName(String itemName){
//        this.itemName = itemName ;
//    }
//
//    public String getItemName(){
//        return itemName;
//    }
//
//    public void setAddress(String address){
//        this.address = address ;
//    }
//
//    public String getAddress(){
//        return address;
//    }
    @Override
    public String toString() {
        return "OrderDto(Order No: " + getOrderNo() + "\n" +
                "Item Name: " + getItemName() + "\n" +
                "Number of Items: " + getNoOfItems() + "\n" +
                "Address: " + getAddress() + ")";
    }


}
