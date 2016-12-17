/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakeItGreen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author mac
 */
public class User {
    String username;
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
    
    public void setUserName(String name){
        username = name;
    }
    public void setEmail(String mail){
        email = mail;
    }
    public void setPass(String password){
        pass = password;
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
        Connection con = null ;
        PreparedStatement stmt = null ;
        try { 
            String query ;
            con = DBManager.getConnection();
           
                query = "INSERT INTO user (UserName, Email, Password) VALUES (?,?,?)";
                stmt.setString(1, this.username);
                stmt.setString(2, this.email) ;
                stmt.setString(3, this.pass);
                int resutl = stmt.executeUpdate();
                System.out.println("User "+username+"NOT exist => insert new records");
              
            for(UserPlant up : this.userplant){
                up.save();
            }

            System.out.println(" Result = 1 User record has been Sucessfully saved ");
        }catch (Exception e ){
            
            System.out.println("saving one User record was NOT sucessful");
            e.printStackTrace();
        }
        // closing all connection if they were opened 
        finally {
            
            if( stmt != null )
                try{ stmt.close();}
                catch(Exception ex) {ex.printStackTrace();}
            if( con != null)
                try{con.close();}
                catch(Exception ex ){ ex.printStackTrace();}
        
         }
    }

     public static User loadUser(String name){
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ; 
        User user = new User();
        try { 
            con = DBManager.getConnection();
            String query = " SELECT Email , Password FROM user WHERE UserName = ? ";
            stmt = con.prepareStatement(query);
            stmt.setString(1, name);
            result = stmt.executeQuery();
            if(result.next()){
                user.setUserName(name);
                user.setEmail(result.getString("Email"));
                user.setPass(result.getString("Password"));
                Vector<UserPlant> uList= UserPlant.loadUser(name);
                if(uList != null){
                    for(UserPlant up : uList){
                        user.addUserPlant(up);
                        up.setUser(user);
                    }
                        
                }
                
                System.out.println(" Student record has been loaded successfully ");
            }
            else 
                System.out.println(" Student record NOT found! ");

        }catch (Exception e ){
            
            System.out.println("Loading one record was NOT sucessful");
            e.printStackTrace();
        }
        // closing all connection if they were opened 
        finally {
            
            if( stmt != null )
                try{ stmt.close();}
                catch(Exception ex) {ex.printStackTrace();}
            if( con != null)
                try{con.close();}
                catch(Exception ex ){ ex.printStackTrace();}
        }
        
        return user;

    }

    private boolean isUserExist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
