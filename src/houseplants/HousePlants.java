/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseplants;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class HousePlants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       new welcomeFrame();
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
LocalDate localDate = LocalDate.now();
System.out.println(dtf.format(localDate)); 
    }
    
}
