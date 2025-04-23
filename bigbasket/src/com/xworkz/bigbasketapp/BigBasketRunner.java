package com.xworkz.bigbasketapp;

class BigBasketRunner {
    public static void main(String[] args) {
        BigBasketDTO dto = new BigBasketDTO();
        dto.setItemName("Tomato");
        dto.setQuantity(2);
        dto.setPricePerUnit(25.0);
        dto.setDeliverySlot("Morning 8-10 AM");
        System.out.println(dto);
    }
}
