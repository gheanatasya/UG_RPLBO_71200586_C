package com.rplbo.musicplaylist;

public class Song {
    private String artist;
    private String album;
    private String name;
    private int length;

    Song(String songName, String artistName, String albumName, int songLength){
        this.artist = artistName;
        this.album = albumName;
        this.name = songName;
        this.length = songLength;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }
}
