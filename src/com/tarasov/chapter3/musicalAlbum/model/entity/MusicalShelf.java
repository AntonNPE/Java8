package com.tarasov.chapter3.musicalAlbum.model.entity;

import java.util.ArrayList;
import java.util.List;

public class MusicalShelf {

    private List<Album> albums;

    public MusicalShelf() {

        albums = new ArrayList<>();

    }

    public MusicalShelf(List<Album> almubs) {
        this.albums = almubs;
    }

    public List<Album> getAllAlbums() {
        return albums;
    }

    public void putAlmubs(List<Album> almubs) {
        this.albums = almubs;
    }
}
