
/**
 * This class is the GUI for when a user wants to upload a new image to the database
 * 
 * @author Savannah Smith
 *
 */
public class ImageUploader extends javax.swing.JPanel {
   
   
    public ImageUploader(MusicTool musicTool) {
       this.musicTool = musicTool;
       initComponents();

    }

    public void initComponents(){
        UploadButton = new javax.swing.JButton("Upload");
        title = new javax.swing.JLabel("Upload an Image!");
              setBackground(java.awt.Color.WHITE); 
        try{
           javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
        }catch(Exception e) {}

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(this);
        setLayout(PanelLayout);
        PanelLayout
            .setHorizontalGroup(PanelLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                    PanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(UploadButton)
                        .addGap(155, 155, 155)));
                        
        PanelLayout
            .setVerticalGroup(PanelLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                    PanelLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                        .addComponent(UploadButton)
                        .addGap(21, 21, 21)));
                      
        // If image is uploaded add panel to get info about image
    }
    private MusicTool musicTool;
    private javax.swing.JButton UploadButton;
    private javax.swing.JLabel title;
    private ImageUploadOptions imageOptions;
   
}
