/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cosas_prov;

import cosas_emp.Archivo;
import cosas_emp.Busqueda;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan Nava Martinez
 */
public class Bajasprov extends javax.swing.JFrame {

    /**
     * Creates new form Bajasprov
     */
    public Bajasprov() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        taco = new javax.swing.JTable();
        Regresar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idce = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Marca", "Cantidad com", "Pago total"
            }
        ));
        jScrollPane1.setViewportView(taco);

        jScrollPane2.setViewportView(jScrollPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, 470, 153));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        Consultar.setText("Borrar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 39, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, 21));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BAJAS PROVEDORES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 168, -1));

        idce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idceActionPerformed(evt);
            }
        });
        idce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idceKeyTyped(evt);
            }
        });
        getContentPane().add(idce, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 39, 215, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/14.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        // TODO add your handling code here:
        if(idce.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "No hay ningun id escrito");
        }
        else{
        int po = 0;
        
        DefaultTableModel m;
        ArrayList<Provedores> prov;
        prov = Archivo.leer("prov.dat");
        int idces;
        idces = Integer.parseInt(idce.getText());
        
        try {
            po = Busqueda.buscarIdprovArrayList(prov, idces);
        } catch (IOException ex) {
            Logger.getLogger(Bajasprov.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(po != -1){
            prov.remove(po);
            JOptionPane.showMessageDialog(this,"El id: "+ idces + " a sido borrado exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(this,"El id: "+ idces + " no existe");
        }
        
        Archivo.guardar(prov, "prov.dat");
        m = (DefaultTableModel)taco.getModel();
        Object[] rowData = new Object[6];
        
        for(int i = 0; i < taco.getRowCount(); i++){
            m.removeRow(i);
            i-=1;
        }
        
        if(m.getRowCount() == 0){
            for(Provedores e: prov){
                if(e instanceof Provedores){
                rowData[0] = ((Provedores)e).getId();
                rowData[1] = ((Provedores)e).getNombre();
                rowData[2] = ((Provedores)e).getApellido();
                rowData[3] = ((Provedores)e).getMarca();
                rowData[4] = ((Provedores)e).getcT();
                rowData[5] = ((Provedores)e).gettot();
                m.addRow(rowData);
                }
            }
        }
        idce.setText(null);
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void idceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idceActionPerformed

    private void idceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idceKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;
        
        
        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }
        
        if(idce.getText().trim().length() == 7 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
           
            JOptionPane.showMessageDialog(this, "No puede ser mayor a 7 digitos");
        }
    }//GEN-LAST:event_idceKeyTyped

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
            java.util.logging.Logger.getLogger(Bajasprov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bajasprov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bajasprov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bajasprov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bajasprov().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField idce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable taco;
    // End of variables declaration//GEN-END:variables
}
