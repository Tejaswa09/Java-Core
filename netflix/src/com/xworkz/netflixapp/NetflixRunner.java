package com.xworkz.netflixapp;

public class NetflixRunner {
    public static void main(String[] args) {
        NetflixDTO dto = new NetflixDTO();
        dto.setShowTitle("Stranger Things");
        dto.setGenre("Sci-Fi");
        dto.setSeasons(4);
        dto.setImdbRating(8.7);
        //System.out.println(dto);

        NetflixDTO dto1 = new NetflixDTO();
        dto1.setShowTitle("Stranger Things");
        dto1.setGenre("Sci-Fi");
        dto1.setSeasons(4);
        dto1.setImdbRating(8.7);

        System.out.println(dto.equals(dto1));
    }
}
