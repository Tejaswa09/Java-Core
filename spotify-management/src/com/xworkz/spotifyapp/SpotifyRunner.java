package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.songdata.SongsDto;
import com.xworkz.spotifyapp.songlikedlist.SongLinkedList;

public class SpotifyRunner {
    public static void main(String[] args) {


        SongsDto songsDto = new SongsDto();

        songsDto.setSongName("All Star ");
        songsDto.setArtist("SZA");
        songsDto.setDuration(120);
        songsDto.setSongLikedList(false);
        System.out.println(songsDto);

        SongLinkedList songLinkedList = new SongLinkedList();
        songLinkedList.addSongToLikedList(songsDto);
        songLinkedList.getSongList();

        SongsDto songsDto1 = new SongsDto();

        songsDto1.setSongName("All Star ");
        songsDto1.setArtist("SZA");
        songsDto1.setDuration(120);
        songsDto1.setSongLikedList(false);

        System.out.println(songsDto1.equals(songsDto1));


    }


}
