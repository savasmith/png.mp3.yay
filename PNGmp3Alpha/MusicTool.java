
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
    
   public void initComponents() {
       searchPanel = new SearchTool(this);


       
       setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(PanelLayout);
       
       PanelLayout
        .setHorizontalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addGap(21, 21, 21)
                    .addComponent(searchPanel)
                    .addGap(21, 21, 21)));
                    
      pack(); 
   }
   
   public void changeGUI(String mood) {
       displayPanel = new GUIFromJava(mood);
       searchInterface = new javax.swing.JButton();
       searchInterface.setText("Search Again");
       
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
                .addComponent(displayPanel)
                .addGap(21, 21, 21))
             .addGroup(
                PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(searchInterface)));
               
      
       PanelLayout
        .setVerticalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                PanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(displayPanel)
                    .addGap(21, 21, 21)
                    .addComponent(searchInterface)));
                    
      pack(); 
       
   }
   public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
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
    
   private SearchTool searchPanel;
   private GUIFromJava displayPanel;
   private javax.swing.JButton searchInterface;
   
}
