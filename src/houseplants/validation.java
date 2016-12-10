/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseplants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hind
 */
public class validation {

    
    //validation email:
public boolean isValidEmail(String email ){
    
if(email.length() > 0){ if(email.indexOf('@') == -1 ||email.indexOf('@') != email.lastIndexOf('@'))
    return false;
String name = email.substring(0, email.indexOf("@"));
String domain = email.substring(email.indexOf("@")+1);
if(domain.indexOf('.') == -1) 
    return false;
}
    return true;
}

//validation password:
public boolean isPasswordValid(String pass ){ 
    int points = 0;
if(pass.length() < 8 || pass.length() > 20)
    return false;

for(int i=0;i< pass.length();i++){ 
    if(Character.isUpperCase(pass.charAt(i)))
    {
      points++; break;
      }
}
for(int i=0;i< pass.length();i++){
    if(Character.isLowerCase(pass.charAt(i))){
        points++; break;
}
}
for(int i=0;i< pass.length();i++){ 
    if(Character.isDigit(pass.charAt(i))){
        points++; break;
    }
      }
    if(points == 3) return true;
    else
       return false; 
        
}

//compare password and Password confirm  
public boolean comparePassword(String pass, String con){
    
  if (pass.equals(con)) return true;
      return false;
}

//
public boolean isUserNameExist(String username){
  boolean exist = false ;
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ;
        try{
        con = DBManager.getConnection();
        String query = "SELECT username FROM user WHERE username = ? ";
        stmt = con.prepareStatement(query);
        stmt.setString(1, username);
        result = stmt.executeQuery();
        if(result.first())
            exist = true ;
        }catch(Exception e ){ e.printStackTrace();}
              // closing all connection if they were opened 
        finally {
            
            if( stmt != null )
                try{ stmt.close();}
                catch(Exception ex) {ex.printStackTrace();}
            if( con != null)
                try{con.close();}
                catch(Exception ex ){ ex.printStackTrace();}
        }
        return exist ; 
}
}
