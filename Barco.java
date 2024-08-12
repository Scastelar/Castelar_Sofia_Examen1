
package castela_sofia_examen1;

import java.util.Calendar;

 abstract class Barco {
    
    protected String nombre;
    protected Calendar fecha;
    
    public Barco(String nombre){
        this.nombre = nombre;
        this.fecha = Calendar.getInstance();
    }
            
    public final String getNombre(){
        return nombre;
    }
    
    public final Calendar getFecha(){
        return fecha;
    }
    
    public String toString(){
        return "Nombre: " + nombre;
    }
    
    public abstract void agregarElemento();
    
    public abstract double vaciarCobrar();
    
    public abstract double precioElemento();
    
}
