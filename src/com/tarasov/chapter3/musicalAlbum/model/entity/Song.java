package com.tarasov.chapter3.musicalAlbum.model.entity;

public class Song {

    private String name;
    private int length;

    public Song() {
    }

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (length != song.length) return false;
        return name.equals(song.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + length;
        return result;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
