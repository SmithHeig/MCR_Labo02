/**
 *
 * @author James Smith et Jérémie Chatillon
 */

package mcr_labo02_carre;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import javax.swing.*;


public class AppDisplayer extends JFrame implements Displayer{
    private static AppDisplayer instance;
    private JPanel panel;
    private BufferedImage img;
    
    private AppDisplayer(){
        super();
        panel = new JPanel();
        
        panel.setBackground(Color.WHITE);
        
        this.setPreferredSize(new Dimension(300,300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.getContentPane().add(panel, BorderLayout.CENTER);
        this.setResizable(true);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        
        img = (BufferedImage)panel.createImage(300,300);
        
    }
    
    public static AppDisplayer getInstance(){
        if(instance == null){
            instance = new AppDisplayer();
        }
        return instance;
    }
    
    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) img.getGraphics();
    }

    @Override
    public void repaint() {
        super.repaint();
        img = (BufferedImage) panel.createImage(panel.getWidth(), panel.getHeight());
        panel.getGraphics().drawImage(img, 0, 0, null);
    }

    @Override
    public void setTitle(String s) {
        super.setTitle(s);
    }
    
}
