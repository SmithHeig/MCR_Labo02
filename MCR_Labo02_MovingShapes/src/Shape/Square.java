/**
 * @file Square.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Shape;

import java.awt.Color;
import java.awt.geom.*;

/**
 * @class representant un carré
 */
public class Square extends Shape{
    /**
     * Constructeur avec paramètres
     * @param posX position horizontal de la forme
     * @param posY position vertical de la forme
     * @param size taille d'un coté du carré
     */
    public Square(double posX, double posY, double size){
        super(posX, posY, size, size, Color.RED, new Rectangle2D.Double(posX, posY, size, size));
    }
    
}
