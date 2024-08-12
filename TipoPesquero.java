
package castela_sofia_examen1;


public enum TipoPesquero {
    
    PEZ(20),
    CAMARON(30),
    LANGOSTA(50);
    
    private int price;
    
    
    TipoPesquero(int price){
        this.price = price;
    }
    
    public int getPrecio(){
        return price;
    }
}
