
/**
 * Write a description of class Image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image
{
    // instance variables - replace the example below with your own
    private String mood;
    private String path;

    /**
     * Constructor for objects of class Image
     */
    public Image()
    {
        // initialise instance variables

    }
    public Image(String mood, String path) {
        this.mood = mood;
        this.path = path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public void setMood(String mood) {
        this.mood = mood;
    }
    public String getPath() {
        return path;
    }
    public String getMood() {
        return mood;
    }
}
