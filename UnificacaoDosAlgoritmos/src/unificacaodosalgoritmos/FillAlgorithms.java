package unificacaodosalgoritmos;

import javax.swing.JFrame;

/**
 * @author 55649
 */
public class FillAlgorithms extends JFrame {
    
     public FillAlgorithms(){
         
           this.add(new DesenhaVarredura());
           this.setTitle("Algoritmos de Preenchimento de Áreas - Varredura ");
           this.setDefaultCloseOperation(EXIT_ON_CLOSE);
           this.setSize(300,300);
           this.setLocationRelativeTo(null);
           this.setVisible(true);
    }
    
    
    
    
}
