/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class MercaModel {
    
    private String Codigo;
    private String Nombre;
    private double Peso;
    private double Altura;
    private double Ancho;
    private String Color;
    private String Estado;
    private String FechaSalidaContainer;
    private String FechaInspeccionFisica;
    private String FechaRevisionLicenciaImportada;
    private String FechaImportacion;

    public MercaModel(String Codigo, String Nombre, double Peso, double Altura, double Ancho, String Color, String Estado, String FechaSalidaContainer, String FechaInspeccionFisica, String FechaRevisionLicenciaImportada, String FechaImportacion) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Ancho = Ancho;
        this.Color = Color;
        this.Estado = Estado;
        this.FechaSalidaContainer = FechaSalidaContainer;
        this.FechaInspeccionFisica = FechaInspeccionFisica;
        this.FechaRevisionLicenciaImportada = FechaRevisionLicenciaImportada;
        this.FechaImportacion = FechaImportacion;
    }

    public MercaModel() {
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getFechaSalidaContainer() {
        return FechaSalidaContainer;
    }

    public void setFechaSalidaContainer(String FechaSalidaContainer) {
        this.FechaSalidaContainer = FechaSalidaContainer;
    }

    public String getFechaInspeccionFisica() {
        return FechaInspeccionFisica;
    }

    public void setFechaInspeccionFisica(String FechaInspeccionFisica) {
        this.FechaInspeccionFisica = FechaInspeccionFisica;
    }

    public String getFechaRevisionLicenciaImportada() {
        return FechaRevisionLicenciaImportada;
    }

    public void setFechaRevisionLicenciaImportada(String FechaRevisionLicenciaImportada) {
        this.FechaRevisionLicenciaImportada = FechaRevisionLicenciaImportada;
    }

    public String getFechaImportacion() {
        return FechaImportacion;
    }

    public void setFechaImportacion(String FechaImportacion) {
        this.FechaImportacion = FechaImportacion;
    }
    
    
   
    
    
}
