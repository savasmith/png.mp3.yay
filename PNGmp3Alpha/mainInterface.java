
/**
 * This class takes care of the main interface where the user can enter in a song name
 * and press enter
 * 
 * @author Savannah Smith
 * @version (a version number or a date)
 */
public class mainInterface extends javax.swing.JFrame{


    public mainInterface() {
        initComponents();
    }
    
    public void initComponents() {
       mainPanel = new javax.swing.JPanel();
       findSong = new javax.swing.JButton();
       songInput = new javax.swing.JTextField("Enter Song Name");
       artistInput = new javax.swing.JTextField("Enter Artist Name");
       
       findSong.setText("Find Song");
       songInput.setSize(10, 50);
       findSong.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt){
               try {
               findSongActionPerformed(evt);
            }catch(Exception e){
                System.out.println(e);
            }
            
            }
        });
       
       javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(getContentPane());
       
       getContentPane().setLayout(PanelLayout);
       PanelLayout
        .setHorizontalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                PanelLayout.createSequentialGroup()
                    .addGap(21,21,21)
                    .addComponent(songInput)
                    .addGap(50, 50, 50)
                    .addComponent(findSong))
             .addGroup(
                PanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(artistInput)
                     .addGap(132, 132, 132)));
       PanelLayout
        .setVerticalGroup(PanelLayout
            .createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                PanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(songInput)
                    .addComponent(artistInput)
                    .addComponent(findSong)
                    .addGap(21, 21, 21)));
        
        pack();
        
    }
    
    private void findSongActionPerformed(java.awt.event.ActionEvent evt){
        testProgram backEnd = new testProgram();
        if(songInput.getText() != null) {
            try {
                backEnd.findSong(songInput.getText(), artistInput.getText());
            }catch(Exception e){
                System.out.println(e);
            }
        }
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
            java.util.logging.Logger.getLogger(mainInterface.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainInterface.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainInterface.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainInterface.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainInterface().setVisible(true);
            }
        });
    }
    
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton findSong;
    private javax.swing.JTextField songInput;
    private javax.swing.JTextField artistInput;
    
}
