package com.xworkz.moviebooking;

import com.xworkz.moviebooking.dto.MovieBookingDto;
import com.xworkz.moviebooking.service.MovieBooking;

public class MovieBookingRunner {

    public static void main(String[] args) {

        System.out.println("----- Booking Movie Ticket -----");

        MovieBookingDto dto = new MovieBookingDto();
        dto.setUserName("Akhil Raj");
        dto.setEmail("akhilraj@gmail.com");
        dto.setMobile("9876543210");
        dto.setMovieName("Interstellar");
        dto.setTheatreName("PVR Koramangala");
        dto.setShowTime("07:00 PM");
        dto.setNumberOfTickets(2);
        dto.setSeatType("Gold");


        MovieBooking booking = new MovieBooking();
        booking.bookTicket(dto);
        booking.getDetails();
    }
}
