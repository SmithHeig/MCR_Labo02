/**
 * @file Shape.java
 * @author Jeremie Chatillon et James Smith
 * @date 20.03.18
 */

package Shape;

import Displayer.Displayer;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;
import javax.swing.*;

/**
 * @class abstraite représentant une forme
 * Herite de JComponent
 */
public abstract class Shape extends JComponent{
    /** ATTRIBUTS **/
    private double posX;
    private double posY;
    
    private double width;
    private double height;
    
    protected RectangularShape shape;
    
    private Color color;
    
    private Velocity velocity; // Vecteur de déplacement
    
    /**
     * Constructeur avec paramètre
     * @param posX
     * @param posY
     * @param width
     * @param height
     * @param color
     * @param shape 
     */
    public Shape(double posX,double posY, double width, double height,Color color, RectangularShape shape){
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.color = color;
        this.shape = shape;
         
        velocity = new Velocity(); // Génération d'un vecteur de déplacement aléatoire
    }
    
    /**
     * Dessiner la forme sur un Graphics
     * @param g Graphics2D sur lequel dessiner la forme
     */
    public void paint(Graphics2D g){
        g.setColor(color);
        g.fill(shape);
    }
    
    /**
     * Déplacement de la forme
     * @param dispWidth - Largeur de l'affichage
     * @param dispHeight - Largeur de l'affichage
     */
    public void move(int dispWidth, int dispHeight){
        posX += velocity.x;
        posY += velocity.y;
        
        if(posX < 0 || posX > dispWidth - this.width){
            velocity.x = -velocity.x;
        }
        if(posY < 0 || posY > dispHeight - this.height){
            velocity.y = -velocity.y;
        }
        shape.setFrame(posX, posY, width, height);
    }
    
    /**
     * Retourne la position de horizontale de la forme
     * @return double - position sur les axes des x
     */
    public double getPosX(){
        return posX;
    }
    
    /**
     * Retourne la position de verticale de la forme
     * @return double - position sur les axes des y
     */
    public double getPosY(){
        return posY;
    }
    
    
}
