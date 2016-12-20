
package MakeItGreen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

/**
 *
 * @author mac
 */
public class UserPlant {
    String Date;
    public Plant p ;
    public User u ;
String plantId;
String PlantName;
   Vector<UserPlant> up = new Vector<UserPlant>();
    private String c;
    private String userName;
    


    public UserPlant(){
        
       //date= new Vector<date>();
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
    
   public void setPlantName (String plantName){
this.PlantName =plantName;

}

public void setPlantID (String plantID){
this.plantId =plantID;

}

   public void setUsertName (String userName){
this.userName =userName;}
   public static Vector<GregorianCalendar>loadDate(String userName,String idPlant){
            Vector<GregorianCalendar> list = new Vector<GregorianCalendar>();
            Connection con = null;
            PreparedStatement pstmt = null;
            try{
            con = DBManager.getConnection();
            String SQL = "SELECT date FROM group3.UserPlants where IdPlants = ? and UserName= ? and watring = 'yes'";
            pstmt =con.prepareStatement(SQL);
            pstmt.setString(1, idPlant);
            pstmt.setString(2, userName);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                GregorianCalendar cal = new GregorianCalendar();
                String d = rs.getString("date");
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
                Date date = formatter.parse(d);
                cal.setTime(date);
                list.add(cal);
            }
            }catch(Exception e){
                e.printStackTrace();
            }finally {
            if( pstmt != null )
                try{ pstmt.close();}
                catch(Exception ex) {ex.printStackTrace();}
            if( con != null)
                try{con.close();}
                catch(Exception ex ){ ex.printStackTrace();}
        }
         System.out.println(list);
         return list;   
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