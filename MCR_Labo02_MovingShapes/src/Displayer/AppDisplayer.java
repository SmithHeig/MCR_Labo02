/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Displayer;

import Displayer.Displayer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 *
 * @author james
 */
public class AppDisplayer implements Displayer{
    private final int PREFERED_SIZE = 300;
    private static Displayer instance;
    private JFrame frame;
    private JPanel panel;
    private BufferedImage img;
    
    private AppDisplayer(){
        frame = new JFrame();
        panel = new JPanel();
        
        panel.setPreferredSize(new Dimension(PREFERED_SIZE,PREFERED_SIZE));
        panel.setBackground(Color.WHITE);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setResizable(true);
        frame.pack();
        frame.setVisible(true);
        
        img = (BufferedImage)panel.createImage(PREFERED_SIZE, PREFERED_SIZE);
        Graphics2D g = img.createGraphics();
        g.drawImage(img, null, PREFERED_SIZE, PREFERED_SIZE);
    }
    
    public static Displayer getInstance(){
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
        panel.getGraphics().drawImage(img, 0, 0, null);
        img = (BufferedImage) panel.createImage(panel.getWidth(), panel.getHeight());
        /*img = (BufferedImage) panel.createImage(panel.getWidth(), panel.getHeight());
        Graphics2D g = (Graphics2D) img.getGraphics();
        g.drawImage(img, null, 0, 0);*/
    }

    @Override
    public void setTitle(String s) {
        frame.setTitle(s);
    }
}
