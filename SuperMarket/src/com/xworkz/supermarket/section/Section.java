package com.xworkz.supermarket.section;

import com.xworkz.supermarket.product.Products;

public class Section {
    public int sectionId ;
    public String sectionName ;
    public Products[] products ;

    public void getSection() {
        System.out.println("Section Id is :" + sectionId);
        System.out.println("Section name is :" + sectionName);
        System.out.println("Products are :");
        for(Products p : products){
            p.getProducts();
        }
    }

}

