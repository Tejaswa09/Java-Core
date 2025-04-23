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


    }


}
