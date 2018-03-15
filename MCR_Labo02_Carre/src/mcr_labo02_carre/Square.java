/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcr_labo02_carre;

import java.awt.*;

/**
 *
 * @author james
 */
public class Square extends Shape{
    private final int size;
    
    public Square(int size,int posX, int posY, int directionX, int directionY) {
        super(posX, posY, directionX, directionY);
        this.size = size;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(posX, posY, size, size);
    }
      
}
