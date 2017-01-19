package com.tarasov.chapter3.musicalAlbum.model.util;

import com.tarasov.chapter3.musicalAlbum.model.entity.Song;

import java.util.Random;

public class BlackStar {


    public  static Song songCreator (){

        String [] songTitles = {"Beard","Money","Girl","Car","Golden Chain","House","Drugs"};
        int [] timeAmount = {10,20,30,40,50};
        Random songTitlesRandom = new Random(songTitles.length);
        Random artistTitlesRandom = new Random(timeAmount.length);
        return new Song(songTitles[songTitlesRandom.nextInt()],timeAmount[artistTitlesRandom.nextInt()]);

    }


}
