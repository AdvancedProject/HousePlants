/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakeItGreen;

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
    Vector<UserPlant> up;
    
    public Plant(){
        up = new Vector<UserPlant>();
    }
    
    public Plant(String idPlant,String plantsName,String light,String sizeTall,String sizeWide,String sizeUnit){
        this.idPlant = idPlant;
        this.plantsName = plantsName;
        this.light = light;
        this.sizeTall = sizeTall;
        this.sizeWide = sizeWide;
        this.sizeUnit = sizeUnit;   
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
        this.up.add(us);
    }
}
