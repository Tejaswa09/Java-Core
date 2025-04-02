package com.xworkz.supermarket;

import com.xworkz.supermarket.product.Products;
import com.xworkz.supermarket.supermarket.SuperMarket;
import com.xworkz.supermarket.section.Section ;

public class SuperMarketRunner {
    public static  void main(String[] args) {
        String[] branches = {"bangalore","Chennai","Hyderabad"};
        
        Section[] sections = new Section[2];
        Products[] productsForFood = new Products[2];


        Products product1 = new Products();
        product1.productId = 10 ;
        product1.productName = "Maggie" ;
        product1.productCompany = "Nestlee" ;
        product1.ingrediants = new String[]{"Maida","MSG","PalmOil","Masala"};

        Products product2 = new Products();
        product2.productId = 11 ;
        product2.productName = "BURGER" ;
        product2.productCompany = "Nestlee" ;
        product2.ingrediants = new String[]{"Maida","MSG","PalmOil","Masala"};

        productsForFood[0]=product1;
        productsForFood[1]=product2;

        Products[] productsForDairy = new Products[2];

        Products pc1 = new Products();
        pc1.productId = 12;
        pc1.productName = "Amul Toned Milk" ;
        pc1.ingrediants = new String[] {"Milk","water","Preservatives"};

        Products pc2 = new Products();
        pc2.productId = 14;
        pc2.productName = "Nandini Spicy Butter MIlk" ;
        pc2.ingrediants = new String[] {"Milk","water","Preservatives","Spices"};

        productsForDairy[0] = pc1;
        productsForDairy[1]= pc2 ;

        Section sec1 = new Section();
        sec1.sectionId = 1;
        sec1.sectionName = "Dairy" ;
        sec1.products =productsForDairy;

        Section sec2 = new Section();
        sec2.sectionId = 2;
        sec2.sectionName = "Foods" ;
        sec2.products = productsForFood;

        sections[0]=sec1;
        sections[1]=sec2;

        SuperMarket sup = new SuperMarket();
         sup.mallId = 1;
         sup.mallName ="Lulu";
         sup.section = sections;
         sup.mallLocation = "Dubai";
         sup.branches= branches;

         sup.getSuperMarket();

    }
}
