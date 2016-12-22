
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
  public boolean isIDPExist(String plantID,String name){
       
        boolean exist = false ;
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ;
        try{
        con = DBManager.getConnection();
        String query = "select IdPlants from userplants " +
                       "where UserName = ? and IdPlants = ?";
        stmt = con.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, plantID);
        result = stmt.executeQuery();
       
        if(result.first()){
            exist = true ;
           } 
       
        }catch(Exception e ){ e.printStackTrace();}
          finally {
            if( stmt != null )
                try{ stmt.close();}
                catch(Exception ex) {ex.printStackTrace();}
            if( con != null)
                try{con.close();}
                catch(Exception ex ){ ex.printStackTrace();}
        }
        return exist;
   }
   
   public String loadUserPlants(String user){
        
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ; 
         String print = "";
        try{
            con = DBManager.getConnection();
            String select = "select distinct userplants.IdPlants, plants.PlantsName from userplants " +
                            "inner join user " +
                            "inner join plants " +
                            "on userplants.IdPlants = plants.IdPlants "+
                            "and userplants.UserName = user.UserName "+
                            "where user.UserName = ?";
            stmt = con.prepareStatement(select);
            stmt.setString(1,user);
            result = stmt.executeQuery();
            
             while(result.next()){
                 String iDplants = result.getString(1);
                 String plantName = result.getString(2);
                 print += iDplants +" - "+plantName+"\n" ;
                 
             }
             
             
         } catch(Exception e ){ e.printStackTrace();}
          finally {
            if( stmt != null )
                try{ stmt.close();}
                catch(Exception ex) {ex.printStackTrace();}
            if( con != null)
                try{con.close();}
                catch(Exception ex ){ ex.printStackTrace();}
        }
        
       return print;
   }
   
   
}