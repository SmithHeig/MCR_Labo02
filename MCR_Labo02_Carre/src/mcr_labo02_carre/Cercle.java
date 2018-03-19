/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcr_labo02_carre;

import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author james
 */
public class Cercle extends Shape {
    private double radius;
    
    Cercle(double raduis, double posX, double posY, double directionX, double directionY){
        super(posX, posY, directionX, directionY, Color.RED);
        this.radius = raduis;
        shape = new Ellipse2D.Double(posX, posY, radius, radius);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);        
    }
}
