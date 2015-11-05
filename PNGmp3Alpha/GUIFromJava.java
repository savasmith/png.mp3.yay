import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
 
/* FrameDemo.java requires no other files. */
public class GUIFromJava {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public static void createAndShowGUI(String mood) {
        //Create and set up the window.
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 
        JLabel emptyLabel = new JLabel(mood);
        
        JLabel imgLabel = new JLabel(new ImageIcon("../images/error.png"));
        
        
        switch (mood){
            case "happy":
            imgLabel =  new JLabel(new ImageIcon("../images/happy_face.png"));
            break;
            
            case "sad":
            imgLabel =  new JLabel(new ImageIcon("../images/sad.png"));
            break;
            
            
          
            
            
            
        }
            
        
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.getContentPane().add(imgLabel, BorderLayout.CENTER);
        
 
        //Display the window.
        frame.pack();
        //frame.add(new MyPanel());
        frame.setVisible(true);
    }

}