import java.util.*;
import javax.swing.*;
/**
 * Write a description of class ImageUpload here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ImageUpload {
  
    /**
     * Constructor for objects of class ImageUpload
     */
    ImageDataAccess access;
    public ImageUpload() {
        access = new ImageDataAccess();
    }
   
    public void addImage(String mood, String path) {
        try {
            JLabel imageLabel = new JLabel(new ImageIcon("../images/" + path));
           
        } catch(Exception e) {
            System.out.println("Need to put file in image folder");
        }
        access.addImage(new Image(mood, path));

    }
    
    public Image getImage(String mood) {
        ArrayList<Image> image = access.getAllImages();
        ArrayList<Image> moodImages = findMood(image, mood);
        
        Random rand = new Random();
        int randomNumber = rand.nextInt(moodImages.size());
        return moodImages.get(randomNumber);
    }
    
    public ArrayList<Image> findMood(ArrayList<Image> images, String mood) {
        ArrayList<Image> moodImages = new ArrayList<Image>();
        
        for(Image image : images) {
            if(image.getMood().equals(mood)) {
                moodImages.add(image);
            }
        }
        return moodImages;
    }

}
