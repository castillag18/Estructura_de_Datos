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
public class tienda {

    private String Codigo_del_vende;
    private String Codigo_comprador;
    private String Codigo_del_prod;
    private int Precio_unidad;
    private int Cantidad_vendida;
    private int total_compra;

    private String Nombre_vende;
    private int Cantidades_totales_vendidas;
    private double Total_Vendido_en_pesos;

    public tienda(String Codigo_del_vende, String Codigo_comprador, String Codigo_del_prod, int Precio_unidad, int Cantidad_vendida, int total_compra, String Nombre_vende, String Codigo_vende, int Cantidades_totales_vendidas, double Total_Vendido_en_pesos) {
        this.Codigo_del_vende = Codigo_del_vende;
        this.Codigo_comprador = Codigo_comprador;
        this.Codigo_del_prod = Codigo_del_prod;
        this.Precio_unidad = Precio_unidad;
        this.Cantidad_vendida = Cantidad_vendida;
        this.total_compra = total_compra;
        this.Nombre_vende = Nombre_vende;
        
        this.Cantidades_totales_vendidas = Cantidades_totales_vendidas;
        this.Total_Vendido_en_pesos = Total_Vendido_en_pesos;
    }

    public tienda() {

    }

    public tienda(String Codigo_del_vende, String Codigo_comprador, String Codigo_del_prod, int Precio_unidad, int Cantidad_vendida) {
        this.Codigo_del_vende = Codigo_del_vende;
        this.Codigo_comprador = Codigo_comprador;
        this.Codigo_del_prod = Codigo_del_prod;
        this.Precio_unidad = Precio_unidad;
        this.Cantidad_vendida = Cantidad_vendida;
    }

    public tienda(String Nombre_vende, String Codigo_vende, int Cantidades_totales_vendidas, double Total_Vendido_en_pesos) {
        this.Nombre_vende = Nombre_vende;
        
        this.Cantidades_totales_vendidas = Cantidades_totales_vendidas;
        this.Total_Vendido_en_pesos = Total_Vendido_en_pesos;
    }

    public tienda(String Codigo_del_vende, double Total_Vendido_en_pesos, int Cantidades_totales_vendidas) {
        this.Codigo_del_vende = Codigo_del_vende;
        this.Total_Vendido_en_pesos = Total_Vendido_en_pesos;
        this.Cantidades_totales_vendidas = Cantidades_totales_vendidas;
    }

    public String getCodigo_del_vende() {
        return Codigo_del_vende;
    }

    public void setCodigo_del_vende(String Codigo_del_vende) {
        this.Codigo_del_vende = Codigo_del_vende;
    }

    public String getCodigo_comprador() {
        return Codigo_comprador;
    }

    public void setCodigo_comprador(String Codigo_comprador) {
        this.Codigo_comprador = Codigo_comprador;
    }

    public String getCodigo_del_prod() {
        return Codigo_del_prod;
    }

    public void setCodigo_del_prod(String Codigo_del_prod) {
        this.Codigo_del_prod = Codigo_del_prod;
    }

    public int getPrecio_unidad() {
        return Precio_unidad;
    }

    public void setPrecio_unidad(int Precio_unidad) {
        this.Precio_unidad = Precio_unidad;
    }

    public int getCantidad_vendida() {
        return Cantidad_vendida;
    }

    public void setCantidad_vendida(int Cantidad_vendida) {
        this.Cantidad_vendida = Cantidad_vendida;
    }

    public int getTotal_compra() {
        return total_compra;
    }

    public void setTotal_compra(int total_compra) {
        this.total_compra = total_compra;
    }

    public String getNombre_vende() {
        return Nombre_vende;
    }

    public void setNombre_vende(String Nombre_vende) {
        this.Nombre_vende = Nombre_vende;
    }   

 
    public int getCantidades_totales_vendidas() {
        return Cantidades_totales_vendidas;
    }

    public void setCantidades_totales_vendidas(int Cantidades_totales_vendidas) {
        this.Cantidades_totales_vendidas = Cantidades_totales_vendidas;
    }

    public double getTotal_Vendido_en_pesos() {
        return Total_Vendido_en_pesos;
    }

    public void setTotal_Vendido_en_pesos(double Total_Vendido_en_pesos) {
        this.Total_Vendido_en_pesos = Total_Vendido_en_pesos;
    }
    
    

}
