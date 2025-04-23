package com.xworkz.youtubeapp;

public class YouTubeRunner {
    public static void main(String[] args) {
        YouTubeDTO dto = new YouTubeDTO();
        dto.setChannelName("TechBuzz");
        dto.setVideoTitle("Top 5 Gadgets 2025");
        dto.setViews(150000);
        dto.setMonetized(true);
        System.out.println(dto);
    }
}
