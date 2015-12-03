
import java.io.*;
/**
 * Write a description of class Song here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewSong
{
    // instance variables - replace the example below with your own
    private String artist;
    private String songName;
    private String mood;

    /**
     * Constructor for objects of class Song
     */
    public NewSong() {}
    public NewSong(String artist, String songName, String mood)
    {
        this.artist = artist.toLowerCase();
        this.songName = songName;
        this.mood = mood;
    }
    
    public void adjMood(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
    public String getArtist() {
        return artist;
    }
    public String getSong() {
        return songName;
    }
    
    public void setSong(String songName){
        this.songName = songName;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public void setMood(String mood) {
        this.mood = mood;
    }
    
    public void print() {
        System.out.println("["+ artist.toUpperCase() + ", " + songName + "]");
    }
}
