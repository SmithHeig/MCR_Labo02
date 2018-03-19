/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcr_labo02_movingshapes;

import Displayer.*;
import Shape.*;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.Timer;

/**
 *
 * @author james
 */
public class MCR_Labo02_MovingShapes {
    private final int NB_CIRCLE = 10;
    private final int NB_SQUARE = 10;
    private final int MAX_SIZE = 20;
    
    private Displayer display;
    private LinkedList<Shape> shapes;
    
    public MCR_Labo02_MovingShapes(){
        display = AppDisplayer.getInstance();
        shapes = new LinkedList();
        
        for(int i = 0; i < NB_CIRCLE; ++i){
            double posX = Math.random() * display.getWidth();
            double posY = Math.random() * display.getHeight();
            double radius = Math.random() * MAX_SIZE;
            shapes.add(new Circle(posX, posY, radius));
        }
        for(int j = 0; j < NB_SQUARE; ++j){
            double posX = Math.random() * display.getWidth();
            double posY = Math.random() * display.getHeight();
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
    
    public void run(){
        while(true){
            for(Shape s : shapes) {
                s.move(display);
                System.out.println(s.getPosX() + " " + s.getPosY());
                s.paint(display.getGraphics());
            }
            display.repaint();
            try{
            Thread.sleep(50);
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
    
}
