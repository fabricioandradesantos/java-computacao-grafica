 
package unificacaodosalgoritmos;

import javax.swing.JFrame;

/**
 *
 * @author 55649
 */

public class CircumferencesAlgorithm extends JFrame {
    
    public CircumferencesAlgorithm(){
         
           this.add(new DesenhaCircumferences());
           this.setTitle("Algoritmos de Geração de Circunferências");
           this.setDefaultCloseOperation(EXIT_ON_CLOSE);
           this.setSize(300,300);
           this.setLocationRelativeTo(null);
           this.setVisible(true);
    }
    
}
