
/**
 * Write a description of class ImageUploader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageUploader extends javax.swing.JPanel {
   
   
    public ImageUploader(MusicTool musicTool) {
       this.musicTool = musicTool;
       initComponents();

    }

    public void initComponents(){
        UploadButton = new javax.swing.JButton("Upload");
    }
    private MusicTool musicTool;
    private javax.swing.JButton UploadButton;
   
}
