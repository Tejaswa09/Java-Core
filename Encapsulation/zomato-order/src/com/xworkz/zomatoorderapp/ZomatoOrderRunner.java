package com.xworkz.zomatoorderapp;

import com.xworkz.zomatoorderapp.zomatoorder.ZomatoTakeOrder;
import com.xworkz.zomatoorderapp.zomatoorderdata.ZomatoOrderDto;

public class ZomatoOrderRunner {
    public static void main(String[] args) {
        ZomatoOrderDto zomatoOrderDto = new ZomatoOrderDto();

        zomatoOrderDto.setOrderNo(1);
        zomatoOrderDto.setItemName("Chicken Tandoori");
        zomatoOrderDto.setNoOfItems(2);
        zomatoOrderDto.setAddress("site number 10, pathalam layout, whitefield-560067");

        ZomatoTakeOrder zomatoTakeOrder = new ZomatoTakeOrder();
        zomatoTakeOrder.takeOrder(zomatoOrderDto);
        zomatoTakeOrder.getDetails();
    }
}
