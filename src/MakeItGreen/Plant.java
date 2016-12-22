
package MakeItGreen;


import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
   // Frames fr ;
    
    
    
    String plantsName;
    String light;
    String sizeTall;
    String sizeWide;
    String sizeUnit;
//    Vector<Plant> plant;
//    Vector<UserPlant> up;
//   
    
    public Plant(String user){
        this.user=user;
  //      System.out.println(user);
    }
    public Plant(){
//        plant = new Vector<Plant>();
//        up = new Vector<UserPlant>();
        user1= null ;
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
     
            
   
//   public void addUserPlant(UserPlant us){
//        this.up.add(us);
//   }
    
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
             String SQL = "SELECT Light , SizeTall ,SizeWide , SizeUnit, water FROM group3.plants where IdPlants = ?;";
             pstmt =con.prepareStatement(SQL);
             pstmt.setString(1, idPlant);
             ResultSet rs = pstmt.executeQuery();
           if ( rs.next( ) ) {
             String light =rs.getString("Light");
             String sizeTall =rs.getString("SizeTall");
             String sizeWide =rs.getString("SizeWide");
             String sizeUnit =rs.getString("SizeUnit");
             String water = rs.getString("water");
            info ="<html> It need "+light+" light <br/> Size: To "+sizeTall+" "+sizeUnit+" tall and "+sizeWide+" "+sizeUnit+"wide."
                    + "<br/> and need water "+water;
             }
        }
        catch( Exception ex ){
            ex.printStackTrace();
        }
        finally {
            if (pstmt!=null) { try {
                pstmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
}
            if (con!=null)   {try {
                con.close();
                } catch (SQLException ex) {
                    //Logger.getLogger(plantInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
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
                    ex.printStackTrace();
                }
}
            if (con!=null)   {try {
                con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
}
        }
        return info;
   }       
   
   public void save(String User,String ID,String Date,String water){
       Connection con = null;
        PreparedStatement pstmt = null;
        try{
            if(IsDateExist(User,ID,Date)){
                con = DBManager.getConnection();
                pstmt=con.prepareStatement("UPDATE `group3`.`userplants` SET watring = ? WHERE UserName=? and IdPlants=? and date=? ");
                pstmt.setString(1, water);
                pstmt.setString(2, User);
                pstmt.setString(3, ID);
                pstmt.setString(4,Date);
                int result = pstmt.executeUpdate();
                if (result==1){
                    System.out.println("Added ");
                 JOptionPane.showMessageDialog(null,"Update succ"); }
                else 
                    System.out.println("not deleted ");
            }else{
                con = DBManager.getConnection();
                pstmt=con.prepareStatement("INSERT INTO `group3`.`userplants` VALUES (?,?,?,?)");
                pstmt.setString(1, User);
                pstmt.setString(2, ID);//id
                pstmt.setString(3, Date);// date
                pstmt.setString(4,water);
                int result = pstmt.executeUpdate();
                if (result==1){
                    System.out.println("Added ");
                 JOptionPane.showMessageDialog(null,"insert succ"); }
                else 
                    System.out.println("not deleted ");
           }
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
    
public boolean ubdateUesr(String password,String username ){
  boolean exist = false ;
        Connection con = null ;
        PreparedStatement stmt = null ;
        try{
        con = DBManager.getConnection();
        String query = "UPDATE  `group3`.`user` SET `Password`= ? WHERE `UserName` = ? ";
        stmt = con.prepareStatement(query);
        stmt.setString(1, password);
        stmt.setString(2, username);
         int result= stmt.executeUpdate();
            if (result==1){
            exist = true;
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
        return exist ; 
}
   public void loadImg(JLabel label,String idPlants){
       Connection con = null;
       PreparedStatement st = null;
       try{
       con = DBManager.getConnection();    
       String query = "select img from Plants where IdPlants = ?";
       st = con.prepareStatement(query);
       st.setString(1, idPlants);
       ResultSet rs = st.executeQuery();
            
       if(rs.next()){
                    byte[] img = rs.getBytes("img");
                    //Resize The ImageIcon
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    label.setIcon(newImage);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No Data");
                }
       
   }catch( Exception e ){
            e.printStackTrace();}
        finally {
            if (st!=null){
                try { st.close();}
                catch( Exception e ){ e.printStackTrace();}
            }
            if (con!=null){
                try {con.close();}
                catch( Exception e ){ e.printStackTrace();}
            }
    }
}
   
public boolean IsDateExist(String User,String ID ,String Date){
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean exist = false ;
        try{
            con = DBManager.getConnection();
            pstmt=con.prepareStatement("SELECT UserName, IdPlants, date FROM UserPlants WHERE UserName=? and IdPlants=? and date=?");
            pstmt.setString(1, User);
            pstmt.setString(2, ID);
            pstmt.setString(3, Date);
            ResultSet result = pstmt.executeQuery();
                if (result.next( )){
            exist = true;
        }
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
        return exist;
   }
}
  


   
       
       
   
   
   
    
   
   
   
   
   
   
 

