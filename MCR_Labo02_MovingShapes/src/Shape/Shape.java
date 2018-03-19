/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import Displayer.Displayer;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;
import javax.swing.*;

/**
 *
 * @author james
 */
public abstract class Shape extends JComponent{
    private double posX;
    private double posY;
    
    private double width;
    private double height;
    
    protected RectangularShape shape;
    
    private Color color;
    
    private Velocity velocity;
    
    public Shape(double posX,double posY, double width, double height,Color color, RectangularShape shape){
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.color = color;
        this.shape = shape;
         
        velocity = new Velocity();
    }
    
    
    public void paint(Graphics2D g){
        g.setColor(color);
        g.fill(shape);
    }
    
    public void move(Displayer displayer){
        posX += velocity.x;
        posY += velocity.y;
        
        if(posX < 0 || posX > displayer.getWidth()){
            velocity.x = -velocity.x;
        }
        if(posY < 0 || posX > displayer.getHeight()){
            velocity.y = -velocity.y;
        }
        shape.setFrame(posX, posY, width, height);
    }
    
    public double getPosX(){
        return posX;
    }
    
    public double getPosY(){
        return posY;
    }
    
    
}
