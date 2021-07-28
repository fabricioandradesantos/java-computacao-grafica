package unificacaodosalgoritmos;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author 55649
 */
public class Menu  extends JFrame{
    
    JMenuBar barra = new JMenuBar();
    JMenu menuPrimitivas = new JMenu("Primitivas");
    JMenu menuCores = new JMenu("Cores");
    
    JMenu menuLinhas = new JMenu("Linhas");
    JMenu menuPoligonos = new JMenu("Polígonos");
    JMenu menuCirculos = new JMenu("Círculos");
    
    JMenuItem menuAnalitico = new JMenuItem("Analítico");
    JMenuItem menuDDA = new JMenuItem("DDA");
    JMenuItem menuBresenham = new JMenuItem("Bresenham");
    
    JMenuItem menuVarredura = new JMenuItem("Varredura");
    JMenuItem menuBoundaryFill = new JMenuItem("BoundaryFill");
    JMenuItem menuAnaliseGeometrica = new JMenuItem("Análise Geométrica");
    
    JMenuItem menuParametrica = new JMenuItem("Paramétrica");
    JMenuItem menuIncrementalcomSimetria = new JMenuItem("Incremental com Simetria");
    JMenuItem menuCirculoBresenham = new JMenuItem("Bresenham");
    
    JMenuItem menuVermelho = new JMenuItem("Vermelho");
    JMenuItem menuVerde = new JMenuItem("Verde");
    JMenuItem menuAzul = new JMenuItem("Azul");
    
    
       public Menu(){
           
           JFrame janela = new JFrame();
           
           janela.setJMenuBar(barra);
           barra.add(menuPrimitivas);
           barra.add(menuCores);
           
           menuPrimitivas.add(menuLinhas);
           menuLinhas.add(menuAnalitico);
           menuLinhas.add(menuDDA);
           menuLinhas.add(menuBresenham);
           
           menuPrimitivas.add(menuPoligonos);
           menuPoligonos.add(menuVarredura);
           menuPoligonos.add(menuBoundaryFill);
           menuPoligonos.add(menuAnaliseGeometrica);
                   
                   
           menuPrimitivas.add(menuCirculos);
           menuCirculos.add(menuParametrica);
           menuCirculos.add(menuIncrementalcomSimetria);
           menuCirculos.add(menuCirculoBresenham);
           
           menuCores.add(menuVermelho);
           menuCores.add(menuVerde);
           menuCores.add(menuAzul);
             
           janela.setTitle("Menu");
           janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
           janela.setSize(600,400);
           janela.setLocationRelativeTo(null);
           janela.setVisible(true);
           
       } 
    
}
