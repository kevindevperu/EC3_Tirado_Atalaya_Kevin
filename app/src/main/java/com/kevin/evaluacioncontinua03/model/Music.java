package com.kevin.evaluacioncontinua03.model;

public class Music {
    private String name;
    private String artist;
    private String imgUrl;

    public Music(String name, String artist, String imgUrl){
        this.name = name;
        this.artist = artist;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}


