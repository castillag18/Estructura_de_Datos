/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Tienda_controller;
import model.tienda;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class venta extends javax.swing.JFrame {

    /**
     * Creates new form vista_tienda
     */
    public venta() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
     
        
       
    }

    Tienda_controller tiendaco = new Tienda_controller();
    int tiend;
    
    
    @SuppressWarnings("unchecked")
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngrese = new javax.swing.JPanel();
        btnVenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo_vendedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtConprador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalVenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioUnidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadVendida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        btnRegresa = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngrese.setBackground(new java.awt.Color(255, 255, 255));
        jpIngrese.setForeground(new java.awt.Color(255, 255, 255));
        jpIngrese.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVenta.setBackground(new java.awt.Color(204, 204, 204));
        btnVenta.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(238, 112, 82));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cart (1).png"))); // NOI18N
        btnVenta.setText("Venta");
        btnVenta.setBorder(null);
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVentaMouseMoved(evt);
            }
        });
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentaMouseExited(evt);
            }
        });
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jpIngrese.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 70, 30));

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("Código del vendedor:");
        jpIngrese.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtCodigo_vendedor.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo_vendedorActionPerformed(evt);
            }
        });
        jpIngrese.add(txtCodigo_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 150, -1));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Código del comprador:");
        jpIngrese.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        txtConprador.setBackground(new java.awt.Color(204, 204, 204));
        txtConprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConpradorActionPerformed(evt);
            }
        });
        jpIngrese.add(txtConprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 150, -1));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Código del producto:");
        jpIngrese.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtCodigoProducto.setBackground(new java.awt.Color(204, 204, 204));
        jpIngrese.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cash-register_2.png"))); // NOI18N
        jLabel4.setText("Total Compra:");
        jpIngrese.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        txtTotalVenta.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVentaActionPerformed(evt);
            }
        });
        jpIngrese.add(txtTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 140, 30));

        jLabel5.setBackground(new java.awt.Color(238, 112, 82));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 82));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cart (1).png"))); // NOI18N
        jLabel5.setText("VENTA");
        jpIngrese.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel6.setBackground(new java.awt.Color(238, 112, 82));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 112, 82));
        jLabel6.setText("Precio por unidad: ");
        jpIngrese.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        txtPrecioUnidad.setBackground(new java.awt.Color(204, 204, 204));
        jpIngrese.add(txtPrecioUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 150, -1));

        jLabel7.setBackground(new java.awt.Color(238, 112, 82));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 112, 82));
        jLabel7.setText("Cantidad vendida:");
        jpIngrese.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        txtCantidadVendida.setBackground(new java.awt.Color(204, 204, 204));
        jpIngrese.add(txtCantidadVendida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        tblVenta.setBackground(new java.awt.Color(255, 255, 255));
        tblVenta.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tblVenta.setForeground(new java.awt.Color(0, 0, 0));
        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo vendedor", "Codigo del comprador", "Codigo del producto", "Precio por unidad", "Cantidad vendida"
            }
        ));
        jScrollPane1.setViewportView(tblVenta);

        jpIngrese.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 620, 200));

        btnRegresa.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresa.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        btnRegresa.setForeground(new java.awt.Color(238, 112, 82));
        btnRegresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left-arrow.png"))); // NOI18N
        btnRegresa.setText("Regresar al menu");
        btnRegresa.setBorder(null);
        btnRegresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRegresaMouseMoved(evt);
            }
        });
        btnRegresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresaMouseExited(evt);
            }
        });
        btnRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresaActionPerformed(evt);
            }
        });
        jpIngrese.add(btnRegresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 140, 30));

        getContentPane().add(jpIngrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 470));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(238, 112, 82));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout (1).png"))); // NOI18N
        jMenu1.setText("Salir");

        jMenuItem1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuItem1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jMenuItem1.setText("Cerrar seccion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/down-arrow.png"))); // NOI18N
        jMenuItem2.setText("Minimizar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
     tiendaco.create(new tienda(txtCodigo_vendedor.getText(), txtConprador.getText(), 
             txtCodigoProducto.getText(), Integer.parseInt(txtPrecioUnidad.getText()), Integer.parseInt(txtCantidadVendida.getText())));
     tiendaco.adminTabla(tblVenta);
     txtTotalVenta.setText(String.valueOf(tiendaco.result()));
    }//GEN-LAST:event_btnVentaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       int cerrar = JOptionPane.YES_NO_OPTION;
       int result = JOptionPane.showConfirmDialog(null, "Desea cerrar seccion?", "Exit", cerrar);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtCodigo_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo_vendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo_vendedorActionPerformed

    private void txtConpradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConpradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConpradorActionPerformed

    private void txtTotalVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVentaActionPerformed

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        
    }//GEN-LAST:event_btnVentaMouseClicked

    private void btnVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseExited
        btnVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_btnVentaMouseExited

    private void btnVentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseMoved
        btnVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_btnVentaMouseMoved

    private void btnRegresaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresaMouseMoved
        btnRegresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_btnRegresaMouseMoved

    private void btnRegresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresaMouseExited
        btnRegresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_btnRegresaMouseExited

    private void btnRegresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresaMouseClicked
       Menu_principal menu = new Menu_principal();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnRegresaMouseClicked

    private void btnRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setState(venta.ICONIFIED);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresa;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpIngrese;
    private static javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtCantidadVendida;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCodigo_vendedor;
    private javax.swing.JTextField txtConprador;
    private javax.swing.JTextField txtPrecioUnidad;
    private javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables
}
