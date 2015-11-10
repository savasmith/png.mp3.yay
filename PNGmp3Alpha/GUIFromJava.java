import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
 
/* FrameDemo.java requires no other files. */
public class GUIFromJava extends javax.swing.JFrame{
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 
        moodLabel = new JLabel(mood);
        imageLabel = new JLabel(new ImageIcon("../images/error.png"));
        
        System.out.println(moodLabel.getText());
        switch (mood){
            case "happy":
            imageLabel =  new JLabel(new ImageIcon("../images/happy_face.png"));
            break;
            
            case "sad":
            imageLabel =  new JLabel(new ImageIcon("../images/sad.png"));
            break;   
        }
            
        
        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(PanelLayout);
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
                     
        
   //     frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
   //     frame.getContentPane().add(imgLabel, BorderLayout.CENTER);
        
        pack();
        setVisible(true);
    }
    
    private javax.swing.JLabel moodLabel;
    private javax.swing.JLabel imageLabel;

}