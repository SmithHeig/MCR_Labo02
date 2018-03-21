/**
 * @file AppDisplayer.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package mcr_labo02_movingshapes;

import Displayer.*;
import Shape.*;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import javax.swing.Timer;

/**
 * Main class
 */
public class MCR_Labo02_MovingShapes{
    /** CONSTANTE **/
    private final int NB_CIRCLE = 50;
    private final int NB_SQUARE = 50;
    
    /** ATTRIBUT **/
    private Displayer display;
    private LinkedList<Shape> shapes;
    
    
    /**
     * Constructeur
     */
    public MCR_Labo02_MovingShapes(){
        display = AppDisplayer.getInstance(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                return;
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
        
                switch(key){
                    case KeyEvent.VK_F: 
                        for(int i = 0; i < NB_CIRCLE; ++i){
                            shapes.add(new Circle(display.getWidth(), display.getHeight()));
                        }
                        for(int j = 0; j < NB_SQUARE; ++j){
                            shapes.add(new Square(display.getWidth(), display.getHeight()));
                        }
                        break;
                    case KeyEvent.VK_B:
                        System.out.println("todo - Bordered Shapes");
                        break;
                    case KeyEvent.VK_E:
                        shapes.clear();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                return;
            }
        });
        
        shapes = new LinkedList();        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MCR_Labo02_MovingShapes app = new MCR_Labo02_MovingShapes();
        app.run();
        
        
        }
    
    /**
     * Fonction qui fait bouger les éléments
     */
    public void run(){
        ActionListener actionLinstener = e -> {
            for(Shape s : shapes) {
                s.move(display.getWidth(), display.getHeight());
                s.paint(display.getGraphics());
            }
            display.repaint();
        };

        Timer t = new Timer(50, actionLinstener);
        t.start();

    }
}
