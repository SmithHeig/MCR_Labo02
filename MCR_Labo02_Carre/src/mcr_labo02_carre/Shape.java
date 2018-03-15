/**
 * @author James Smith et Jeremie Chatillon
 */

package mcr_labo02_carre;

import java.awt.*;
import javax.swing.*;


public abstract class Shape extends JPanel{
    //position courante
    protected int posX;
    protected int posY;
    //Vecteur de direction 
    private int directionX;
    private int directionY;
    
    public Shape(int posX, int posY, int directionX, int directionY){
        this.posX = posX;
        this.posY = posY;
        this.directionX = directionX;
        this.directionY = directionY;
    }
    
    public void move(){
        // à ajouter: colision contre les mures
        posX += directionX;
        posY += directionY;
    }
    
    public int getX(){
        return posX;
    }
    
    public int getY(){
        return posY;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
   }
    
    
}
