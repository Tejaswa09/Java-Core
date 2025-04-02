package com.xworkz.supermarket.supermarket;

import com.xworkz.supermarket.section.Section ;

public class SuperMarket {

    public int mallId;
    public String mallName ;
    public Section[] section ;
    public String mallLocation ;
    public String[] branches ;

    public void getSuperMarket(){
        System.out.println("Mall Id is :"+mallId);
        System.out.println("Mall name is :"+mallName);
        System.out.println("Mall Location is :"+mallLocation);
        System.out.println("Branches are :");
        for(String b :branches){
            System.out.println(b);
        }
        System.out.println("Section are :");
        for(Section s :section){
            s.getSection();
        }

    }
}
