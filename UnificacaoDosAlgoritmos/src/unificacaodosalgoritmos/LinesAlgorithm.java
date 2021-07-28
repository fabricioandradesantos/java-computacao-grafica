
package unificacaodosalgoritmos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author 55649
 */
public class LinesAlgorithm extends JFrame {
    
    public LinesAlgorithm(){
            this.setTitle("Algorimtos de Geração de Linhas Retas");
           this.setDefaultCloseOperation(EXIT_ON_CLOSE);
           this.setSize(300,300);
           this.setLocationRelativeTo(null);
           this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        algAnalitic(g,10,40,60,90);
        algAnalitic(g,10,40,50,100);
        algAnalitic(g,10,40,80,40);
        algAnalitic(g,10,40,10,90);
        g.setColor(Color.green);
        algDDA(g,10,40,60,90);
        algDDA(g,10,40,50,100);
        algDDA(g,10,40,80,40);
        algDDA(g,10,40,10,90);
        g.setColor(Color.blue);
        algBres(g,10,40,60,90);
        algBres(g,10,40,50,100);
        algBres(g,10,40,80,40);
        algBres(g,10,40,10,90);
        
    }
    
    public void putPixel(Graphics g, int x, int y){
        g.drawLine(x, y, x, y);
    }
    
    public void algAnalitic(Graphics g, int x1, int y1, int x2, int y2 ){
        
        float m, b,dx,dy; 
        
        dx = x2-x1;
        dy = y2-y1;
        
        m = (float) dy/dx;
        
        b = (float) (y1-m*x1);
        
        for(int x=x1; x<=x2; x++){
            int y = (int) (m*x+b);
            putPixel(g,x,y);
        }
        
    }
    
    private void algDDA(Graphics g, int x1, int y1, int x2, int y2) {
        
        int steps;
        
        float x=x1, y=y1, incX, incY;
        
        int dx = x2-x1;
        int dy = y2-y1;
        
        if( Math.abs(dx) > Math.abs(dy) ){
            
            steps = Math.abs(dx);
            incX = 1;
            incY = (float) dy/dx;
            
        }else {
            steps = Math.abs(dy);
            incY = 1;
            incX = (float) dx/dy;
        }
        
        for(int i=0; i<steps; i++){
            x = x + incX;
            y = y + incY;
            
            putPixel(g,Math.round(x),Math.round(y));
        }
        
        
    }

    private void algBres(Graphics g, int x1, int y1, int x2, int y2) {
        
        int x=x1, y=y1, d=0,c,m;
        int dx = x2-x1;
        int dy = y2-y1;
        int incX = 1;
        int incY = 1;
        
        if(dx<0){
            incX = -1;
            dx -= dx;
        }
        
        if(dy<0){
            incY = -1;
            dy -= dy;
        }
        
        if(dy<=dx){
            c = 2*dx;
            m = 2*dy;
            
            if(incX<0){
                dx++;
            }
            
            for(;;){
                putPixel(g,x,y);
                if(x==x2)break;
                
                x+=incX;
                d+=m;
                
                if(d>=dx){
                    y+=incY;
                    d-=c;
                }    
            }   
        }else{
            c = 2*dy;
            m = 2*dx;
            
            if(incY<0){
                dy++;
            }
            
            for(;;){
                putPixel(g,x,y);
                if(y==y2)break;
                
                y+=incY;
                d+=m;
                
                if(d>=dy){
                    x+=incX;
                    d-=c;
                }    
            }
        }
        
    }
    
    
    
}
