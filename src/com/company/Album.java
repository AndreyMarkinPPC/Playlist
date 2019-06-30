package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private Artist artist;
    private ArrayList<Song> songs;

    public Album(String name, Artist artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            System.out.println("Song '" + title + "' with duration " + Math.round(duration) + " has been added to album!");
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, Playlist playList) {
        int index = trackNumber -1;
        if((index >=0) && (index <= this.songs.size())) {
            playList.getSongs()
                    .add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, Playlist playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.getSongs().add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}

