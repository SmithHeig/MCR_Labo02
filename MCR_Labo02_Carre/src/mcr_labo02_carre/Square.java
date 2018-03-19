/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcr_labo02_carre;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * @author james
 */

public class Square extends Shape{
    private final double size; // a reflechir
    
    public Square(double size,double posX, double posY, double directionX, double directionY) {
        super(posX, posY, directionX, directionY, Color.BLUE);
        this.size = size;
        shape = new Rectangle2D.Double(posX, posY,size,size);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
      
}
