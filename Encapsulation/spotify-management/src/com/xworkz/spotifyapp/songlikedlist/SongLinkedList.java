package com.xworkz.spotifyapp.songlikedlist;

import com.xworkz.spotifyapp.songdata.SongsDto;

public class SongLinkedList {
    public SongsDto dto;

    public void addSongToLikedList(SongsDto dto) {
        boolean isSongValid = validate(dto);

        if (isSongValid) {
            System.out.println("Song added to Liked List");
            this.dto = dto;
            dto.setSongLikedList(true);
        }
    }

    public boolean validate(SongsDto dto) {
        boolean isSongValidated = false;

        boolean isSongNameValid = false;
        boolean isArtistValid = false;
        boolean isDurationValid = false;


        if (dto.getSongName() != null && !dto.getSongName().isEmpty()) {
            isSongNameValid = true;

        } else System.out.println("Invalid Song Name ");

        if (dto.getArtist() != null && !dto.getArtist().isEmpty()) {
            isArtistValid = true;
        } else System.out.println("Invalid Artist Name");

        if (dto.getDuration()!=0){
            isDurationValid =true;
        }else System.out.println("Duration invalid");

        if (isSongNameValid && isArtistValid && isDurationValid && !dto.getSongLinkedListed()){
            isSongValidated = true;
        }else System.out.println("Song not added to liked list");

        return isSongValidated;
    }

    public void getSongList(){
        System.out.println("Song Name : "+dto.getSongName());
        System.out.println("Artist Name :"+dto.getArtist());
        System.out.println("Duration :"+dto.getDuration()+" Sec");
        System.out.println("IS song in Liked list "+dto.getSongLinkedListed());
    }
}
