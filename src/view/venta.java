/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Tienda_controller;
import controller.VendedorController;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import model.tienda;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Vendedor;

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
        tiendaco.adminTabla((DefaultTableModel) tblVenta.getModel(), tiendaco.getLista_venta());
        llenar_combo();
    }

    Tienda_controller tiendaco = new Tienda_controller();
    VendedorController vende = new VendedorController();
    int tiend;

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngrese = new javax.swing.JPanel();
        btnVenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConprador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioUnidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadVendida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        btnRegresa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_RgistrarVendedor = new javax.swing.JButton();
        cmbx_Vendedor = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
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
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jpIngrese.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 70, 30));

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("*vendedor:");
        jpIngrese.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("*Código del comprador:");
        jpIngrese.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        txtConprador.setBackground(new java.awt.Color(204, 204, 204));
        txtConprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConpradorActionPerformed(evt);
            }
        });
        txtConprador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConpradorKeyTyped(evt);
            }
        });
        jpIngrese.add(txtConprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 150, -1));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("*Código del producto:");
        jpIngrese.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtCodigoProducto.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyTyped(evt);
            }
        });
        jpIngrese.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));

        jLabel5.setBackground(new java.awt.Color(238, 112, 82));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 82));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cart (1).png"))); // NOI18N
        jLabel5.setText("VENTA");
        jpIngrese.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel6.setBackground(new java.awt.Color(238, 112, 82));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 112, 82));
        jLabel6.setText("*Precio por unidad: ");
        jpIngrese.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        txtPrecioUnidad.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecioUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioUnidadKeyTyped(evt);
            }
        });
        jpIngrese.add(txtPrecioUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 150, -1));

        jLabel7.setBackground(new java.awt.Color(238, 112, 82));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 112, 82));
        jLabel7.setText("*Cantidad vendida:");
        jpIngrese.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        txtCantidadVendida.setBackground(new java.awt.Color(204, 204, 204));
        txtCantidadVendida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVendidaKeyTyped(evt);
            }
        });
        jpIngrese.add(txtCantidadVendida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        tblVenta.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo vendedor", "Codigo del comprador", "Codigo del producto", "Precio por unidad", "Cantidad vendida"
            }
        ));
        tblVenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblVenta);
        if (tblVenta.getColumnModel().getColumnCount() > 0) {
            tblVenta.getColumnModel().getColumn(0).setResizable(false);
            tblVenta.getColumnModel().getColumn(1).setResizable(false);
            tblVenta.getColumnModel().getColumn(2).setResizable(false);
            tblVenta.getColumnModel().getColumn(4).setResizable(false);
        }

        jpIngrese.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 620, 200));

        btnRegresa.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresa.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        btnRegresa.setForeground(new java.awt.Color(238, 112, 82));
        btnRegresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left-arrow.png"))); // NOI18N
        btnRegresa.setText("Regresar al menu");
        btnRegresa.setBorder(null);
        btnRegresa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*Campo Obligatorio");
        jpIngrese.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btn_RgistrarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/network_1.png"))); // NOI18N
        btn_RgistrarVendedor.setText("Registrar Vendedor");
        btn_RgistrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RgistrarVendedorActionPerformed(evt);
            }
        });
        jpIngrese.add(btn_RgistrarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        cmbx_Vendedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpIngrese.add(cmbx_Vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 150, -1));

        getContentPane().add(jpIngrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar1MousePressed(evt);
            }
        });

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(238, 112, 82));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout (1).png"))); // NOI18N
        jMenu1.setText("Salir");

        jMenuItem1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuItem1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jMenuItem1.setText("Cerrar sesion");
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
        try {
            if (cmbx_Vendedor.getItemCount() > 0 && txtConprador.getText().length() == 8 && txtCodigoProducto.getText().length() == 8) {
                tiendaco.create(new tienda(
                        vende.Read(cmbx_Vendedor.getSelectedItem().toString()),
                        txtConprador.getText(),
                        txtCodigoProducto.getText(),
                        Integer.parseInt(txtPrecioUnidad.getText()),
                        Integer.parseInt(txtCantidadVendida.getText())));
                tiendaco.adminTabla((DefaultTableModel) tblVenta.getModel(), tiendaco.getLista_venta());
                borrartxt();
            } else {
                JOptionPane.showMessageDialog(null, "los CODIGOS debe tener 8 digitos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "*Complete todos los campos requeridos ", "ERROR", 2);
        }


    }//GEN-LAST:event_btnVentaActionPerformed

    public void llenar_combo(){
        cmbx_Vendedor.removeAllItems();
        
        for (int i = 0; i < vende.getLista_Vendedor().size(); i++) {
            cmbx_Vendedor.addItem(vende.getLista_Vendedor().get(i).getCodigo());
            System.out.print("\n"+i+"  "+vende.getLista_Vendedor().get(i).getCodigo());
        }
        System.out.println(cmbx_Vendedor.getItemCount());
        for (int i = 0; i < vende.getLista_Vendedor().size(); i++) {
            System.out.print("\n"+vende.getLista_Vendedor().get(i).getCodigo());
        }
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int cerrar = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea cerrar sesion?", "Exit", cerrar);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtConpradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConpradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConpradorActionPerformed

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked

    }//GEN-LAST:event_btnVentaMouseClicked

    private void btnVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseExited
        btnVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_btnVentaMouseExited

    private void btnVentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseMoved
        btnVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_btnVentaMouseMoved

    private void btnRegresaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresaMouseMoved
        btnRegresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_btnRegresaMouseMoved

    private void btnRegresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresaMouseExited
        btnRegresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
    int xx, xy;
    private void jMenuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jMenuBar1MousePressed

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jMenuBar1MouseDragged

    private void txtCodigoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyTyped
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
//
//        if (k == 8) {
//            txtCodigoProducto.transferFocus();
//        }
    }//GEN-LAST:event_txtCodigoProductoKeyTyped

    private void txtConpradorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConpradorKeyTyped
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

//        if (k == 8) {
//            txtConprador.transferFocus();
//        }
    }//GEN-LAST:event_txtConpradorKeyTyped

    private void txtPrecioUnidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUnidadKeyTyped
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
            txtPrecioUnidad.transferFocus();
        }
    }//GEN-LAST:event_txtPrecioUnidadKeyTyped

    private void txtCantidadVendidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVendidaKeyTyped
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
//
//        if (k == 8) {
//            txtCantidadVendida.transferFocus();
//        }
    }//GEN-LAST:event_txtCantidadVendidaKeyTyped

    private void btn_RgistrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RgistrarVendedorActionPerformed
        new VendedorView();
    }//GEN-LAST:event_btn_RgistrarVendedorActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        llenar_combo();
    }//GEN-LAST:event_formWindowGainedFocus

    public void borrartxt() {
        String b = "";
        txtCantidadVendida.setText(b);
        txtCodigoProducto.setText(b);
        cmbx_Vendedor.setSelectedIndex(0);
        txtConprador.setText(b);
        txtPrecioUnidad.setText(b);
    }

    private Boolean ValTend(String txtCantidadVendida, String txtCodigoProducto, String txtCodigo_vendedor, String txtConprador, String txtPrecioUnidad) {
        boolean V = true;
        //condicion para saber si la entrada esta o no vacia
        try {
            if (txtCantidadVendida == null || txtCantidadVendida.equals("") || txtCodigoProducto == null || txtCodigoProducto.equals("") || txtCodigo_vendedor == null || txtCodigo_vendedor.equals("") || txtConprador == null || txtConprador.equals("") || txtPrecioUnidad == null || txtPrecioUnidad.equals("")) {
                JOptionPane.showMessageDialog(null, "Ha dejado campos vacios", "ERROR", 0);
                V = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite solo valores númericos", "ERROR", 0);
            V = false;
        }
        return V;
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
            java.util.logging.Logger.getLogger(venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_RgistrarVendedor;
    private javax.swing.JComboBox cmbx_Vendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpIngrese;
    private static javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtCantidadVendida;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtConprador;
    private javax.swing.JTextField txtPrecioUnidad;
    // End of variables declaration//GEN-END:variables
}
