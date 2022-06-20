package com.rplbo.musicplaylist;

import java.util.ArrayList;

public class Playlist {
    private  String playlistName;
    private static ArrayList<Song> songs;
    private int count;

    Playlist(){}

    public String getPlaylistName() {
        return playlistName;
    }

    public static void print(){
        System.out.println("Jumlah Lagu = " + songs.size() + " / Kapasitas Playlist = 6");
        for (int i = 0; i < songs.size(); i++){
            System.out.println("ListSon[" + i + "] : " + songs.get(i));
        }
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String totalTime(){
        for (int i = 0; i < songs.size(); i++){
            count = songs.get(i).getLength() + count;
        }
        return String.valueOf(count);
    }

    public void add(Song song){
        if (songs.size() == 6){
            System.out.println("Maaf playlist penuh!");
        }else{
            songs.add(song);
        }
    }

    public Song remove(String songName){
        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i).getName() == songName){
                songs.remove(i);
            }
        }
        System.out.println("Lagu berhasil dihapus!");
        return null;
    }

    public int size(){
        return songs.size();
    }

    public void setPlayListName(String playListName) {
        this.playlistName = playListName;
    }
}
