/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author sofialuzgalbanpatterson
 */
class AdEnvironment extends Environment {
    
    Image logo;
    
    public AdEnvironment() {
        this.setBackground(Color.WHITE);
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue_Transparent.png");
    }
    
    @Override
    public void initializeEnvironment() {
        
    }
    
    @Override
    public void timerTaskHandler() {
        
    }
    
    @Override
    public void keyPressedHandler(KeyEvent e) {
        
    }
    
    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
    }
    
    @Override
    public void environmentMouseClicked(MouseEvent e) {
        
    }
    
    @Override
    public void paintEnvironment(Graphics graphics) {
        
        graphics.setColor(Color.YELLOW);
        
        graphics.fillOval(456, 250, 100, 100);
        
        graphics.setColor(Color.MAGENTA);
        graphics.fillOval(345, 478, 100, 100);
        
        graphics.setColor(new Color(247, 137, 242));
        graphics.fillOval(467, 222, 100, 100);
        
        graphics.setColor(Color.CYAN);
        graphics.fillOval(350, 350, 100, 100);
        
        graphics.setColor (new Color (254, 138, 80)); 
        graphics.fillOval(400, 400, 100, 100);
        
        graphics.setColor(Color.red);
        graphics.fillOval(250, 250, 100, 100);
        
        graphics.setColor(new Color(247, 137, 242));
        graphics.fillOval(262, 350, 100, 100);
        
        
        graphics.setColor(Color.BLACK);
        graphics.drawString(" Here's something to brigten your day", 400, 400);
        
        if (logo != null) {
            graphics.drawImage(logo, 400, 250, 100, 100, this);
        } 
        
    }
    
}
