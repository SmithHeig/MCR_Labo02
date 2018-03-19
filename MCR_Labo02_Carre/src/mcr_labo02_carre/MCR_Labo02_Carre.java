/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcr_labo02_carre;

import java.util.LinkedList;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author james
 */
public class MCR_Labo02_Carre {

    private static final int SIZE = 50;
    private static final int NB_SQUARE = 10;
    private static final int NB_CERCLE = 10;
  
    private static LinkedList<Shape> shapes = new LinkedList();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
        throws InterruptedException {
        AppDisplayer displayer = AppDisplayer.getInstance();
        Random randomVelocity = new Random();
        
        
        
        for(int i = 0; i < NB_SQUARE; ++i){
            shapes.add(new Square(SIZE, displayer.getWidth() /2, displayer.getHeight() /2, randomVelocity.nextInt(10), randomVelocity.nextInt(10)));
        }
        
        for(int j = 0; j < NB_CERCLE; ++j){
            shapes.add(new Cercle(SIZE, displayer.getWidth() /2, displayer.getHeight() /2, randomVelocity.nextInt(10),randomVelocity.nextInt(10)));
        }
        
        for(Shape s: shapes){
            displayer.add(s);
        }
        
        for(int k = 0; k < 10; k++){
            for(Shape s: shapes){
                s.move();
                System.out.println(s.getPosX() + " " + s.getPosY());
            }
            
            displayer.repaint();
            Thread.sleep(1000);
        }
        
    }
    
}
