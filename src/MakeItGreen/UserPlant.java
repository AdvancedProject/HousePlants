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
import java.util.GregorianCalendar;
import houseplants.*;
/**
 *
 * @author mac
 */
public class UserPlant {
    String userName ;
    String idPlant ;
    User user;
    Plant plant;
    String date ;
    
    public UserPlant(){
        user = null ;
        plant = null ;
        date = null ;
        userName = null;
        idPlant = null;
    }
    
    public UserPlant(User user,Plant plant){
        this.user = user;
        this.plant = plant;
    }
    
   
    
    public void setPlant(Plant p){
        plant = p;
    }
    
    public void setUser(User u){
        user = u;
    }
    
    public void setDate(String d){
        date = d ;
    }
    public Plant getPlant(){
        return plant;
    }
    
    public User getUser(){
        return user;
    }
//    @author Rozan
    public void save(){   
        Connection con = null;
        PreparedStatement s = null;
        try{
            con=DBManager.getConnection();
            String guery="INSERT INTO UserPlants (UserName ,IdPlants ,date )"
                    + " VALUES (?,?,?)";
            s= con.prepareStatement(guery);
            s.setString(1,this.user.getUsername());
            s.setString(2,this.plant.getIdPlant());
            s.setString(3,this.getDate());
        }catch(Exception ex){
            ex.printStackTrace();
        }
       
    }
    
    // @author Razan
    public void done(){
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
            con = DBManager.getConnection();
             String insert ="INSERT INTO `UserPlants` VALUES (?,?,?)";
            pstmt = con.prepareStatement(insert);
            pstmt.setString(1,this.user.username);// user name
            pstmt.setString(2,this.plant.plantsName);//id
            pstmt.setString(3,this.getDate());// date
          
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
    }
    
     public boolean isUserPlantExist(Plant plant , User user ){
        boolean exist = false ;
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ;
        try{
        con = DBManager.getConnection();
        String query = "SELECT UserName , IdPlants FROM UserPlants WHERE UserName = ? and IdPlants = ? ";
        stmt = con.prepareStatement(query);
        stmt.setString(1, user.getUsername());
        stmt.setString(2, plant.getIdPlant());
        result = stmt.executeQuery();
        if(result.first())
            exist = true ;
        }catch(Exception e )
        { e.printStackTrace();}
        
        // closing all connection if they were opened 
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

        public static Vector<UserPlant> loadUser(String pID){
        Vector<UserPlant> list = new Vector<UserPlant>();
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ; 
        try { 
            con = DBManager.getConnection();
            String query = " select PlantsName , Light , SizeTall , SizeWide ,SizeUnit ,userplants.UserName " +
            ", Email , Password ,date from user inner join userplants inner join plants \n" +
            " ON user.UserName = userplants.UserName \n" +
            " AND plants.IdPlants = userplants.IdPlants" 
            +"WHERE userPlants.IdPlants = ? ";
            stmt = con.prepareStatement(query);
            stmt.setString(1, pID);
            result = stmt.executeQuery();
            while(result.next()){
                UserPlant up = new UserPlant();
                User u = new User();
                Plant p = new Plant();
                p.setID(pID);
                p.setplantName(result.getString("PlantsName"));
                p.setLight(result.getString("Light"));
                p.setSizaTall(result.getString("SizeTall"));
                p.setsizeWide(result.getString("SizeWide"));
                p.setSizeUnit(result.getString("SizeUnit"));
                up.setPlant(p);
                u.setUserName(result.getString("UserName"));
                u.setEmail(result.getString("Email"));
                u.setPass(result.getString("Password"));
                up.setUser(u);
                up.setDate(result.getString("date"));
                list.add(up);
            }

        }catch (Exception e ){
            
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
        return list ;
    }

        public static Vector<UserPlant> loadPlant(String uName){
        Vector<UserPlant> list = new Vector<UserPlant>();
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ; 
        try { 
            con = DBManager.getConnection();
            String query = " select PlantsName , Light , SizeTall , SizeWide ,SizeUnit ,userplants.IdPlants" +
            ", Email , Password ,date from user inner join userplants inner join plants \n" +
            " ON plants.IdPlants = userplants.IdPlants \n" +
            " AND user.UserName = userplants.UserName " 
            +"WHERE userplants.UserName = ? ";
            stmt = con.prepareStatement(query);
            stmt.setString(1, uName);
            result = stmt.executeQuery();
            while(result.next()){
                UserPlant up = new UserPlant();
                User u = new User();
                Plant p = new Plant();
                u.setUserName(uName);
                u.setEmail(result.getString("Email"));
                u.setPass(result.getString("Password"));
                up.setUser(u);
                p.setID(result.getString("IdPlants"));
                p.setplantName(result.getString("PlantsName"));
                p.setLight(result.getString("Light"));
                p.setSizaTall(result.getString("SizeTall"));
                p.setsizeWide(result.getString("SizeWide"));
                p.setSizeUnit(result.getString("SizeUnit"));
                up.setPlant(p);
                up.setDate(result.getString("date"));
                list.add(up);
            }

        }catch (Exception e ){
            
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
        return list ;
    }


    private String getDate() {
      return ""+date ;
  }
}
