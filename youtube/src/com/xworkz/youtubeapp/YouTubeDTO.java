package com.xworkz.youtubeapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class YouTubeDTO {
    private String channelName;
    private String videoTitle;
    private int views;
    private boolean isMonetized;

    @Override
    public String toString() {
        return "YouTubeDTO [channelName=" + channelName + ", videoTitle=" + videoTitle + ", views=" + views + ", isMonetized=" + isMonetized + "]";
    }
}