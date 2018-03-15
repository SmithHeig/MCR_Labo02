/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcr_labo02_carre;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author james
 */
public class MCR_Labo02_Carre {

    private static final int SIZE = 50;
    private static final int NB_SQUARE = 10;
    private static final int NB_CERCLE = 10;
  
    private static LinkedList<Shape> shapes;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppDisplayer displayer = AppDisplayer.getInstance();
        Random randomVelocity = new Random();
        for(int i = 0; i < NB_SQUARE; ++i){
            shapes.add(new Square(SIZE, displayer.getWidth() /2, displayer.getHeight(), randomVelocity.nextInt(10), randomVelocity.nextInt(10)));
        }
        
        for(Shape s: shapes){
            displayer.add(s);
        }
        
        displayer.setVisible(true);
    }
    
}
