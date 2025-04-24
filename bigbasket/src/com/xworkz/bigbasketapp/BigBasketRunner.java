package com.xworkz.bigbasketapp;

class BigBasketRunner {
    public static void main(String[] args) {
        BigBasketDTO dto = new BigBasketDTO();
        dto.setItemName("Tomato");
        dto.setQuantity(2);
        dto.setPricePerUnit(25.0);
        dto.setDeliverySlot("Morning 8-10 AM");
        //System.out.println(dto);

        BigBasketDTO dto1 = new BigBasketDTO();
        dto1.setItemName("Tomato");
        dto1.setQuantity(2);
        dto1.setPricePerUnit(25.0);
        dto1.setDeliverySlot("Morning 8-10 AM");

        System.out.println(dto.equals(dto1));
    }
}
