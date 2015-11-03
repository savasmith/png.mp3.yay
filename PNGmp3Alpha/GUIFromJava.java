import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
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
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.add(new MyPanel());
        frame.setVisible(true);
    }

}