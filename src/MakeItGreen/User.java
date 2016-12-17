/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakeItGreen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;

/**
 *
 * @author mac
 */
public class User {
    static String username;
    String email;
    String pass;
    Vector<UserPlant> userplant;
    
    public User(){
        userplant= new Vector<UserPlant>();
    }
    public User(String username,String email,String pass){
        this.username = username;
        this.email = email;
        this.pass = pass;
    }
    
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPass(){
       return pass; 
    }
    
    public void addUserPlant(UserPlant us){
        this.userplant.add(us);
    }
   
    
    public void save(){
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
            String query ;
            con = DBManager.getConnection();
        query = "INSERT INTO User VALUES (?,?,?)";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1,""+getUsername());
        pstmt.setString(2,""+getEmail() );
        pstmt.setString(3, ""+ getPass());
        int result = pstmt.executeUpdate();
        
        }catch( Exception e ){
              e.printStackTrace();
        }
        finally {
            if(pstmt != null)
        try{pstmt.close();
            }catch( Exception e ){
              e.printStackTrace();
        }
            if(con != null) 
        try{ con.close();
            }catch( Exception e ){
              e.printStackTrace();
        }
        }
    }
}
