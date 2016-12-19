
package MakeItGreen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
import java.util.Vector;

/**
 *
 * @author mac
 */
public class UserPlant {
    String Date;
    public Plant p ;
    public User u ;
   // Vector<date> date;
    
    public UserPlant(){
        
       // date= new Vector<date>();
    }
    
      public String getDate(){
        return Date;
    }
    public void setDate(String Date){
        this.Date=Date;
    }
    public UserPlant(User user,Plant plant){
        this.u = user;
        this.p = plant;
    }
   /** public void addDate(date d){
        this.date.add(d);
    }*/
    
    public void setPlantId (Plant ID){
       p = ID;
    }
    
    /**public void save(){
        Connection con = null;
        PreparedStatement s = null;
        try{
            con=DBManager.getConnection();
            String guery="INSERT INTO UserPlants"
                    + " VALUES (?,?,?)";
            s= con.prepareStatement(guery);
            s.setString(1,""+this.user.getUsername());
            s.setString(2,""+this.plant.getIdPlant());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }*/
    
    /**public void save(){
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
            con = DBManager.getConnection();
             String insert ="INSERT INTO `group3`.`userplants` VALUES (?,?,?)";
            pstmt = con.prepareStatement(insert);
            pstmt.setString(1, this.u.username);// user name
            pstmt.setString(2,this.p.getIdPlant());//id
           // pstmt.setString(3,this.getDate());// date
          
           
            
            int result=pstmt.executeUpdate();
                if (result==1)
                    System.out.println("Added ");
                else 
                    System.out.println("not deleted ");
                
           }
        
        catch( Exception e ){
            e.printStackTrace();}
        finally {
            if (pstmt!=null){
                try { pstmt.close();}
                catch( Exception e ){ e.printStackTrace();}
            }
            if (con!=null){
                try {con.close();}
                catch( Exception e ){ e.printStackTrace();}
            }
        }
    }*/

  
    
 /**  public static Vector<UserPlant> loadUser(int ID){
   
}*/
}