package com.xworkz.spotifyapp.songdata;

public class SongsDto {
    private String songName ;
    private String artist ;
    private int duration ;
    private boolean isSongLikedList ;

    public void setSongName(String songName){
        this.songName = songName ;
    }

    public String getSongName(){
        return songName;
    }

    public void setArtist(String artist){
        this.artist = artist ;
    }

    public String getArtist(){
        return artist;
    }

    public void setDuration(int duration){
        this.duration= duration ;
    }

    public int getDuration(){
        return duration;
    }

    public void setSongLikedList(boolean songLikedList){
        this.isSongLikedList = songLikedList ;
    }

    public boolean getSongLinkedListed(){
        return isSongLikedList;
    }
}
