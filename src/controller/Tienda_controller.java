/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.Tienda_controller;
import model.tienda;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Sueldo;

public class Tienda_controller {

    tienda moti = new tienda();

    static ArrayList<tienda> lista_venta = new ArrayList();
    static ArrayList<Sueldo> lista_vedidos = new ArrayList();

    public ArrayList<Sueldo> getLista_sueldo() {
        return lista_vedidos;
    }

    public void setLista_sueldo(ArrayList<Sueldo> lista_sueldo) {
        Tienda_controller.lista_vedidos = lista_sueldo;
    }

    public void create(tienda moti) {
        lista_venta.add(moti);

    }

    public void update(int index, tienda moti, javax.swing.JTable tblventa, javax.swing.JTable tblregistroventa) {
        lista_venta.set(index, moti);
        adminTabla((DefaultTableModel) tblventa.getModel(), lista_venta);

        admintable(tblregistroventa);

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

    public void delete(int index, javax.swing.JTable tblventa, javax.swing.JTable tblregistroventa) {
        lista_venta.remove(index);
        adminTabla((DefaultTableModel) tblventa.getModel(), lista_venta);
        admintable(tblregistroventa);
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

    public void adminTabla(
            DefaultTableModel tblventa,
            ArrayList<tienda> lista
    ) {

        while (tblventa.getRowCount() != 0) {
            tblventa.removeRow(0);
        }

        for (int i = 0; i < lista.size(); i++) {
            tblventa.addRow(new Object[]{
                lista.get(i).getCodigo_del_vende(),
                lista.get(i).getCodigo_comprador(),
                lista.get(i).getCodigo_del_prod(),
                lista.get(i).getPrecio_unidad(),
                lista.get(i).getCantidad_vendida()

            });

        }

    }

    public void admintable(javax.swing.JTable tblRegistroVenta) {
        Object[][] matriz = new Object[lista_venta.size()][4];
        for (int i = 0; i < lista_venta.size(); i++) {
            matriz[i][0] = lista_venta.get(i).getNombre_vende();
            matriz[i][1] = lista_venta.get(i).getCodigo_del_vende();
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
