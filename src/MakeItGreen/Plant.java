
package MakeItGreen;

import houseplants.plantInfoFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class Plant {
    public String user ;
    public String idPlant;
    public String Date ;
    public User user1 ;
    Frames fr ;
    
    
    
    String plantsName;
    String light;
    String sizeTall;
    String sizeWide;
    String sizeUnit;
    //Vector<Plant> plant;
    //Vector<UserPlant> up;
    
    
    public Plant(String user){
        this.user=user;
        System.out.println(user);
    }
    public Plant(){
       // plant = new Vector<Plant>();
       // up = new Vector<UserPlant>();
        user1= null ;
    }
    
 
    
    /**public Plant(String idPlant,String plantsName,String light,String sizeTall,String sizeWide,String sizeUnit){
        this.idPlant = idPlant;
        this.plantsName = plantsName;
        this.light = light;
        this.sizeTall = sizeTall;
        this.sizeWide = sizeWide;
        this.sizeUnit = sizeUnit;   
    }*/
  
    public String getIdPlant(){
        return idPlant;
    }
    public String getPlantName(){
        return plantsName;
    }
    public String getLight(){
        return light;
    }
   public String getSizeTall(){
        return sizeTall;
    }
   public String getSizeWide(){
       return sizeWide;
   }
   public String getSizeUnit(){
       return sizeUnit;
   }
   public String getPlantId(){
       return idPlant;
   }
   
   public void setPlantId(String idPlant){
       this.idPlant = idPlant;
   }
   public void setPlantName(String PlantsName){
        this.plantsName = PlantsName;
    }
   public void setPlantLight(String light){
        this.light = light;
    }
    public void setsizeTall(String tall){
        this.sizeTall = tall;
    }
     public void setsizeWide(String wide){
        this. sizeWide = wide;   
    }
     public void setsizeUnit(String unit){
        this.sizeUnit = unit;   
    }
     
            
   
   /*public void addUserPlant(UserPlant us){
        this.up.add(us);
   }*/
   
         
           /**  public static Plant loadPlant(int ID){
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ; 
        Plant p = new Plant ();
        try { 
            con = DBManager.getConnection();
           
            String query = " SELECT * FROM plants WHERE IdPlants = ? ";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, ID);
            result = stmt.executeQuery();
            if(result.first()){
                p.setPlantName(result.getString("PlantsName"));
                p.setPlantLight(result.getString("Light"));
                p.setsizeTall(result.getString("SizaTall"));
                if(sList != null){
                    for(UserPlant up : sList){
                        up.setPlantId(p);
                        p.addUserPlant(up);
                    }
                        
                } 
                
                System.out.println("plant record has been loaded successfully ");
            }
            else 
                System.out.println("plant record NOT Found! ");

        }catch (Exception e ){
            
            System.out.println("loading one plant record was NOT sucessful");
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
        
        return p;

    }*/
    
     public boolean isidPlantExist(String idPlant ){
  boolean exist = false ;
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ;
        try{
        con = DBManager.getConnection();
        String query = "SELECT 'PlantsName'  FROM `group3`.`plants` WHERE `IdPlants` = ?   ";
        stmt = con.prepareStatement(query);
        stmt.setString(1, idPlant);
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

    
   public void deletePlant(String userName, String idPlant){
        Connection con = null;
        PreparedStatement stmt = null;
        System.out.println(userName + idPlant);
        
        try{
            con = DBManager.getConnection();
            String delete = "DELETE FROM UserPlants WHERE UserName=? and IdPlants=?";
            stmt = con.prepareStatement(delete);
            stmt.setString(1, userName);
            stmt.setString(2, idPlant);
          int i = stmt.executeUpdate();
          JOptionPane.showMessageDialog(null,"delet done succ");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            
            if( stmt != null )
                try{ stmt.close();}
                catch(Exception ex) {ex.printStackTrace();}
            if( con != null)
                try{con.close();}
                catch(Exception ex ){ ex.printStackTrace();}
        }
       }
   
   public String loadPlantInfo(String idPlant){
       String info="";
       Connection con = null;
        PreparedStatement pstmt = null;
        try{
             con = DBManager.getConnection();
             String SQL = "SELECT Light , SizeTall ,SizeWide , SizeUnit FROM group3.plants where IdPlants = ?;";
             pstmt =con.prepareStatement(SQL);
             pstmt.setString(1, idPlant);
             ResultSet rs = pstmt.executeQuery();
           if ( rs.next( ) ) {
             String light =rs.getString("Light");
             String sizeTall =rs.getString("SizeTall");
             String sizeWide =rs.getString("SizeWide");
             String sizeUnit =rs.getString("SizeUnit");
            info ="<html> It need "+light+" light <br/> Size: To "+sizeTall+" "+sizeUnit+" tall and "+sizeWide+" "+sizeUnit+"wide.";
             }
        }
        catch( Exception ex ){
            ex.printStackTrace();
        }
        finally {
            if (pstmt!=null) { try {
                pstmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(plantInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
}
            if (con!=null)   {try {
                con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(plantInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
}
        }
        return info;
   }
   
   public String loadPlantName(String idPlant){
       String info="";
       Connection con = null;
        PreparedStatement pstmt = null;
        try{
             con = DBManager.getConnection();
             String SQL = "SELECT PlantsName FROM group3.plants where IdPlants = ?;";
             pstmt =con.prepareStatement(SQL);
             pstmt.setString(1, idPlant);
             ResultSet rs = pstmt.executeQuery();
           if ( rs.next( ) ) {
             String name = rs.getString("PlantsName");
            info ="<html> <b>"+name+"</b>";
             }
        }
        catch( Exception ex ){
            ex.printStackTrace();
        }
        finally {
            if (pstmt!=null) { try {
                pstmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(plantInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
}
            if (con!=null)   {try {
                con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(plantInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
}
        }
        return info;
   }
   //String User,String ID ,String Date,String water
   public void save(String User,String ID ,String Date,String water){
       Connection con = null;
        PreparedStatement pstmt = null;

        fr= new Frames();
        System.out.println(User+"yy");
        System.out.println(ID);
        System.out.println(Date);
        System.out.println(water);
        try{
            con = DBManager.getConnection();
            pstmt=con.prepareStatement("INSERT INTO `group3`.`userplants` VALUES (?,?,?,?)");
            pstmt.setString(1, User);
            pstmt.setString(2, ID);//id
            pstmt.setString(3, Date);// date
            pstmt.setString(4,water);
            int result = pstmt.executeUpdate();
                if (result==1){
                    System.out.println("Added ");
                 JOptionPane.showMessageDialog(null,"insert succeed"); }
                else 
                    System.out.println("not deleted ");
           }catch( Exception e ){
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
   }
    }
   
   
   
   
   
   
 

