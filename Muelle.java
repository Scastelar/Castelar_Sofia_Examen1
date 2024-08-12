
package castela_sofia_examen1;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Muelle extends JFrame {
    JButton agregarBarco = new JButton("Agregar Barco");
    JButton agregarElemento = new JButton("Agregar Elemento");
    JButton vaciar = new JButton("Vaciar Barco");

   public Muelle(){
   this.getContentPane().setLayout(null);
    this.getContentPane().setBackground(Color.white);
    setTitle("Muelle");
    setSize(300,300);
    
    
    add (agregarBarco);
    add (agregarElemento);
    add (vaciar);
       
    
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
    this.setLocationRelativeTo(this);
    this.setVisible(true);  
   }
   
    public static void main(String[] args) {
        Muelle muelle = new Muelle();
    }
    
}
