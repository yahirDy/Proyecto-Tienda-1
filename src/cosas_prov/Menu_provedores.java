/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cosas_prov;

import cosas_prov.Consultasprov;
import cosas_prov.Bajasprov;
import cosas_prov.Altasprov;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan Nava Martinez
 */
public class Menu_provedores extends javax.swing.JFrame {

    /**
     * Creates new form Menu_provedores
     */
    public Menu_provedores() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mod = new javax.swing.JButton();
        rep = new javax.swing.JButton();
        sal = new javax.swing.JButton();
        Altas = new javax.swing.JButton();
        Bajas = new javax.swing.JButton();
        Cons = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mod.setText("Modificaciones");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });
        getContentPane().add(Mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 162, -1, -1));

        rep.setText("Reportes");
        rep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repActionPerformed(evt);
            }
        });
        getContentPane().add(rep, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 197, -1, -1));

        sal.setText("Regresar");
        sal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salActionPerformed(evt);
            }
        });
        getContentPane().add(sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 121, -1, -1));

        Altas.setText("Altas");
        Altas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasActionPerformed(evt);
            }
        });
        getContentPane().add(Altas, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 39, -1, -1));

        Bajas.setText("Bajas");
        Bajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajasActionPerformed(evt);
            }
        });
        getContentPane().add(Bajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 80, -1, -1));

        Cons.setText("Consultas");
        Cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsActionPerformed(evt);
            }
        });
        getContentPane().add(Cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 121, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU PROVEDORES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 177, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/16.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 110, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModActionPerformed
        // TODO add your handling code here:
        Modificacionesprov mc;
        mc = new Modificacionesprov();
        mc.setVisible(true);
        JOptionPane.showMessageDialog(this, "El boton buscar sirve para que veas si existe el id\n"
                + "por si no lo recuerdas");
    }//GEN-LAST:event_ModActionPerformed

    private void repActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repActionPerformed
        // TODO add your handling code here:
        Reportesprov rep;
        rep = new Reportesprov();
        rep.setVisible(true);
    }//GEN-LAST:event_repActionPerformed

    private void salActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_salActionPerformed

    private void AltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltasActionPerformed
        // TODO add your handling code here:
        Altasprov alt;
        alt = new Altasprov();
        alt.setVisible(true);
    }//GEN-LAST:event_AltasActionPerformed

    private void BajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajasActionPerformed
        // TODO add your handling code here:
        Bajasprov ba;
        ba = new Bajasprov();
        ba.setVisible(true);
    }//GEN-LAST:event_BajasActionPerformed

    private void ConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsActionPerformed
        // TODO add your handling code here:
        Consultasprov cons;
        cons = new Consultasprov();
        cons.setVisible(true);
    }//GEN-LAST:event_ConsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_provedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_provedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_provedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_provedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_provedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Altas;
    private javax.swing.JButton Bajas;
    private javax.swing.JButton Cons;
    private javax.swing.JButton Mod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton rep;
    private javax.swing.JButton sal;
    // End of variables declaration//GEN-END:variables
}
