/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Somad
 */
public class Canvas extends JPanel{
    BufferedImage capture;
    
    public Canvas(BufferedImage capture) {
        this.capture = capture;
        this.setPreferredSize(new Dimension(capture.getWidth(), capture.getHeight()));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(capture, 0, 0, null);
        g.dispose();
    }
    
}
