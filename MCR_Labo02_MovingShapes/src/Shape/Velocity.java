/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author james
 */
public class Velocity {
    public double x;
    public double y;
    private final double MAX_SPEED = 10;
    
    public Velocity(){
        double angle = Math.toRadians(Math.random() * 360.0);
        double length = Math.random() * MAX_SPEED; //speed
        
        x = Math.cos(angle) * length;
        y = Math.sin(angle) * length;
    }    
}
