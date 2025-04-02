package com.xworkz.supermarket.product;

public class Products {

    public int productId ;
    public String productName ;
    public String productCompany ;
    public String[] ingrediants ;

    public void getProducts(){
        System.out.println("Product Id is :"+productId);
        System.out.println("Product name is :"+productName);
        System.out.println("Product Company is :"+productCompany);
        for(String ingrediants:ingrediants){
            System.out.println("Product Ingrediants is :"+ingrediants);
        }
    }
}
