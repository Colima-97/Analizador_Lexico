package analizador_lexico;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.*;

public class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Escriba una cadena", 50, 50);
        
        Graphics2D g2=(Graphics2D) g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(50,55,500,450);
        g2.setPaint(Color.BLACK);
        g2.draw(rectangulo);
        g2.setPaint(new Color(95,158,160));
        g2.fill(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(new Color(250,128,114));
        g2.fill(elipse);         
        
    }
    
    
}
