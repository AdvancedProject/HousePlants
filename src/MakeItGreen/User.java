
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
    Vector<User> user;
    Vector<UserPlant> userplant;
    
    public User(){
        user = new Vector<User> ();
        userplant= new Vector<UserPlant>();
    }
    public User(String username,String email,String pass){
        this.username = username;
        this.email = email;
        this.pass = pass;
    }
    
    public String getUsername(){
        System.out.println(username);
        return username;
         
    }
    
    public void setUsername(String User){
       this.username = User;
         System.out.println(username);
      
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
   
    
    /** public void save(){
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
         for(User u :this.user){
                   u.save();}
         
        }
        catch( Exception e ){
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
    }*/
    
 public boolean isValidEmail(String email ){
    
if(email.length() > 0){
  if(email.indexOf('@') == -1 ||email.indexOf('@') != email.lastIndexOf('@'))
     return false;
String name = email.substring(0, email.indexOf("@"));
String domain = email.substring(email.indexOf("@")+1);
if(domain.indexOf('.') == -1)
return false;
}
    return true;
}

/**
 * @return true if password valid
 */
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
        return false;
  
}

/**
 * @return true if password and confirm password matching 
 */
public boolean comparePassword(String pass, String con){
    
  if (pass.equals(con)) return true;
      return false;
}

/**
* @return true if name was exist 
*/
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

public boolean isUserNameAndpaswordExist(String username ,String password){
  boolean exist = false ;
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ;
        try{
        con = DBManager.getConnection();
        String query = "SELECT 'UserName' , `Password` FROM `group3`.`user` WHERE `UserName` = ? AND `Password` = ?  ";
        stmt = con.prepareStatement(query);
        stmt.setString(1, username);
        stmt.setString(2, password);
        result = stmt.executeQuery();
        if(result.first())
            exist = true ;
        }catch(Exception e ){ e.printStackTrace();}
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
