/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

import java.util.*;
import java.sql.*;



/**
 * QuestionDataAccess contains all of the data access logic for accessing and
 * editing questions in the database.
 * @author Nick Verbos (nverbos@calpoly.edu)
 */
public class ImageDataAccess {
    

    /**
     * This method returns a list of all questions in the database as basic 
     * Question types.  The questions return
     * @return an ArrayList of Questions containing all questions in the database
     * 
     * pre:
     * 
     * post:
     */
    public static ArrayList<Image> getAllImages(){
        Connection conn = Connect.connectDB();
        ArrayList<Image> images = new ArrayList<Image>();
        String sql = "SELECT * FROM images";
        Image current;
        ResultSet rs;
        
        try{
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(sql);
            while(rs.next()){
                current = new Image();
                current.setMood(rs.getString("mode"));
                current.setPath(rs.getString("path"));
                images.add(current);
            }
            
            rs.close();
            statement.close();
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
            
        }
        return images;
    }
    
    /**
     * This method gets the question from the database that has the id specified
     * in the parameter questionId.
     * @param questionId The id of of the question to be retrieved from
     * the database
     * @return an ArrayList of Questions containing all questions in the database
     * 
     * pre:
     * 
     * post:
     */
    public static Image getImage(int songId){
        Connection conn = Connect.connectDB();
        Image song = new Image();
        String sql = "SELECT * FROM images WHERE ?";
        ResultSet rs;
        
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, songId);
            rs = statement.executeQuery();
            while(rs.next()){
                song.setMood(rs.getString("mode"));
                song.setPath(rs.getString("path"));

            }
            
            rs.close();
            statement.close();
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
            
        }
        return song;
    }

    /**
     * Adds a question to the database
     * @param q the question to be added to the database.  Id field will be
     * ignored and a new unique id will be assigned.
     * 
     * pre:
     * 
     * post:
     */
    public static void addImage(Image s){
        Connection conn = Connect.connectDB();
        String sql = "INSERT INTO images (mode, path) VALUES(?, ?)";
        
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, s.getMood());
            statement.setString(2, s.getPath());
            
            statement.execute();
            statement.close();
            conn.close();
        } catch(Exception e){   
            e.printStackTrace();
        }
    }
    
    
    /**
     * Deletes the question with the specified questionId from the database
     * @param questionId the id of the question to be deleted
     * 
     * pre:
     * 
     * post:
     */
   /* public static void deleteSong(int songId){
                       Connection conn = Connect.connectDB();
        String sql = "DELETE FROM questions WHERE id = ?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, songId);
            statement.execute();
            statement.close();
            conn.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }*/
    
    /**
     * Edits question q in the database.  The database entry that will be edited
     * will be the the question with the same id as the id attribute in q
     * @param q the question that will be edited
     * 
     * pre:
     * 
     * post:
     */
    
    
   
}