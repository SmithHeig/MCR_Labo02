/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcr_labo02_carre;

import java.awt.Graphics;

/**
 *
 * @author james
 */
public class Cercle extends Shape {
    private int radius;
    
    Cercle(int raduis, int posX, int posY, int directionX, int directionY){
        super(posX, posY, directionX, directionY);
        this.radius = raduis;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
    }
}
