/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseplants;

import MakeItGreen.DBManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class plantInfoFrame extends javax.swing.JFrame {

   String ID;
   String user;
   String pass;
   public plantInfoFrame(){
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
   }
   
    public plantInfoFrame(String ID) {
        this.ID=ID;
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
    }
    
    public plantInfoFrame(String user ,String pass) {
        this.user=user;
        this.pass=pass;
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        planetName = new javax.swing.JLabel();
        waterpanel = new javax.swing.JPanel();
        water = new javax.swing.JLabel();
        compostpanel = new javax.swing.JPanel();
        compost = new javax.swing.JLabel();
        wateryespanel = new javax.swing.JPanel();
        waterYes = new javax.swing.JCheckBox();
        waternopanel = new javax.swing.JPanel();
        waterNo = new javax.swing.JCheckBox();
        compostyeapanel = new javax.swing.JPanel();
        compostYes = new javax.swing.JCheckBox();
        compostplanel = new javax.swing.JPanel();
        comostNo = new javax.swing.JCheckBox();
        calenderpanel = new javax.swing.JPanel();
        celender = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        backpanel = new javax.swing.JPanel();
        done = new javax.swing.JButton();
        deletpanel = new javax.swing.JPanel();
        plantInfo = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        delet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(110, 44));

        planetName.setText("Plant name: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(planetName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(129, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(planetName)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        waterpanel.setPreferredSize(new java.awt.Dimension(140, 44));

        water.setText("Watring");

        javax.swing.GroupLayout waterpanelLayout = new javax.swing.GroupLayout(waterpanel);
        waterpanel.setLayout(waterpanelLayout);
        waterpanelLayout.setHorizontalGroup(
            waterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(waterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(waterpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(water)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        waterpanelLayout.setVerticalGroup(
            waterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(waterpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(waterpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(water)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        compostpanel.setPreferredSize(new java.awt.Dimension(0, 44));

        compost.setText("Compost");

        javax.swing.GroupLayout compostpanelLayout = new javax.swing.GroupLayout(compostpanel);
        compostpanel.setLayout(compostpanelLayout);
        compostpanelLayout.setHorizontalGroup(
            compostpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(compostpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compostpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compost)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compostpanelLayout.setVerticalGroup(
            compostpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(compostpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compostpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compost)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        wateryespanel.setPreferredSize(new java.awt.Dimension(100, 44));

        waterYes.setText("Yes");
        waterYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterYesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wateryespanelLayout = new javax.swing.GroupLayout(wateryespanel);
        wateryespanel.setLayout(wateryespanelLayout);
        wateryespanelLayout.setHorizontalGroup(
            wateryespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
            .addGroup(wateryespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wateryespanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(waterYes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        wateryespanelLayout.setVerticalGroup(
            wateryespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(wateryespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wateryespanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(waterYes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        waternopanel.setPreferredSize(new java.awt.Dimension(100, 44));

        waterNo.setText("No");
        waterNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout waternopanelLayout = new javax.swing.GroupLayout(waternopanel);
        waternopanel.setLayout(waternopanelLayout);
        waternopanelLayout.setHorizontalGroup(
            waternopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waternopanelLayout.createSequentialGroup()
                .addComponent(waterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        waternopanelLayout.setVerticalGroup(
            waternopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(waterNo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        compostYes.setText("Yes");
        compostYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compostYesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout compostyeapanelLayout = new javax.swing.GroupLayout(compostyeapanel);
        compostyeapanel.setLayout(compostyeapanelLayout);
        compostyeapanelLayout.setHorizontalGroup(
            compostyeapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(compostyeapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compostyeapanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compostYes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compostyeapanelLayout.setVerticalGroup(
            compostyeapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(compostyeapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compostyeapanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compostYes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        comostNo.setText("No");

        javax.swing.GroupLayout compostplanelLayout = new javax.swing.GroupLayout(compostplanel);
        compostplanel.setLayout(compostplanelLayout);
        compostplanelLayout.setHorizontalGroup(
            compostplanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compostplanelLayout.createSequentialGroup()
                .addComponent(comostNo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        compostplanelLayout.setVerticalGroup(
            compostplanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comostNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        celender.setText("Open Calender");
        celender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calenderpanelLayout = new javax.swing.GroupLayout(calenderpanel);
        calenderpanel.setLayout(calenderpanelLayout);
        calenderpanelLayout.setHorizontalGroup(
            calenderpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
            .addGroup(calenderpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(calenderpanelLayout.createSequentialGroup()
                    .addGap(0, 89, Short.MAX_VALUE)
                    .addComponent(celender)
                    .addGap(0, 90, Short.MAX_VALUE)))
        );
        calenderpanelLayout.setVerticalGroup(
            calenderpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(calenderpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(calenderpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(celender)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        backpanel.setPreferredSize(new java.awt.Dimension(100, 44));

        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backpanelLayout = new javax.swing.GroupLayout(backpanel);
        backpanel.setLayout(backpanelLayout);
        backpanelLayout.setHorizontalGroup(
            backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(done)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        backpanelLayout.setVerticalGroup(
            backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(done)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deletpanel.setPreferredSize(new java.awt.Dimension(100, 44));

        javax.swing.GroupLayout deletpanelLayout = new javax.swing.GroupLayout(deletpanel);
        deletpanel.setLayout(deletpanelLayout);
        deletpanelLayout.setHorizontalGroup(
            deletpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        deletpanelLayout.setVerticalGroup(
            deletpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        plantInfo.setBackground(new java.awt.Color(204, 204, 255));
        plantInfo.setText("Plant Info here .............................................");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        delet.setText("Delete");
        delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(compostpanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(waterpanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(wateryespanel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(waternopanel, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(compostyeapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(compostplanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calenderpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(back)
                        .addGap(18, 18, 18)
                        .addComponent(backpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(deletpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(delet))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(plantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(waterpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wateryespanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waternopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(compostyeapanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(compostpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(compostplanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calenderpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(deletpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(delet)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   class planetName implements ActionListener{ 
    @Override
    public void actionPerformed(ActionEvent e) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
             con = DBManager.getConnection();
             String SQL = "SELECT `PlantsName` FROM `group3`.`plants` where `IdPlants`=?;";
             pstmt =con.prepareStatement(SQL);
             pstmt.setString(1, ID);
             ResultSet rs = pstmt.executeQuery();
           if ( rs.next( ) ) {
             String name =rs.getString("PlantsName");
             planetName.setText(name);
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
    }
    }
    
    class planetTnfo implements ActionListener{ 
    @Override
    public void actionPerformed(ActionEvent e) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
             con = DBManager.getConnection();
             String SQL = "SELECT Light , SizeTall ,SizeWide , SizeUnit FROM group3.plants where IdPlants = ?;";
             pstmt =con.prepareStatement(SQL);
             pstmt.setString(1, ID);
             ResultSet rs = pstmt.executeQuery();
           if ( rs.next( ) ) {
             String light =rs.getString("Light");
             String sizeTall =rs.getString("SizeTall");
             String sizeWide =rs.getString("SizeWide");
             String sizeUnit =rs.getString("SizeUnit");
             String info =" It need "+light+" light \n Size: To "+sizeTall+" "+sizeUnit+" tall and "+sizeWide+" "+sizeUnit+"wide.";
             plantInfo.setText(info);
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
    }
    }
     
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        profileFrame profF = new profileFrame ();    }//GEN-LAST:event_backActionPerformed

    
    private void deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletActionPerformed
        Connection con = null ;
        PreparedStatement stmt = null ;
        try {
            con = DBManager.getConnection();
            String query ="delete from `group3`.`plants` where `IdPlants` = ?;";
            stmt = con.prepareStatement(query);
            stmt.setString(1, ID);
            int result = stmt.executeUpdate();
            System .out.println("result = "+result);
        }catch (Exception e ){
            
            System.out.println("delete one plant record was NOT sucessful");
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
        
    }//GEN-LAST:event_deletActionPerformed

    private void celenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celenderActionPerformed

Calender calender = new Calender();    }//GEN-LAST:event_celenderActionPerformed

    private void waterNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waterNoActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
        if( waterYes.isSelected()){
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
            con = DBManager.getConnection();
            pstmt=con.prepareStatement("INSERT INTO `group3`.`userplants` VALUES (?,?,?);");
            pstmt.setString(1, user);// user name
            pstmt.setString(2, ID);//id
            pstmt.setString(3, );// date
           
           
            
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
        else{
            String message ="Plant watering option is 'No' \n Choose 'Yes' to save .";
            JOptionPane.showMessageDialog(null,message);
        }
    }//GEN-LAST:event_doneActionPerformed

    private void waterYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waterYesActionPerformed

    private void compostYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compostYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compostYesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton back;
    public javax.swing.JPanel backpanel;
    public javax.swing.JPanel calenderpanel;
    public javax.swing.JButton celender;
    public javax.swing.JCheckBox comostNo;
    public javax.swing.JLabel compost;
    public javax.swing.JCheckBox compostYes;
    public javax.swing.JPanel compostpanel;
    public javax.swing.JPanel compostplanel;
    public javax.swing.JPanel compostyeapanel;
    public javax.swing.JButton delet;
    public javax.swing.JPanel deletpanel;
    public javax.swing.JButton done;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel planetName;
    public javax.swing.JLabel plantInfo;
    public javax.swing.JLabel water;
    public javax.swing.JCheckBox waterNo;
    public javax.swing.JCheckBox waterYes;
    public javax.swing.JPanel waternopanel;
    public javax.swing.JPanel waterpanel;
    public javax.swing.JPanel wateryespanel;
    // End of variables declaration//GEN-END:variables
}
