package com.tarasov.chapter3.musicalAlbum.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private List <Song> songsList;

    public Album() {

        songsList = new ArrayList<>();

    }

    public Album(List<Song> songsList) {
        this.songsList = songsList;
    }

    public List<Song> songList() {
        return songsList;
    }

    public void addSong (Song song) {
        songsList.add(song);
    }

}
