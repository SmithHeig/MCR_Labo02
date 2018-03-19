/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Color;
import java.awt.geom.*;

/**
 *
 * @author james
 */
public class Square extends Shape{
    public Square(double posX, double posY, double size){
        super(posX, posY, size, size, Color.RED, new Rectangle2D.Double(posX, posY, size, size));
    }
    
}
