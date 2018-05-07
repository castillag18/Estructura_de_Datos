/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Sueldo extends tienda{
    private double sueldo;

    public Sueldo(double sueldo, String Codigo_del_vende, int Total_cantidades_vendidas, double Total_Vendido_en_pesos, String Nombre_vende) {
        super(Codigo_del_vende, Total_Vendido_en_pesos, Total_cantidades_vendidas, Nombre_vende);
        this.sueldo = sueldo;
    }

    public Sueldo() {
    }
    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
        

    
    
    
}
