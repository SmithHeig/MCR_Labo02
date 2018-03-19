/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Color;
import java.awt.geom.*;
import java.util.Random;

/**
 *
 * @author james
 */
public class Circle extends Shape{
    
    public Circle(double posX, double posY, double radius) {
        super(posX, posY, radius, radius, Color.BLUE, new Ellipse2D.Double(posX, posY, radius, radius));
    }    
}
