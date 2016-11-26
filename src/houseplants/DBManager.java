/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseplants;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mac
 */
public class DBManager {
    public static final String USER_NAME = "root"; // complete here
    public static final String PSSWORD = "hind1234"; // complete  here
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            System.out.println("Exception :"+ex.getMessage());
        }
        
        try{
                // add missing parts here 
                String url = "jdbc:mysql://localhost:3306/lab#3";
                con =  DriverManager.getConnection(url,USER_NAME,PSSWORD);
                //System.out.println("Connected");
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
}
