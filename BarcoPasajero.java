
package castela_sofia_examen1;

import javax.swing.JOptionPane;


public class BarcoPasajero extends Barco {
    
    private String[] pasajeros;
    private double precioBoleto;
    private int contador;
    
    public BarcoPasajero(String nombre,int precioBoleto) {
        super(nombre);
        this.pasajeros = new String[100]; 
        this.precioBoleto = precioBoleto;
        this.contador = 0;
    }

    @Override
    public void agregarElemento() {
        for (int i = 0; i < 100; i++){
        String name = JOptionPane.showInputDialog("Ingrese nombre del pasajero: ");
        pasajeros[i]=name;
        contador++;
        }
    }
            

    @Override
    public double vaciarCobrar() {
        
        return precioBoleto*contador;
        
    }

    @Override
    public double precioElemento() {
        return precioBoleto;
    }
    
      public String toString(){
        return super.toString() +  
        "Cantidad de Pasajeros que compraron boleto: #" + contador;
      }
      
      
    
}
