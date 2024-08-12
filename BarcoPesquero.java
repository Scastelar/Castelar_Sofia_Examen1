
package castela_sofia_examen1;

public class BarcoPesquero extends Barco {

    int pecesCapturados;
    TipoPesquero tipo;
    
    public BarcoPesquero(String tipo) {
        super(tipo);
        this.pecesCapturados = 0;
        this.tipo = tipo;
    }

    @Override
    public void agregarElemento() {
       pecesCapturados++; 
    }

    @Override
    public double vaciarCobrar() {
      return pecesCapturados * tipo.getPrecio();
    }
      
    

    @Override
    public double precioElemento() {
        return tipo.getPrecio();
    }
    
    public String toString(){
        return super.toString() + 
                "\nTipo: " + tipo + 
                "\nCantidad de Peces Capturados: " + pecesCapturados;
    }
    
    
    
}
