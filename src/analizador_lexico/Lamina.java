package analizador_lexico;

//import java.awt.Color;
//import java.awt.geom.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);        
        
        Graphics2D g2 = (Graphics2D) g;
        /*
        Rectangle2D rectangulo = new Rectangle2D.Double(50,55,500,450);
        g2.setPaint(Color.BLACK);
        g2.draw(rectangulo);
        g2.setPaint(new Color(95,158,160));
        g2.fill(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(new Color(250,128,114));
        g2.fill(elipse);
        */
        
        Font miFuente=new Font("Times New Roman",Font.BOLD,24);
        //g2.setColor(Color.DARK_GRAY); //Quito el color, pues puse el Foreground en el constructor JFrame
        g2.setFont(miFuente);
        g2.drawString("Escriba una cadena", 50, 50);
        
        
    }
    
    
}
