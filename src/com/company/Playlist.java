package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private String name;
    private LinkedList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new LinkedList<Song>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongs () {
        return songs;
    }

    public boolean printSongs() {
        boolean result = false;
        if(this.songs.size() > 0) {
            ListIterator<Song> listIterator = songs.listIterator();
            System.out.println("\nPrinting playlist " + this.getName());
            System.out.println("=============================");
            while (listIterator.hasNext()){
                System.out.println(listIterator.next().toString());

            }
            System.out.println("=============================");
            result = true;
        }
        return result;
    }
}
