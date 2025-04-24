package com.xworkz.spotifyapp.songdata;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter

public class SongsDto {
    private String songName;
    private String artist;
    private int duration;
    private boolean isSongLikedList;

    //    public void setSongName(String songName){
//        this.songName = songName ;
//    }
//
//    public String getSongName(){
//        return songName;
//    }
//
//    public void setArtist(String artist){
//        this.artist = artist ;
//    }
//
//    public String getArtist(){
//        return artist;
//    }
//
//    public void setDuration(int duration){
//        this.duration= duration ;
//    }
//
//    public int getDuration(){
//        return duration;
//    }
//
//    public void setSongLikedList(boolean songLikedList){
//        this.isSongLikedList = songLikedList ;
//    }
//
//    public boolean getSongLinkedListed(){
//        return isSongLikedList;
//    }
    @Override
    public String toString() {
        return "SongDto(Song Name: " + getSongName() + "\n" +
                "Artist: " + getArtist() + "\n" +
                "Duration: " + getDuration() + " seconds\n" +
                "Is Song Liked: " + isSongLikedList() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(songName, artist, duration, isSongLikedList);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SongsDto) {
            SongsDto dto = (SongsDto) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}
