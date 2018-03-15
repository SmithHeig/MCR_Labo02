/**
 *
 * @author James Smith et Jérémie Chatillon
 */

package mcr_labo02_carre;

import java.awt.Graphics2D;
import javax.swing.JFrame;


public class AppDisplayer extends JFrame implements Displayer{
    private static AppDisplayer instance;
    
    private AppDisplayer(){
        super();
    }
    
    public static AppDisplayer getInstance(){
        if(instance == null){
            instance = new AppDisplayer();
        }
        return instance;
    }
    
    @Override
    public int getWidth() {
        return this.getWidth();
    }

    @Override
    public int getHeight() {
        return this.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return this.getGraphics();
    }

    @Override
    public void repaint() {
        this.repaint();
    }

    @Override
    public void setTitle(String s) {
        this.setTitle(s);
    }
    
}
