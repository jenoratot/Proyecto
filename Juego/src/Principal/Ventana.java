
package Principal;

import javax.swing.JFrame;
import Clases.Dibuja;

public class Ventana {

    JFrame miventana;
    public Ventana()
            {
                Dibuja Odibuja = new Dibuja();
                miventana = new JFrame("Operacion Hacker");
                miventana.setSize(500,500);
                miventana.add(Odibuja);
                miventana.setVisible(true); 
                miventana.setLocationRelativeTo(null);
                miventana.setResizable(false);
                miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                                        
            }
    public static void main (String Est[])
    {
        new Ventana();
    }
  
    
}
