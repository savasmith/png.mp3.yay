

import java.sql.*;
import javax.swing.*;

public class Connect {
    Connection conn = null;
    
    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:SongDatabase.db");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);            
        } 
        return null;
    }
}
