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
public class Plant {
     String idPlant;
    String plantsName;
    String light;
    String sizeTall;
    String sizeWide;
    String sizeUnit;
     Vector<UserPlant> userplant;
    
    public Plant(){
        userplant = new Vector<UserPlant>();
    }
    
    public Plant(String idPlant,String plantsName,String light,String sizeTall,String sizeWide,String sizeUnit){
        this.idPlant = idPlant;
        this.plantsName = plantsName;
        this.light = light;
        this.sizeTall = sizeTall;
        this.sizeWide = sizeWide;
        this.sizeUnit = sizeUnit;   
    }
    
  
    
    public void setplantName(String n){
        plantsName = n;
    }
    public void setID(String id){
        idPlant = id;
    }
    public void setLight(String ligh){
        light = ligh;
    }
    public void setSizaTall(String sTall ){
        sizeTall = sTall;
    }
    public void setsizeWide(String sWide){
        sizeWide = sWide;
    }
    public void setSizeUnit(String sUnit){
        sizeUnit = sUnit;
    }
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
   
   public void addUserPlant(UserPlant us){
        this.userplant.add(us);
    }
   
       public static Plant loadPlant(String pID){
        Connection con = null ;
        PreparedStatement stmt = null ;
        ResultSet result = null ; 
        Plant plants = new Plant();
        try { 
            con = DBManager.getConnection();
            String query = " select PlantsName , Light , SizeTall , SizeWide ,SizeUnit FROM plants WHERE IdPlants = ? ";
            stmt = con.prepareStatement(query);
            stmt.setString(1, pID);
            result = stmt.executeQuery();
            if(result.next()){
                plants.setID(pID);
                plants.setplantName(result.getString("PlantsName"));
                plants.setLight(result.getString("Light"));
                plants.setSizaTall(result.getString("SizeTall"));
                plants.setsizeWide(result.getString("SizeWide"));
                plants.setSizeUnit(result.getString("SizeUnit"));
                Vector<UserPlant> pList= UserPlant.loadPlant(pID);
                if(pList != null){
                    for(UserPlant up : pList){
                        plants.addUserPlant(up);
                        up.setPlant(plants);
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
        
        return plants;

    }
  public void save(){
        Connection con = null ;
        PreparedStatement stmt = null ;
        try { 
            String query ;
            con = DBManager.getConnection();
           
                query = "INSERT INTO plants (IdPlants,PlantsName,Light,SizeTall,SizeWide,SizeUnit) VALUES (?,?,?,?,?,?)";
                stmt.setString(1, this.idPlant);
                stmt.setString(2, this.plantsName) ;
                stmt.setString(3, this.light);
                stmt.setString(4, this.sizeTall);
                stmt.setString(5, this.sizeWide);
                stmt.setString(6, this.sizeUnit);
                int resutl = stmt.executeUpdate();
                System.out.println("Plant "+idPlant+"NOT exist => insert new records");
              
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

}
