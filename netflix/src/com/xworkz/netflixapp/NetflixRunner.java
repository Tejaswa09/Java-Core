package com.xworkz.netflixapp;

public class NetflixRunner {
    public static void main(String[] args) {
        NetflixDTO dto = new NetflixDTO();
        dto.setShowTitle("Stranger Things");
        dto.setGenre("Sci-Fi");
        dto.setSeasons(4);
        dto.setImdbRating(8.7);
        System.out.println(dto);
    }
}
