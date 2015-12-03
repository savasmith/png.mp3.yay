
import java.util.*;
public class SongAdder
{
    private DataAccess access;
    private SongFinder finder;
    public SongAdder(NewSong song){
      
    }
    
    public boolean checkEchoSong(NewSong tempSong) {
        //First we will check the song against EchoNests database
        try{
       if(finder.findSong(tempSong.getSong(), tempSong.getArtist())) {
           return true;
        }
    }catch (Exception e) {
    
    }
       
            return false;
        
    }
    
    public boolean checkSongDatabase(NewSong tempSong) {
        ArrayList<NewSong> songs = access.getAllSongs();
     
        for(NewSong song : songs) {
            song.print();
            tempSong.print();
            String artist1 = (song.getArtist().toLowerCase());
            String artist2 = (tempSong.getArtist().toLowerCase());
            String song1 = (song.getSong().toLowerCase());
            String song2 = (song.getSong().toLowerCase());
            if (artist1.equals(artist2) && (song1.equals(song2))) {
                return true;
            }
            //if (tempSong.getArtist().compareTo(song.getArtist()) == 0) {// && tempSong.getSong().equals(song.getSong())) {
               // return true;
           // }

        }
        return false;
    }
    
    public void addSong(NewSong tempSong) {
        access.addSong(tempSong);
      // System.out.println(tempSong);
    }


}
