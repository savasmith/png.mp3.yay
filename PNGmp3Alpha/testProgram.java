import java.util.*;
import java.lang.*;
import com.echonest.api.v4.*;

/**
 * Alpha attempt to match song name input with a mood, then a picture. 
 * echonest API can be found here: http://static.echonest.com.s3.amazonaws.com/jEN/javadoc/index.html
 * @author CAH
 * @version 10/19
 */
public class testProgram
{
   public static String[] moods = {"happy","sad", "loud", "quiet", "hot", "not"}; 
   public static void main(String[] args) throws EchoNestException {    
    EchoNestAPI echoNest = new EchoNestAPI("F9GHGBIFH4HPLQBWR");
    Scanner userIn = new Scanner(System.in);
    boolean quit = false;
    String songName = "";
    System.out.print("Enter a song name: ");
    while (userIn.hasNext() || quit == true){    
        songName = userIn.nextLine();
        if (songName.equals("q")){
            quit = true;
            break;
        }
        
        /**
         * Below is a modified Searchsongs function from an echonestJEN example
         */
        Params songParams = new Params();
        songParams.add("title", songName);
        List<Song> songs = echoNest.searchSongs(songParams);
        
        System.out.print("Enter the Artist: ");
        String artist = userIn.nextLine();
        
        songParams = new Params();
        songName += " (Live)";
        songParams.add("title", songName);
        List<Song> liveSongs = echoNest.searchSongs(songParams);
        
        boolean found = false;
       // System.out.println(songs);
        for (Song song: songs) {
            if (artist.equals(song.getArtistName())) {
                getSongInfo(song);
                songMoodMatch(song);
                found = true;
                break;
            }
        }
        if (!found) {
            for (Song song: liveSongs) {
                if (artist.equals(song.getArtistName())) {
                    getSongInfo(song);
                    songMoodMatch(song);
                    found = true;
                    break;
                }
        }
        }
        

        System.out.print("Enter a song name: ");
    }
}

    
    public static void getSongInfo(Song song) throws EchoNestException{
        /*System.out.println("Title: " + song.getTitle());
        System.out.println("Artist: " + song.getArtistName());
    
        System.out.println("Hottness: " + song.getSongHotttnesss());
        System.out.println("Energy: " + song.getEnergy());*/
        song.showAll();
    }

    public static void songMoodMatch(Song song) throws EchoNestException{
        double energy = song.getEnergy();
        double danceability = song.getDanceability();
        double tempo = song.getTempo();
        
        if (tempo < 100){
            if (energy < .5)
                System.out.println(moods[1]);
        }
        
            
        
        
    }


}





