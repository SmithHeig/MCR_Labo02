/**
 * @file Circle.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Shape;

import java.awt.Color;
import java.awt.geom.*;
import java.util.Random;

/**
 * @class Circle - Represente un Cercle
 */
public class Circle extends Shape{
    
    /**
     * Constructeur avec paramètres
     * @param posX Position horizontal du cercle
     * @param posY Position vertical du cercle
     * @param radius Rayon du cercle
     */
    public Circle(double posX, double posY, double radius) {
        super(posX, posY, radius, radius, Color.BLUE, new Ellipse2D.Double(posX, posY, radius, radius));
    }    
}
