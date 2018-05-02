/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import controller.Tienda_controller;
import static controller.Tienda_controller.lista_sueldo;
import java.util.ArrayList;
import javax.swing.JTable;
import model.Sueldo;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class sueldo_controller {
    
    public void Create (Sueldo sumo){
        Tienda_controller.lista_sueldo.add(sumo);
    }
    
    public void Update(int index , Sueldo sumo){
        Tienda_controller.lista_sueldo.set(index, sumo);
    }
    
    public Sueldo read (int index){
       return Tienda_controller.lista_sueldo.get(index);
       
    }
    
    public void Delete (int index){
        Tienda_controller.lista_sueldo.remove(index);
    }
    
      public ArrayList<Sueldo> Read(String Filter) {
        ArrayList<Sueldo> Get = new ArrayList<>();
        Tienda_controller.lista_sueldo.stream().filter((s1) -> (s1.getNombre_vende().contains(Filter))).forEachOrdered((s1) -> {
            Get.add(s1);
        });
        return Get;
    }
    
     public void admintabla1(javax.swing.JTable tblSueldoPagar) {
        Object[][] matriz = new Object[lista_sueldo.size()][2];
        for (int i = 0; i < lista_sueldo.size(); i++) {
            matriz[i][0] = lista_sueldo.get(i).getCodigo_vende();
            matriz[i][1] = lista_sueldo.get(i).getSueldo();
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
