package com.xworkz.movie;

import com.xworkz.movie.actors.Actors;
import com.xworkz.movie.movie.Movie;

public class MovieRunner {
        public static void main(String[] args) {

            Movie movie1 = new Movie();
            movie1.noOfMovies = 2;
            movie1.movieNames = new String[]{"Inception", "Interstellar"};

            Movie movie2 = new Movie();
            movie2.noOfMovies = 1;
            movie2.movieNames = new String[]{"The Dark Knight"};


            Actors actor = new Actors();
            actor.noOfActor = 2;
            actor.namesA = new String[]{"Leonardo DiCaprio", "Christian Bale"};
            actor.movies = new Movie[]{movie1, movie2};


            actor.displayDetails();

    }
}
