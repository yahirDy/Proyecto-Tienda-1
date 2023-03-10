/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cosas_emp;

import cosas_emp.Reportes;
import cosas_emp.Consultas;
import cosas_emp.Bajas;
import cosas_emp.Altas;
import cosas_emp.Empleado;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan Nava Martinez
 */
public class Menu_Empleado extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Empleado
     */
    public Menu_Empleado() {
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

        Altas = new javax.swing.JButton();
        Bajas = new javax.swing.JButton();
        Cons = new javax.swing.JButton();
        Mod = new javax.swing.JButton();
        rep = new javax.swing.JButton();
        sal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Altas.setText("Altas");
        Altas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasActionPerformed(evt);
            }
        });
        getContentPane().add(Altas, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 38, -1, -1));

        Bajas.setText("Bajas");
        Bajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajasActionPerformed(evt);
            }
        });
        getContentPane().add(Bajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 79, -1, -1));

        Cons.setText("Consultas");
        Cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsActionPerformed(evt);
            }
        });
        getContentPane().add(Cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 120, -1, -1));

        Mod.setText("Modificaciones");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });
        getContentPane().add(Mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 161, -1, -1));

        rep.setText("Reportes");
        rep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repActionPerformed(evt);
            }
        });
        getContentPane().add(rep, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 196, -1, -1));

        sal.setText("Regresar");
        sal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salActionPerformed(evt);
            }
        });
        getContentPane().add(sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 120, 90, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU EMPLEADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 6, 142, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 380, 240));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltasActionPerformed
        // TODO add your handling code here:
        Altas alt;
        alt = new Altas();
        alt.setVisible(true);   
    }//GEN-LAST:event_AltasActionPerformed

    private void salActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_salActionPerformed

    private void repActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repActionPerformed
        // TODO add your handling code here:
        Reportes rep;
        rep = new Reportes();
        rep.setVisible(true);
    }//GEN-LAST:event_repActionPerformed

    private void BajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajasActionPerformed
        // TODO add your handling code here:
     Bajas ba = new Bajas();
     ba = new Bajas();
     ba.setVisible(true);
    }//GEN-LAST:event_BajasActionPerformed

    private void ConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsActionPerformed
        // TODO add your handling code here:
        Consultas cons = new Consultas();
        cons = new Consultas();
        cons.setVisible(true);
    }//GEN-LAST:event_ConsActionPerformed

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModActionPerformed
        // TODO add your handling code here:
        Modificaciones mc = new Modificaciones();
        mc = new Modificaciones();
        mc.setVisible(true);
        JOptionPane.showMessageDialog(this, "El boton buscar sirve para que veas si existe el id\n"
                + "por si no lo recuerdas");
    }//GEN-LAST:event_ModActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Empleado().setVisible(true);
            }
        });
        
        ArrayList<Empleado> emp;
        emp = new ArrayList();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Altas;
    private javax.swing.JButton Bajas;
    private javax.swing.JButton Cons;
    private javax.swing.JButton Mod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton rep;
    private javax.swing.JButton sal;
    // End of variables declaration//GEN-END:variables
}
