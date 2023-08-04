package com.kevin.evaluacioncontinua03.model;

public class Song extends Music {
    private int duration;

    public Song(String name, String artist, String imgUrl, int duration){
        super(name, artist, imgUrl);
        this.duration =  duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
