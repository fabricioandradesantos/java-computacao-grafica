


package unificacaodosalgoritmos;

import javax.swing.JFrame;

/**
 *
 * @author 55649
 */
public class GeometricAnalysisAlgorithm extends JFrame {
    
    public GeometricAnalysisAlgorithm(){
         
           this.add(new DesenhaGeometricAnalysis());
           this.setTitle("Algoritmos de Preenchimento de Áreas - Analise Geometrica");
           this.setDefaultCloseOperation(EXIT_ON_CLOSE);
           this.setSize(300,300);
           this.setLocationRelativeTo(null);
           this.setVisible(true);
    }
    
}
