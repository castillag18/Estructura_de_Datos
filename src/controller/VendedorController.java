package controller;

import java.util.ArrayList;
import model.Vendedor;

public class VendedorController {

    static ArrayList<Vendedor> Lista_Vendedor = new ArrayList<Vendedor>();

    public void Create(Vendedor vende) {
        Lista_Vendedor.add(vende);
    }

    public Vendedor Read(String Codigo) {
        for (Vendedor x : Lista_Vendedor) {
            if (x.getCodigo().equals(Codigo)) {
                return x;
            }
        }
        return null;
    }

    public ArrayList<Vendedor> getLista_Vendedor() {
        return Lista_Vendedor;
    }
    
    
}
