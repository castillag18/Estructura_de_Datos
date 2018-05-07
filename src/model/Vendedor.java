
package model;

public class Vendedor {
    
    private String Nombre;
    private String Codigo;

    public Vendedor(String Nombre, String Codigo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }
}
