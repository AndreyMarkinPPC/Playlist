package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<Album>();

        Album album = new Album("The Wall", "Pink Floyd");
        album.addSong("Another brick in the wall", 2.42);

        for (int i = 0; i < 10; i++) {
            album.addSong("Song #" + (i + 1), Math.round((i + 1) * Math.random() * 100 + 10));
        }

        Playlist playlist = new Playlist("My Playlist");

        albums.add(album);

        // adding new album
        album = new Album("Led Zeppelin I", "Led Zeppelin");
        album.addSong("Communication Breakdown", 2.43);

        for (int j = 0; j < 10; j++) {
            album.addSong("Pesnya #" + (j + 1), ((j + 1) * Math.round(Math.random() * 143)));
        }

        albums.add(album);

        albums.get(0).addToPlaylist(2, playlist);
        albums.get(0).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(0).addToPlaylist(1, playlist);

        playlist.printSongs();

    }

}
