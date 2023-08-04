package com.kevin.evaluacioncontinua03.model;

public class Song extends Music {
    private String duration;

    public Song(String name, String artist, String imgUrl, String duration){
        super(name, artist, imgUrl);
        this.duration =  duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
