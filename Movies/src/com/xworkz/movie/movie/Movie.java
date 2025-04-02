package com.xworkz.movie.movie;


public class Movie {


    public String[] movieNames;
    public int noOfMovies;

    public void getDetails(){
        System.out.println("No of Movies "+ noOfMovies);
        System.out.println();
        System.out.println("Movie Names are ");


        if( movieNames!=null){
            for(String movies :movieNames){
                System.out.println(movies +" ");
            }
        }
        else{
            System.out.println("No Movies Available");
        }
        System.out.println();
    }
}
