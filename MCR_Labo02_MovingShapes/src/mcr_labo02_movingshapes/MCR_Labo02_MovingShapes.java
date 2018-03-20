/**
 * @file AppDisplayer.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package mcr_labo02_movingshapes;

import Displayer.*;
import Shape.*;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.Timer;

/**
 * Main class
 */
public class MCR_Labo02_MovingShapes {
    /** CONSTANTE **/
    private final int NB_CIRCLE = 10;
    private final int NB_SQUARE = 10;
    private final int MAX_SIZE = 20;
    
    /** ATTRIBUT **/
    private Displayer display;
    private LinkedList<Shape> shapes;
    
    /**
     * Constructeur
     */
    public MCR_Labo02_MovingShapes(){
        display = AppDisplayer.getInstance();
        shapes = new LinkedList();
        
        for(int i = 0; i < NB_CIRCLE; ++i){
            double posX = Math.random() * (display.getWidth()- MAX_SIZE);
            double posY = Math.random() * (display.getHeight()- MAX_SIZE);
            double radius = Math.random() * MAX_SIZE;
            shapes.add(new Circle(posX, posY, radius));
        }
        for(int j = 0; j < NB_SQUARE; ++j){
            double posX = Math.random() * (display.getWidth() - MAX_SIZE);
            double posY = Math.random() * (display.getHeight()- MAX_SIZE);
            double size = Math.random() * MAX_SIZE;
            shapes.add(new Square(posX, posY, size));
        }
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
