package Controller;

import Model.Container;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ContainerController {

    Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
    
    Stack<Container> pila = new Stack<Container>();
    Queue<Container> Salida = new LinkedList();
    Queue<Container> inspeccion = new LinkedList();
    Queue<Container> RevisionLicencia = new LinkedList();
    Queue<Container> Importacion = new LinkedList();
    List<Container> Nacionalizada = new ArrayList();
    
    public String Date() {
        String fechaTexto;
        return fechaTexto = formato.format(fecha);
    }

    public void create(Container n1) {
        pila.push(n1);
    }
    
    public void Salida(){
        Salida.offer(new Container(
            pila.get(pila.size()-1).getCodigo(),
            pila.get(pila.size()-1).getNombre(),
            pila.get(pila.size()-1).getPeso(),
            pila.get(pila.size()-1).getAltura(),
            pila.get(pila.size()-1).getColor(),
            Date(),
            pila.get(pila.size()-1).getFInspeccFisica(),
            pila.get(pila.size()-1).getFrevisionLic(),
            pila.get(pila.size()-1).getFimportacion()
        ));
        pila.pop();
    }
    
    public void inspeccion(){
        inspeccion.offer(new Container(
            Salida.peek().getCodigo(),
            Salida.peek().getNombre(),
            Salida.peek().getPeso(),
            Salida.peek().getAltura(),
            Salida.peek().getColor(),
            Salida.peek().getFSalidaCont(),
            Date(),
            Salida.peek().getFrevisionLic(),
            Salida.peek().getFimportacion()
        ));
        Salida.poll();
    }
    
    public void RevisionLicencia(){
        RevisionLicencia.offer(new Container(
            inspeccion.peek().getCodigo(),
            inspeccion.peek().getNombre(),
            inspeccion.peek().getPeso(),
            inspeccion.peek().getAltura(),
            inspeccion.peek().getColor(),
            inspeccion.peek().getFSalidaCont(),
            inspeccion.peek().getFInspeccFisica(),
            Date(),
            inspeccion.peek().getFimportacion()
        ));
        inspeccion.poll();
    }
    
    public void Nacionalizada(){
        Nacionalizada.add(new Container(
            RevisionLicencia.peek().getCodigo(),
            RevisionLicencia.peek().getNombre(),
            RevisionLicencia.peek().getPeso(),
            RevisionLicencia.peek().getAltura(),
            RevisionLicencia.peek().getColor(),
            RevisionLicencia.peek().getFSalidaCont(),
            RevisionLicencia.peek().getFInspeccFisica(),
            RevisionLicencia.peek().getFrevisionLic(),
            Date()
        ));
        RevisionLicencia.poll();
    }
    
    public Stack<String[]> leerMercancia() {
        Stack<String[]> Get = new Stack();
        pila.forEach((item) -> {
            Get.add(new String[]{
                item.getCodigo(),
                item.getNombre(),
                item.getPeso(),
                item.getAltura(),
                item.getColor()
            });
        });
        return Get;
    }
    
    public ArrayList<String[]> leerInspeccion(){
        ArrayList<String[]> get = new ArrayList();
        Salida.forEach((item) ->{
            get.add(new String[]{
                item.getCodigo(),
                item.getNombre(),
                item.getFSalidaCont(),
                item.getFInspeccFisica(),
                item.getFrevisionLic(),
                item.getFimportacion()
            });
        });
        inspeccion.forEach((item) ->{
            get.add(new String[]{
                item.getCodigo(),
                item.getNombre(),
                item.getFSalidaCont(),
                item.getFInspeccFisica(),
                item.getFrevisionLic(),
                item.getFimportacion()
            });
        });
        RevisionLicencia.forEach((item) ->{
            get.add(new String[]{
                item.getCodigo(),
                item.getNombre(),
                item.getFSalidaCont(),
                item.getFInspeccFisica(),
                item.getFrevisionLic(),
                item.getFimportacion()
            });
        });
        Importacion.forEach((item) ->{
            get.add(new String[]{
                item.getCodigo(),
                item.getNombre(),
                item.getFSalidaCont(),
                item.getFInspeccFisica(),
                item.getFrevisionLic(),
                item.getFimportacion()
            });
        });
        Nacionalizada.forEach((item) ->{
            get.add(new String[]{
                item.getCodigo(),
                item.getNombre(),
                item.getFSalidaCont(),
                item.getFInspeccFisica(),
                item.getFrevisionLic(),
                item.getFimportacion()
            });
        });
        
        return get;
    }

    
      
    
}
