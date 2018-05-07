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

    private String Codigo_comprador;
    private String Codigo_del_prod;
    private int Precio_unidad;
    private int Cantidad_vendida;
    private Vendedor Vende;

    public tienda(Vendedor Vende, String Codigo_comprador, String Codigo_del_prod, int Precio_unidad, int Cantidad_vendida) {
        this.Vende = Vende;
        this.Codigo_comprador = Codigo_comprador;
        this.Codigo_del_prod = Codigo_del_prod;
        this.Precio_unidad = Precio_unidad;
        this.Cantidad_vendida = Cantidad_vendida;
    }

    public tienda() {

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

    public Vendedor getVende() {
        return Vende;
    }
    
    
}
