/**
 *
 * @author James Smith et Jérémie Chatillon
 */

package mcr_labo02_carre;

import java.awt.Graphics2D;
import java.util.LinkedList;
import javax.swing.JFrame;


public class AppDisplayer extends JFrame implements Displayer{
    private static AppDisplayer instance;
    
    private AppDisplayer(){
        super();
        this.setSize(300,300);
    }
    
    public static AppDisplayer getInstance(){
        if(instance == null){
            instance = new AppDisplayer();
        }
        return instance;
    }
    
    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D)super.getGraphics();
    }

    @Override
    public void repaint() {
        super.repaint();
    }

    @Override
    public void setTitle(String s) {
        this.setTitle(s);
    }
    
}
