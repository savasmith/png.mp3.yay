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
   
   /**Changes the GUI interface to show what image is connected to it */
   public void changeGUI(String mood) {
       displayPanel = new GUIFromJava(mood);
       searchInterface = new javax.swing.JButton();
       searchInterface.setText("Search Again");
       
       // adds an action listener to the search again button
       // lets the user go back to the search panel
       searchInterface.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt){
               try {
                   remove(displayPanel);
                   remove(searchInterface);
                   initComponents();
            }catch(Exception e){
                System.out.println(e);
            }
            
            }
        });
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
                .addComponent(searchInterface))
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
                    .addGap(21, 21, 21)
                    .addComponent(searchInterface)
                    .addGap(21,21,21)
                    .addComponent(displayPanel)
                    .addGap(21, 21, 21)
                    ));
                    
      pack(); 
       
   }
   public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
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
   private javax.swing.JButton searchInterface;
   private javax.swing.JSeparator separator;
   
}
