/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakeItGreen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;

/**
 *
 * @author mac
 */
public class UserPlant {
      User user;
    Plant plant;
    Vector<Date> date;
    
    public UserPlant(){
        date= new Vector<Date>();
    }
    public UserPlant(User user,Plant plant){
        this.user = user;
        this.plant = plant;
    }
    public void addDate(Date d){
        this.date.add(d);
    }
    
    public void save(){
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
    }
}
