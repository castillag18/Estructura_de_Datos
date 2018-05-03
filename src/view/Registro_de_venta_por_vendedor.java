/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import controller.Tienda_controller;
import controller.sueldo_controller;
import java.awt.event.KeyEvent;
import model.tienda;
import model.Sueldo;
import view.*;


public class Registro_de_venta_por_vendedor extends javax.swing.JFrame {

    /**
     * Creates new form Venta
     */
    public Registro_de_venta_por_vendedor() {
        initComponents();
        setResizable(true);
        setLocationRelativeTo(null);
        tiendaco.admintable(tblRegistroVenta);
        
    }

    Tienda_controller tiendaco = new Tienda_controller();
    sueldo_controller suco = new sueldo_controller();
    int tend;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombreVende = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoVende = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidadVendidas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalVendido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroVenta = new javax.swing.JTable();
        btnReg = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(238, 112, 82));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left-arrow.png"))); // NOI18N
        jToggleButton1.setText("Regresar al Menu");
        jToggleButton1.setBorder(null);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 130, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("Nombre del Vendedor:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtNombreVende.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreVende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreVendeActionPerformed(evt);
            }
        });
        txtNombreVende.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreVendeKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 130, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Código del Vendedor:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        txtCodigoVende.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoVende.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoVendeKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigoVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 130, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Cantidad Totales Vendidas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtCantidadVendidas.setBackground(new java.awt.Color(204, 204, 204));
        txtCantidadVendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVendidasActionPerformed(evt);
            }
        });
        txtCantidadVendidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVendidasKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidadVendidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 130, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("Total Vendido en Pesos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        txtTotalVendido.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalVendido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalVendidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTotalVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 130, -1));

        tblRegistroVenta.setBackground(new java.awt.Color(255, 255, 255));
        tblRegistroVenta.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tblRegistroVenta.setForeground(new java.awt.Color(0, 0, 0));
        tblRegistroVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Vendedor", "Codigo del Vendedor", "Cantidad Totales Vedidas", "Total  Vendido en Peso"
            }
        ));
        jScrollPane1.setViewportView(tblRegistroVenta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 600, 190));

        btnReg.setBackground(new java.awt.Color(204, 204, 204));
        btnReg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        btnReg.setForeground(new java.awt.Color(238, 112, 82));
        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notes.png"))); // NOI18N
        btnReg.setText("Registro");
        btnReg.setBorder(null);
        btnReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        jPanel1.add(btnReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 164, 90, 30));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 82));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notes.png"))); // NOI18N
        jLabel5.setText("Registro de Ventas de cada Vendedor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 670, 470));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(238, 112, 82));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout (1).png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Seccion");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int cerrarr = JOptionPane.YES_NO_OPTION;
        int resulta = JOptionPane.showConfirmDialog(null, "Desea cerrar seccion?", "Exit", cerrarr);
        if (resulta
                == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        Menu_principal menu = new Menu_principal();
        menu.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setState(Registro_de_venta_por_vendedor.ICONIFIED);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtCantidadVendidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVendidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVendidasActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        try {
            if (txtCodigoVende.getText().length() == 8) {
                tiendaco.create(new tienda(txtNombreVende.getText(), txtCodigoVende.getText(), Integer.parseInt(txtCantidadVendidas.getText()), Integer.parseInt(txtTotalVendido.getText())));
                tiendaco.admintable(tblRegistroVenta);
                
                borrartxt();
                
            } else if (txtCodigoVende.getText().length() > 8 || txtCodigoVende.getText().length() < 8) {
                JOptionPane.showMessageDialog(null, "El CODIGO DEL VENDEDOR es de 8 digitos.\nEl CODIGO ingresado contiene " + txtCodigoVende.getText().length() + " digitos.", "Error", 2);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Complete Todos los Campos Requeridos", "ERROR", 2);
        }
        


    }//GEN-LAST:event_btnRegActionPerformed

    private void txtCodigoVendeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVendeKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }

        if (k == 8) {
            txtCodigoVende.transferFocus();
        }
    }//GEN-LAST:event_txtCodigoVendeKeyTyped

    private void txtNombreVendeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreVendeKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            txtNombreVende.setCursor(null);

        } else if ((int) evt.getKeyChar() > 32 && evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            txtNombreVende.setCursor(null);

        }

    }//GEN-LAST:event_txtNombreVendeKeyTyped

    private void txtCantidadVendidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVendidasKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }

        if (k == 8) {
            txtCodigoVende.transferFocus();
        }
    }//GEN-LAST:event_txtCantidadVendidasKeyTyped

    private void txtTotalVendidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalVendidoKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }

        if (k == 8) {
            txtCodigoVende.transferFocus();
        }
    }//GEN-LAST:event_txtTotalVendidoKeyTyped

    private void txtNombreVendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVendeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVendeActionPerformed
    public void borrartxt() {
        String b = "";
        txtCantidadVendidas.setText(b);
        txtCodigoVende.setText(b);
        txtNombreVende.setText(b);
        txtTotalVendido.setText(b);

    }

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
            java.util.logging.Logger.getLogger(Registro_de_venta_por_vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_de_venta_por_vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_de_venta_por_vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_de_venta_por_vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_de_venta_por_vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private static javax.swing.JTable tblRegistroVenta;
    private javax.swing.JTextField txtCantidadVendidas;
    private javax.swing.JTextField txtCodigoVende;
    private javax.swing.JTextField txtNombreVende;
    private javax.swing.JTextField txtTotalVendido;
    // End of variables declaration//GEN-END:variables
}
