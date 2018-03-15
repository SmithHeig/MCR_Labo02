/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcr_labo02_carre;

/**
 *
 * @author james
 */
public class Cercle extends Shapes {
    private int radius;
    
    Cercle(int raduis, int posX, int posY, int directionX, int directionY){
        super(posX, posY, directionX, directionY);
        this.radius = raduis;
    }
}
