package com.kevin.evaluacioncontinua03.model;

public class Album extends Music {
    private int releaseYear;

    public Album(String name, String artist, String imgUrl, int releaseYear) {
        super(name, artist, imgUrl);
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
