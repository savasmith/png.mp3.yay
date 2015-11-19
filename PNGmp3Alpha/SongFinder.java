import java.util.*;
import java.lang.*;
import com.echonest.api.v4.*;

/**
 * Alpha attempt to match song name input with a mood, then a picture. 
 * echonest API can be found here: http://static.echonest.com.s3.amazonaws.com/jEN/javadoc/index.html
 * @author CAH
 * @version 10/19
 */
public class SongFinder {
   public static EchoNestAPI echoNest;
   public static String[] moods = {"happy","sad", "intense", "upbeat", "mellow", "happy"}; 

   public static MusicTool musicTool;
    public void findSong(String songName, String artistName, MusicTool musicTool) throws EchoNestException{
        this.musicTool = musicTool;
        System.out.println(songName);
        System.out.println(artistName);
        Params songParams = new Params();
        songParams.add("title", songName);
        echoNest = new EchoNestAPI("F9GHGBIFH4HPLQBWR");
        List<Artist> artists = echoNest.searchArtists(artistName);


        System.out.println(artists);
        Song song = songMatch(artists, songName);
       
        if (song != null) {
            getSongInfo(song);
            songMoodMatch(song);
        }
        else{
            musicTool.UnfoundSong(songName, artistName);
        }
   
        }
    
    
    public void getSongInfo(Song song) throws EchoNestException{
        song.showAll();
    }

    public void songMoodMatch(Song song) throws EchoNestException{
        double energy = song.getEnergy();
        double danceability = song.getDanceability();
        double tempo = song.getTempo();
        double loudness = song.getLoudness();
        String mood = "";
        
        if (tempo < 90){
            if (energy < .5){
      //          System.out.println(moods[1]);
                mood = moods[1];
            }
            else{
        //        System.out.println(moods[4]);
                mood = moods[4];
            }
           
        }
        
        else{
            if (energy > .5){
                if (loudness > -4){
//                    System.out.println(moods[2]);
                    mood = moods[2];
                }
                else{
  //                  System.out.println(moods[3]);
                    mood = moods[3];
                }
            }
            else{
    //            System.out.println(moods[5]);
                mood = moods[5];
            }
            
        }
        musicTool.changeGUI(mood);
    }
    public Song songMatch(List<Artist> artists, String songName) throws EchoNestException {
        Song selected = null;
        for(Artist artist : artists) {
            for(Song song : artist.getSongs()) {
                if (song.getTitle().contains(songName)) {
                    selected = song;
                    break;
                }
            }
        }
        return selected;
    }
    
}





