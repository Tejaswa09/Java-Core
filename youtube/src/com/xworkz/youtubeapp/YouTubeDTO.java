package com.xworkz.youtubeapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(channelName, videoTitle, views, isMonetized);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof YouTubeDTO) {
            YouTubeDTO dto = (YouTubeDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}