package controller;

import model.tienda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Vendedor;

public class Tienda_controller {

    tienda moti = new tienda();

    static ArrayList<tienda> lista_venta = new ArrayList();

    public void create(tienda moti) {
        lista_venta.add(moti);
    }

    public void update(int index, tienda moti, javax.swing.JTable tblventa, javax.swing.JTable tblregistroventa) {
        lista_venta.set(index, moti);
        adminTabla((DefaultTableModel) tblventa.getModel(), lista_venta);

        admintable((DefaultTableModel) tblregistroventa.getModel(), Registro());

    }

    public tienda read(int index) {
        return lista_venta.get(index);
    }

    public ArrayList<tienda> Read(String Filter) {
        ArrayList<tienda> Get = new ArrayList<>();
        for (tienda v1 : lista_venta) {
            if (v1.getVende().getNombre().contains(Filter)) {
                Get.add(v1);
            }
        }
        return Get;
    }

    public void delete(int index, javax.swing.JTable tblventa, javax.swing.JTable tblregistroventa) {
        lista_venta.remove(index);
        adminTabla((DefaultTableModel) tblventa.getModel(), lista_venta);
        admintable((DefaultTableModel) tblregistroventa.getModel(), Registro());
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

    public void adminTabla(DefaultTableModel tblventa, ArrayList<tienda> lista) {

        while (tblventa.getRowCount() != 0) {
            tblventa.removeRow(0);
        }

        for (int i = 0; i < lista.size(); i++) {
            tblventa.addRow(new Object[]{
                lista.get(i).getVende().getCodigo(),
                lista.get(i).getCodigo_comprador(),
                lista.get(i).getCodigo_del_prod(),
                lista.get(i).getPrecio_unidad(),
                lista.get(i).getCantidad_vendida()

            });

        }

    }

    public void mayores3(DefaultTableModel tblRegistroVenta, ArrayList<String[]> Arr) {
        while (tblRegistroVenta.getRowCount() != 0) {
            tblRegistroVenta.removeRow(0);
        }
        for (String[] ar : Arr) {
            tblRegistroVenta.addRow(ar);
        }
    }

    public void admintable(DefaultTableModel tblRegistroVenta, ArrayList<String[]> Arr) {
        while (tblRegistroVenta.getRowCount() != 0) {
            tblRegistroVenta.removeRow(0);
        }
        for (String[] ar : Arr) {
            tblRegistroVenta.addRow(ar);
        }
    }

    public void admintable(DefaultTableModel tblRegistroVenta, String[] Arr) {
        while (tblRegistroVenta.getRowCount() != 0) {
            tblRegistroVenta.removeRow(0);
        }
        tblRegistroVenta.addRow(Arr);
    }

    private int TotalCantidad(String Codigo) {
        int Vendido = 0;
        for (tienda ti : lista_venta) {
            if (Codigo.equals(ti.getVende().getCodigo())) {
                Vendido += ti.getCantidad_vendida();
            }
        }
        return Vendido;
    }

    private int TotalVendido(String Codigo) {
        int Vendido = 0;
        for (tienda ti : lista_venta) {
            if (Codigo.equals(ti.getVende().getCodigo())) {
                Vendido += (ti.getCantidad_vendida() * ti.getPrecio_unidad());
            }
        }
        return Vendido;
    }

    public ArrayList<String[]> Registro() {
        ArrayList<String[]> Array = new ArrayList<String[]>();
        for (Vendedor e : VendedorController.Lista_Vendedor) {
            Array.add(new String[]{e.getNombre(), e.getCodigo(), TotalCantidad(e.getCodigo()) + "", TotalVendido(e.getCodigo()) + ""});
        }
        return Array;
    }

    public ArrayList<String[]> GenerarSueldo() {
        ArrayList<String[]> Registros = Registro();
        ArrayList<String[]> Sueldo = new ArrayList();
        for (String[] Reg : Registros) {
            double i = 0;
            if (Integer.parseInt(Reg[2]) >= 30 && Integer.parseInt(Reg[2]) < 50) {
                i = Integer.parseInt(Reg[3]) * 0.35;
            } else if (Integer.parseInt(Reg[2]) >= 51 && Integer.parseInt(Reg[2]) < 100) {
                i = Integer.parseInt(Reg[3]) * 0.4;
            } else if (Integer.parseInt(Reg[2]) >= 101) {
                i = Integer.parseInt(Reg[3]) * 0.4;
            } else {
                i = Integer.parseInt(Reg[3]) * 0.3;
            }
            Sueldo.add(new String[]{Reg[0], Reg[1], Reg[2], Reg[3], (i - i * 0.08) + ""});
        }
        return Sueldo;
    }

    public String[] GenerarSueldo(String Codigo) {
        ArrayList<String[]> Sueldo = GenerarSueldo();
        for (String[] ti : Sueldo) {
            if (Codigo.equals(ti[1])) {
                return ti;
            }
        }
        return null;
    }

    public ArrayList<String[]> Mayores() {
        ArrayList<String[]> Sueldos = GenerarSueldo();
        ArrayList<String[]> Mayores = new ArrayList<String[]>();
        for (int b = 0; b < 3; b++) {
            double mayor = 0;
            int index = -1;
            for (int i = 0; i < Sueldos.size(); i++) {
                if (Double.parseDouble(Sueldos.get(i)[4]) >= mayor) {
                    mayor = Double.parseDouble(Sueldos.get(i)[4]);
                    index = i;
                }
            }
            Mayores.add(Sueldos.get(index));
            Sueldos.remove(index);
        }
        return Mayores;
    }
}
