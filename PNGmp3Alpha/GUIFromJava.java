import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
 
/* FrameDemo.java requires no other files. */
public class GUIFromJava extends javax.swing.JPanel{
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public GUIFromJava(String mood) {
        createAndShowGUI(mood);
    }
    public void createAndShowGUI(String mood)  {
        //Create and set up the window.

        setBackground(java.awt.Color.WHITE);
 
            try{
       javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
    }catch(Exception e) {
    
    }
        moodLabel = new JLabel(mood);
        imageLabel = new JLabel(new ImageIcon("../images/error.png"));
        moodLabel.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        System.out.println(moodLabel.getText());
        switch (mood){
            case "happy":
            imageLabel =  new JLabel(new ImageIcon("../images/happy_face.png"));
            break;
            
            case "sad":
            imageLabel =  new JLabel(new ImageIcon("../images/sad.png"));
            break;  
            
            case "upbeat":
            imageLabel = new JLabel(new ImageIcon("../images/upbeat.jpg"));
            break;
        }
         
        imageLabel.setSize(50,50);
        
        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(this);
        setLayout(PanelLayout);
        PanelLayout
            .setHorizontalGroup(PanelLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                    PanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(moodLabel))
                .addGroup(
                    PanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(imageLabel)));
                        
        PanelLayout
            .setVerticalGroup(PanelLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                    PanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(moodLabel)
                    .addGap(50, 50, 50)
                    .addComponent(imageLabel)));
                      

       // setVisible(true);
    }
    
    private javax.swing.JLabel moodLabel;
    private javax.swing.JLabel imageLabel;

}