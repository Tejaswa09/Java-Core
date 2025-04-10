package com.xworkz.zomatoorderapp.zomatoorder;

import com.xworkz.zomatoorderapp.zomatoorderdata.ZomatoOrderDto;

public class ZomatoTakeOrder {
    public ZomatoOrderDto dto;

    public void takeOrder(ZomatoOrderDto dto){
        boolean isOrderVerified = varify(dto);

        if(isOrderVerified){
            System.out.println("Order taken");
            this.dto =dto;
        }
    }

    public boolean varify(ZomatoOrderDto dto){
        boolean isOrderValid = false ;
        boolean isOrderNoValid = false ;
        boolean isItemValid = false ;
        boolean isNoItemValid = false ;
        boolean isAdressValid = false ;

        if(dto.getOrderNo() != 0){
            isOrderNoValid = true ;

        }else System.out.println("Inavalid OrderNo");

        if (dto.getItemName()!=null && !dto.getItemName().isEmpty()){
            isItemValid = true ;
        }else System.out.println("Invalid Item Name");

        if (dto.getNoOfItems()!=0){
            isNoItemValid = true ;
        }else System.out.println("Inavalid No item");

        if (dto.getAddress()!= null && !dto.getAddress().isEmpty()){
            isAdressValid = true ;
        }else System.out.println("Invalid Address");

        if (isOrderNoValid && isItemValid && isNoItemValid && isAdressValid){
            isOrderValid=true;
        }else System.out.println("Something Unexpected happen");

        return isOrderValid;

    }

    public void getDetails(){
        System.out.println("Order No :"+dto.getOrderNo());
        System.out.println("Item :"+dto.getItemName());
        System.out.println("No Of Items :"+dto.getNoOfItems());
        System.out.println("Address :"+dto.getAddress());
    }
}
