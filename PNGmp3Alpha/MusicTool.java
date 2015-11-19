import javax.swing.UIManager;
/**
 * Write a description of class musicImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicTool extends javax.swing.JFrame{
    // instance variables - replace the example below with your own
   public MusicTool() {
       initComponents();
   }
    
   /**initializes the start of the app with the search panel */
   public void initComponents() {
       if(displayPanel != null) {
           remove(displayPanel);
        }
       if(imageUploadPanel != null) {
           remove(imageUploadPanel);
        }
       searchPanel = new SearchTool(this);
       Bar = new SideBar(this);
       separator = new javax.swing.JSeparator();

       getContentPane().setBackground(java.awt.Color.WHITE);
       setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(PanelLayout);

       PanelLayout
        .setHorizontalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                PanelLayout.createSequentialGroup()
                .addComponent(Bar))
             .addGroup(
                PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(separator)
                .addGap(21, 21, 21))
             .addGroup(
                PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(searchPanel)
                .addGap(21, 21, 21)));
      
       PanelLayout
        .setVerticalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                PanelLayout.createSequentialGroup()
                    .addComponent(Bar)
                    .addComponent(separator)
                    .addComponent(searchPanel)
                    .addGap(21, 21, 21)));
                    
      pack(); 
   }
   
   /** If the song is not found: 
    *  Display popup to alert user, clear text fields
    */
   public void SongUnfound(String songName, String artistName){
       javax.swing.JOptionPane.showMessageDialog(null,
    songName + " by " + artistName + " was not found.",
    "Error",
    javax.swing.JOptionPane.ERROR_MESSAGE);

    searchPanel.clear();
   }
   
   /**Changes the GUI interface to show what image is connected to it */
   public void showResults(String mood) {
       displayPanel = new GUIFromJava(mood);

       remove(searchPanel);
       javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(PanelLayout);
       
       PanelLayout
        .setHorizontalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(displayPanel)
                .addGap(21, 21, 21))
             );
               
      
       PanelLayout
        .setVerticalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                PanelLayout.createSequentialGroup()
                    .addGap(21,21,21)
                    .addComponent(displayPanel)
                    .addGap(21, 21, 21)
                    ));
                    
      pack(); 
       
   }
   
   public void UploadImage() {
       if(displayPanel != null) {
           remove(displayPanel);
        }
       if(searchPanel != null) {
           remove(searchPanel);
        }
        imageUploadPanel = new ImageUploader(this);
        
         javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(PanelLayout);
       
       //May be problem: creating new Panel Layout instead of adding to current one
       PanelLayout
        .setHorizontalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(imageUploadPanel)
                .addGap(21, 21, 21))
             );

       PanelLayout
        .setVerticalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                PanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)

                    .addComponent(imageUploadPanel)
                    .addGap(21, 21, 21)
                    ));
                    
      pack(); 
   }
   
   public void addSong() {
    songAdderPanel = new SongAdder(this);
    
   }
    
   public void viewPastSongs() {
       songViewerPanel = new PastSongViewer(this);
   }
   public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicTool.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicTool.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicTool.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicTool.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicTool().setVisible(true);
            }
        });
   }
   private SideBar Bar;
   private SearchTool searchPanel;
   private GUIFromJava displayPanel;
   private ImageUploader imageUploadPanel;
   private SongAdder songAdderPanel;
   private PastSongViewer songViewerPanel;
   private javax.swing.JSeparator separator;
}
