/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseplants;

import javax.swing.JFrame;

/**
 *
 * @author mac
 */
public class welcomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form welcomeFrame
     */
    public welcomeFrame() {
        initComponents();
        
pack();
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        singIn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        singIn.setText("sign in");
        singIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singInActionPerformed(evt);
            }
        });
        getContentPane().add(singIn);
        singIn.setBounds(50, 390, 150, 70);

        jButton2.setText("sign up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(295, 389, 150, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseplants/Screenshot (344).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singInActionPerformed
        signInFrame sIN = new signInFrame ();
    }//GEN-LAST:event_singInActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        signUpFrame sIN = new signUpFrame ();
    }//GEN-LAST:event_jButton2ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton singIn;
    // End of variables declaration//GEN-END:variables
}
