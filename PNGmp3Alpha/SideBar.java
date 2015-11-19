
/**
 * This class takes care of the side bar that allows the user to upload an image, search for a song,
 * and view past searches.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SideBar extends javax.swing.JPanel {
    // instance variables - replace the example below with your own
 
    public SideBar(MusicTool musicTool)
    {
        this.musicTool = musicTool;
        initComponents();
        
    }

   
    public void initComponents() {
        findSongButton = new javax.swing.JButton("Find Song");
        uploadImageButton = new javax.swing.JButton("Upload Image");
        addSongButton = new javax.swing.JButton("Add Song");
        viewPastButton = new javax.swing.JButton("View Past Searches");
        
        setBackground(java.awt.Color.WHITE);
        
        findSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicTool.initComponents();
            }
        });
        
            try{
       javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
    }catch(Exception e) {
    
    }
        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(this);
        setLayout(PanelLayout);
        
        PanelLayout
            .setHorizontalGroup(PanelLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                    PanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(findSongButton)
                        .addGap(10,10,10)
                        .addComponent(uploadImageButton)
                        .addGap(10,10,10)
                        .addComponent(addSongButton)
                        .addGap(10,10,10)
                        .addComponent(viewPastButton)
                        .addGap(10, 10, 10)));
                        
        PanelLayout
            .setVerticalGroup(PanelLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                    PanelLayout.createSequentialGroup()
                        .addGap(10,10,10)
                        .addComponent(findSongButton)
                        .addGap(15, 15,15))
                 .addGroup(
                    PanelLayout.createSequentialGroup()
                        .addGap(10,10,10)
                        .addComponent(uploadImageButton)
                        .addGap(15, 15,15))
                 .addGroup(
                    PanelLayout.createSequentialGroup()
                        .addGap(10,10,10)
                        .addComponent(addSongButton)
                        .addGap(15, 15,15))
                 .addGroup(
                    PanelLayout.createSequentialGroup()
                        .addGap(10,10,10)
                        .addComponent(viewPastButton)
                        .addGap(15, 15,15)));
                        
                    
        
    }
    private javax.swing.JButton findSongButton;
    private javax.swing.JButton uploadImageButton;
    private javax.swing.JButton addSongButton;
    private javax.swing.JButton viewPastButton;
    private MusicTool musicTool;
}
