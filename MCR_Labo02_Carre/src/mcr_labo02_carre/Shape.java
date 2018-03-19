/**
 * @author James Smith et Jeremie Chatillon
 */

package mcr_labo02_carre;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import javax.swing.*;


public abstract class Shape extends JComponent{
    //position courante
    protected double posX;
    protected double posY;
    //Vecteur de direction 
    private double directionX;
    private double directionY;
    
    private Color color;
    
    protected RectangularShape shape;
    
    public Shape(double posX, double posY, double directionX, double directionY, Color color){
        this.posX = posX;
        this.posY = posY;
        this.directionX = directionX;
        this.directionY = directionY;
    }
    
    public void move(){
        // à ajouter: colision contre les mures
        posX += directionX;
        posY += directionY;
        // géré avec la taille de la forme
        if(posX < 0 || posX > AppDisplayer.getInstance().getWidth()){
            directionX = -directionX;
        }
        if(posY < 0 || posY > AppDisplayer.getInstance().getHeight()){
            directionY = -directionY;
        }
    }
    
    public double getPosX(){
        return posX;
    }
    
    public double getPosY(){
        return posY;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.draw(shape);
   }
    
    
}
