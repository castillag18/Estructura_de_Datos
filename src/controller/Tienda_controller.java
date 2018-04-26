/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.Tienda_controller;
import model.tienda;
import java.util.ArrayList;

public class Tienda_controller {

    tienda moti = new tienda();
    ArrayList<tienda> lista_venta = new ArrayList();

    public void create(tienda moti) {
        lista_venta.add(moti);
    }

    public void update(int index, tienda moti) {
        lista_venta.set(index, moti);

    }

    public tienda read(int index) {
        return lista_venta.get(index);
    }

    public ArrayList<tienda> Read(String Filter) {
        ArrayList<tienda> Get = new ArrayList<>();
        for (tienda v1 : lista_venta) {
            if (v1.getNombre_vende().contains(Filter)) {
                Get.add(v1);
            }
        }
        return Get;
    }

    public void delete(int index) {
        lista_venta.remove(index);
    }

    public int result() {
        int n = 0;
        for (int i = 0; i < lista_venta.size(); i++) {
            n = n + lista_venta.get(i).getPrecio_unidad() * lista_venta.get(i).getCantidad_vendida();
        }
        return n;
    }

    public ArrayList<tienda> getLista_venta() {
        return lista_venta;
    }

    public void setLista_venta(ArrayList<tienda> lista_venta) {
        this.lista_venta = lista_venta;
    }

    public void adminTabla(javax.swing.JTable tblVenta) {
        Object[][] matriz = new Object[lista_venta.size()][5];
        for (int i = 0; i < lista_venta.size(); i++) {
            matriz[i][0] = lista_venta.get(i).getCodigo_del_vende();
            matriz[i][1] = lista_venta.get(i).getCodigo_comprador();
            matriz[i][2] = lista_venta.get(i).getCodigo_del_prod();
            matriz[i][3] = lista_venta.get(i).getPrecio_unidad();
            matriz[i][4] = lista_venta.get(i).getCantidad_vendida();

        }

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Codigo vendedor", "Codigo del comprador", "Codigo del producto", "Precio por unidad", "Cantidad vendida"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        if (tblVenta.getColumnModel().getColumnCount() > 0) {
            tblVenta.getColumnModel().getColumn(0).setResizable(false);
            tblVenta.getColumnModel().getColumn(1).setResizable(false);
            tblVenta.getColumnModel().getColumn(2).setResizable(false);
            tblVenta.getColumnModel().getColumn(3).setResizable(false);
            tblVenta.getColumnModel().getColumn(4).setResizable(false);

        }
    }

    public void admintable(javax.swing.JTable tblRegistroVenta) {
        Object[][] matriz = new Object[lista_venta.size()][4];
        for (int i = 0; i < lista_venta.size(); i++) {
            matriz[i][0] = lista_venta.get(i).getNombre_vende();
            matriz[i][1] = lista_venta.get(i).getCodigo_vende();
            matriz[i][2] = lista_venta.get(i).getCantidades_totales_vendidas();
            matriz[i][3] = lista_venta.get(i).getTotal_Vendido_en_pesos();

        }


        tblRegistroVenta.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre del Vendedor", "Codigo del Vendedor", "Cantidad Totales Vedidas", "Total  Vendido en Peso"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        if (tblRegistroVenta.getColumnModel().getColumnCount() > 0) {
            tblRegistroVenta.getColumnModel().getColumn(0).setResizable(false);
            tblRegistroVenta.getColumnModel().getColumn(1).setResizable(false);
            tblRegistroVenta.getColumnModel().getColumn(2).setResizable(false);
            tblRegistroVenta.getColumnModel().getColumn(3).setResizable(false);
            

        }

    }

}
