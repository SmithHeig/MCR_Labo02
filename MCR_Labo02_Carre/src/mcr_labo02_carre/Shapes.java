/**
 * @author James Smith et Jeremie Chatillon
 */

package mcr_labo02_carre;


public abstract class Shapes {
    //position courante
    private int posX;
    private int posY;
    //Vecteur de direction 
    private int directionX;
    private int directionY;
    
    public Shapes(int posX, int posY, int directionX, int directionY){
        this.posX = posX;
        this.posY = posY;
        this.directionX = directionX;
        this.directionY = directionY;
    }
    
    public void move(){
        // à ajouter: colision contre les mures
        posX += directionX;
        posY += directionY;
    }
    
    public int getX(){
        return posX;
    }
    
    public int getY(){
        return posY;
    }
}
