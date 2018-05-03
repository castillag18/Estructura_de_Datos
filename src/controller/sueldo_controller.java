/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import controller.Tienda_controller;
import java.util.ArrayList;
import javax.swing.JTable;
import model.Sueldo;
import static controller.Tienda_controller.lista_vedidos;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class sueldo_controller {
    
    public void Create (Sueldo sumo){
        Tienda_controller.lista_vedidos.add(sumo);
    }
    
    public void Update(int index , Sueldo sumo){
        Tienda_controller.lista_vedidos.set(index, sumo);
    }
    
    public Sueldo read (int index){
       return Tienda_controller.lista_vedidos.get(index);
       
    }
    
    public void Delete (int index){
        Tienda_controller.lista_vedidos.remove(index);
    }
    
      public ArrayList<Sueldo> Read(String Filter) {
        ArrayList<Sueldo> Get = new ArrayList<>();
        Tienda_controller.lista_vedidos.stream().filter((s1) -> (s1.getNombre_vende().contains(Filter))).forEachOrdered((s1) -> {
            Get.add(s1);
        });
        return Get;
    }
    
     public void admintabla1(javax.swing.JTable tblSueldoPagar) {
        Object[][] matriz = new Object[lista_vedidos.size()][2];
        for (int i = 0; i < lista_vedidos.size(); i++) {
            matriz[i][0] = lista_vedidos.get(i).getCodigo_vende();
            matriz[i][1] = lista_vedidos.get(i).getSueldo();
        }


        tblSueldoPagar.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Codigo", "Sueldo"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        if (tblSueldoPagar.getColumnModel().getColumnCount() > 0) {
            tblSueldoPagar.getColumnModel().getColumn(0).setResizable(false);
            tblSueldoPagar.getColumnModel().getColumn(1).setResizable(false);
            
            

        }

    }

    public void admintabla1(JTable tblSueldoPagar, ArrayList<Sueldo> Read) {
    
    }
    

}
