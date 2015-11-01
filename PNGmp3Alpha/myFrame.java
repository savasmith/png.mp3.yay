import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class myFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myFrame extends JFrame
{
    private JLabel myLabel;
    private JLabel myLabel2;
    private JTextField rateField;
    private JPanel panel;
    public void myFrame(){
         int FRAME_WIDTH = 450;
         int FRAME_HEIGHT = 100;
         myLabel = new JLabel("niggas and ");
         createTextField();
         createPanel();
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }  
    private void createTextField()
    {
         myLabel2 = new JLabel("Your mom ");
        
         final int FIELD_WIDTH = 10;
         rateField = new JTextField(FIELD_WIDTH);
         rateField.setText("");
    }
    private void createPanel(){
        panel = new JPanel();
        panel.add(myLabel);
        panel.add(myLabel2);
        add(panel);
    }

}
