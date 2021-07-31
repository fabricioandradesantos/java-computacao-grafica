/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unificacaodosalgoritmos;

import javax.swing.JFrame;



/**
 *
 * @author 55649
 */
public class BoundaryFillAlgorithm extends JFrame{
    
    public BoundaryFillAlgorithm(){
         
           this.add(new DesenhaBoundaryFill());
           this.setTitle("Algoritmos de Preenchimento de Áreas - Boundary-Fill");
           this.setDefaultCloseOperation(EXIT_ON_CLOSE);
           this.setSize(300,300);
           this.setLocationRelativeTo(null);
           this.setVisible(true);
    }
    
    
}
